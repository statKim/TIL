import requests
import json
import time

url = "https://api.telegram.org/bot"
token = "587628920:AAHrABKvEq6L_N00TQkt_24veOmaFRFyNhs"
response = requests.get(url + token + "/getMe")
print(response.text)

# # sendMessage를 하는 요청을 보내서 텔레그램 메세지를 보내보기
# id = "656293168"
# msg = "제발 좀 돼라"
# #print(url + token + "/getMessage?chat_id=" + id + "&text=" + msg)
# requests.get(url + token + "/sendMessage?chat_id=" + id + "&text=" + msg)

def send(msg):
    url = "https://api.telegram.org/bot"
    token = "587628920:AAHrABKvEq6L_N00TQkt_24veOmaFRFyNhs"
    id = "656293168"
    #requests.get(url + token + "/sendMessage?chat_id=" + id + "&text=" + msg)
    requests.get(url + token + "/sendMessage?chat_id={}&text={}".format(id, msg))

msg = "ㅇㅋ"
while True:
    send(msg)
    # 5초간 쉬어라
    time.sleep(5)