from flask import Flask, render_template, request
import requests
import bs4

app = Flask(__name__)

@app.route("/")
def hello():
    return "hello"
    
@app.route("/<name>")
def john(name):
    return "hello {}".format(name)
    
@app.route("/cube/<num>")
def cube(num):
    result = int(num) ** 3
    return str(result)
    
# html 파일을 return => Flask의 형식을 꼭 지켜야함!!(폴더명도 templates)
@app.route("/show")
def show():
    return render_template("index.html")
    
@app.route("/lol")
def lol():
    return render_template("lol.html")
    
@app.route("/stat")
def stat():
    id = request.args.get("id")
    print(id) # 콘솔에 출력
    # id에 담긴 정보를 가지고 
    url = "http://www.op.gg/summoner/userName="
    response = requests.get(url + id)
    html = bs4.BeautifulSoup(response.text)
    win = html.select_one("#SummonerLayoutContent > div.tabItem.Content.SummonerLayoutContent.summonerLayout-summary > div.SideContent > div.TierBox.Box > div.SummonerRatingMedium > div.TierRankInfo > div.TierInfo > span.WinLose > span.wins")
    loss = html.select_one("#SummonerLayoutContent > div.tabItem.Content.SummonerLayoutContent.summonerLayout-summary > div.SideContent > div.TierBox.Box > div.SummonerRatingMedium > div.TierRankInfo > div.TierInfo > span.WinLose > span.losses")
    # op.gg에 요청을 보내 전적을 가지고 와서 
    # 그 중에서 win & loss 정보만 받아온다.
    return render_template("stat.html", id = id, win = win.text, loss = loss.text)