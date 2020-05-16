# Git Knowledge

1. git add . 命令出现error: XXX(xxx代指路径) does not have a commit checked out 删掉隐藏文件.git  
    >- If you have a subdirectory with a .git directory and try to git add . you will see this message. This can happen if you have a git repo and then create/clone another repo in a subdirectory under that repo.

2. git repository中子文件夹不要使用git init 命令 , 会造成不必要的麻烦

3. git push 不能提交空目录,当创建一个目录后,需要填充文件 哪怕是一个readme.md也可以

4. 