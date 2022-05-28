# user-interface
<h3>이 repository는 user-interface를 구현하여 협업하는 repository입니다.</h3>

<h2>Repository 사용법</h2>    
개인이 구현한 기능명으로 branch를 생성하여 파일 올리기. 

- **git init** -> "해당 폴더를 git으로 버전관리 하겠다." 명령어. 하지만 우리는 clone을 해서 만들어진 폴더에서 버전관리 하는 것이기 때문에 이미 버전관리 진행중임. .git파일이 버전을 관리하는 파일. 
- **git branch 브랜치명** -> 브랜치를 생성한다. 브랜치명은 영어로 띄어쓰기 없이 본인 이름으로. ex) git branch main_page
- **git checkout 브랜치명** -> 해당 브랜치로 이동. 
- **git add 파일명** -> 해당 파일을 staging area로 올린다. ex) git add 연결리스트.c  / 또는 **git add .** 이렇게 하면 모든 파일을 staging area로 올림
- **git commit -m "커밋메세지(뭐 수정했는지)"**  
- **git remote add origin 여기 레포지토리 주소** 
- **git branch** -> push 하기 전에 마지막으로 branch 확인. 현재 작업중인 branch 출력됨.
- **git push origin 브랜치명** : 원격저장소에 push한다. ex) git push origin main_page

