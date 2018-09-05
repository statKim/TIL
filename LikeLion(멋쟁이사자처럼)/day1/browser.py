import webbrowser

#webbrowser.open("http://www.naver.com")

#webbrowser.open("https://search.naver.com/search.naver?query=아이유")
# ls = ["아이유", "수지", "설현"]
# for name in ls:
#     url = "https://search.naver.com/search.naver?query=" + name
#     webbrowser.open(url)

# 또 다른 방법
url = "https://search.naver.com/search.naver?query="
keywords = ["아이유", "수지", "설현"]
for name in keywords:
    webbrowser.open(url + name)
