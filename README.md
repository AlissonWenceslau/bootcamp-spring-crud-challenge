# Desafio#1 bootcamp spring 3.0

![Untitled](img/Untitled.png)

Este é um desafio proposto pela DevSuperior referente ao capítulo **01.CRUD**

## Enunciado

Você deverá entregar um projeto Spring Boot 2.4.x ou superior contendo um CRUD completo
de web services REST para acessar um recurso de clientes, contendo as cinco operações
básicas aprendidas no capítulo:

- Busca paginada de recursos
- Busca de recurso por id
- Inserir novo recurso
- Atualizar recurso
- Deletar recurso

O projeto deverá estar com um ambiente de testes configurado acessando o banco de dados
H2, deverá usar Maven como gerenciador de dependência, e Java 11 ou 17 como linguagem.

Um cliente possui nome, CPF, renda, data de nascimento, e quantidade de filhos. A
especificação da entidade Client é mostrada a seguir (você deve seguir à risca os nomes de
classe e atributos mostrados no diagrama):

![Untitled](img/Untitled%201.png)

Seu projeto deverá fazer um seed de pelo menos 10 clientes com dados SIGNIFICATIVOS
(não é para usar dados sem significado como “Nome 1”, “Nome 2”, etc.).

**Atenção**: crie um novo projeto para este trabalho. Não é para simplesmente
acrescentar a classe Client no DSCatalog feitos nas aulas.

**Atenção**: lembre-se de que por padrão a JPA transforma nomes de atributos em
camelCase para snake_case, como foi o caso do campo imgUrl do DSCatalog, que no
banco de dados tinha o nome img_Url. Assim, o campo birthDate acima será criado
no banco de dados como birth_Date, então seu script SQL deverá seguir este
padrão.

**Atenção**: cuidado para não salvar no seu projeto arquivos e pastas que não devem ser
salvas no Git, tais como a pasta .metadata do Eclipse.

## Técnologias empregadas

- Spring Boot
- Spring Data
- Spring Web
- H2 Database

## Endpoints postman

**Busca paginada de recursos**

![Untitled](img/Untitled%202.png)

**Inserir novo recurso**

![Untitled](img/Untitled%203.png)

**Busca de recurso por id**

![Untitled](img/Untitled%204.png)

**Atualizar recurso**

![Untitled](img/Untitled%205.png)

**Deletar recurso**

![Untitled](img/Untitled%206.png)

**Tratamento de exceções**

Se um id não existir, a API retorna com uma mensagem de exceção personalizada retornando o código 404. A pesquisa pelo código 16 foi feita após ser deletado, veja abaixo:

![Untitled](img/Untitled%207.png)

## Banco de dados H2

![Untitled](img/Untitled%208.png)