# -*- coding: utf-8 -*-
# utf-8로 해주면 한글 써도 에러 안남
from flask import Flask, render_template, request
import random
import csv
from faker import Faker

app = Flask(__name__)
faker = Faker("ko-KR") # 한글 fake 데이터 만들어줌

@app.route("/")
def index():
    return render_template("index.html")
    
@app.route("/result")
def result():
    #1. "/" 날아온 이름 두개를 가져온다
    name1 = request.args.get("name1")
    name2 = request.args.get("name2")
    #2. 궁합을 사기친다(50~100 사이의 숫자를 랜덤하게 뽑음)
    match = random.randrange(50, 101)
    # names.csv 파일을 만들어서 저장
    f = open("names.csv", "a", encoding="utf-8")
    a = csv.writer(f)
    a.writerow([name1, name2, match])
    f.close()
    return render_template("result.html", name1=name1, name2=name2, match=match)
    
@app.route("/admin")
def admin():
    # names에 들어가 있는 모든 이름을 출력
    f = open("names.csv", "r")
    rr = csv.reader(f)
    names = rr
    return render_template("admin.html", names=names)
    
@app.route("/ffaker")
def ffaker():
    name = faker.name()
    address = faker.address()
    job = faker.job()
    return render_template("ffaker.html", name=name, address=address, job=job)

# 자꾸 서버 껐다 켤 필요 없어짐!!(자동으로 재실행 해줌)
app.run(host="0.0.0.0", port="8080", debug=True)
    