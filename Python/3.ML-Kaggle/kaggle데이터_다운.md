### Kaggle에서 data 다운 받는 법!!



1. kaggle 회원가입

2. 약관 동의하기

   > 약관 동의 탭 맨 아래에 "Rules acceptance"에 있는 "I Understand and Accept" 버튼 클릭!
   >
   > - 회원가입 후 처음인 경우 전화번호 인증을 한 후에 가능하다.

3. kaggle 라이브러리 다운

   ```cmd
   pip install kaggle
   ```

4. kaggle 홈페이지에서 kaggle.json 파일 다운 받기

   > My Profile -> Account -> API 탭에서 Create New API Token 버튼 클릭

5. C:/Users/<window계정 이름>/.kaggle 내부로 파일 옮기기

6. 명령어 입력

   ```cmd
   cd (data 받을 경로)
   kaggle competitions download -c (kaggle대회명)
   # EX)
   kaggle competitions download -c santander-product-recommendation
   ```
