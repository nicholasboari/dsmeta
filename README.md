# DSmeta 
[![NPM](https://img.shields.io/npm/l/react)](https://github.com/nicholasboari/dsmeta/blob/master/LICENCE) 

# Sobre o projeto

https://dsmeta-nicholas.netlify.app

DSmeta é uma aplicação full stack web construída durante a 11ª edição da **Semana DevSuperior** (#sds11), evento organizado pela [@DevSuperior](https://devsuperior.com "Site da DevSuperior").

A aplicação consiste em uma listagem de vendas, onde os dados são admitidos pelo banco de dados, e depois são listados no app web, que também apresenta uma tabela com informações de cada vendedor. Foi utilizado também
uma SMS API da @Twilio. 

## Layout mobile
![Mobile 1](https://i.imgur.com/EDzwoCh.png)

## Layout web
![Web 1](https://i.imgur.com/zShtQqJ.png)

# Tecnologias utilizadas
## Back end
- Java
- Spring Boot
- JPA / Hibernate
- Maven
## Front end
- HTML / CSS / JS / TypeScript
- ReactJS
- Axios
## Implantação em produção
- Back end: Heroku
- Front end web: Netlify
- Banco de dados: H2 (BDA local)

# Como executar o projeto

## Back end
Pré-requisitos: Java 11

```bash
# clonar repositório
git clone git@github.com:nicholasboari/dsmeta.git 

# entrar na pasta do projeto back end
cd backend

# executar o projeto
./mvnw spring-boot:run
```

## Front end web
Pré-requisitos: npm / yarn

```bash
# clonar repositório
git clone https://github.com/devsuperior/sds1-wmazoni

# entrar na pasta do projeto front end web
cd front-web

# instalar dependências
yarn 

# executar o projeto
yarn dev
```

# Autor

Nicholas Fellipe Boari

https://www.linkedin.com/in/nicholasboari
