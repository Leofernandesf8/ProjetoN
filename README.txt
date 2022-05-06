###Setar usuário
git config --global user.name "User"

###Setar email
git config --global user.email nathams@gmail.com

###Acessar caminho da pasta
Comandos CMD -> cd..blablabla

###Criar novo repositório
git init

###Verificar estado dos arquivos/diretórios
git status

###Adicionar arquivo/diretório (staged area)
git add meu_arquivo.txt ou * para add tudo

###Comitar um arquivo
git commit -m "Meu primeiro Commit"

###Informar qual local será armazenado no GIT (Isso só na primeira vez)
git remote add origin https://github.com/Natham01/Projetos.git

###Enviar arquivos/diretórios para o repositório remoto (Isso só na primeira vez)
git push -u origin master