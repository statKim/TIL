import os
from flask import Flask, render_template, request, redirect
from flask_sqlalchemy import SQLAlchemy

app = Flask(__name__)

app.config["SQLALCHEMY_DATABASE_URI"] = "sqlite:///myapp.db"
app.config['SQLALCHEMY_TRACK_MODIFICATIONS'] = False

db = SQLAlchemy(app)

db.init_app(app)

class Post(db.Model): # db.Model을 상속받은 것
    __tablename__ = "posts"
    id = db.Column(db.Integer, primary_key=True) # sql문과 비슷한 형식!!
    title = db.Column(db.String, nullable=False)
    content = db.Column(db.String, nullable=False)

db.create_all()


@app.route("/")
def index():
    # myapp.db에 있는 모든 레코드(db의 한 행)를 불러와 보여줌
    # select * fromm posts;
    posts = Post.query.all() # 리스트 형태로 반환됨!!
    return render_template("index.html", posts=reversed(posts))
    
@app.route("/create")
def create():
    title = request.args.get("title")
    content = request.args.get("content")
    post = Post(title=title, content=content)
    db.session.add(post) # 데이터베이스에 내용 추가할거야!(session은 추가할 때마다 부르는 거라고 생각하면 됨)
    db.session.commit() # commit으로 확정시킴!(확실히 저장!)
    #return render_template("create.html", title=title, content=content)
    return redirect("/") # create.html을 거치지 않고 바로 index.html로 오는 방법
    
app.run(host=os.getenv('IP', '0.0.0.0'),port=int(os.getenv('PORT', 8080)), debug=True)