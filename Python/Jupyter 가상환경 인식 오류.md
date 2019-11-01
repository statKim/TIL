## Jupyter notebook에서 가상환경 kernel이 인식되지 않는 오류

- Terminal의 Log 메시지를 보면 **"ImportError: DLL load failed: 지정된 프로시저를 찾을 수 없습니다."**라는 오류 발생

- ##### 해결방법 - 가상환경에 `jupyter`를 설치하면 된다!!

  ```cmd
  activate 가상환경
  pip install jupyter
  ```

- [참고한 블로그](https://youngjoongkwon.com/2019/10/06/conda-가상환경에서-jupyter-notebook-사용하기/)

