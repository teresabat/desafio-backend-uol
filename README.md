# Desafio UOL Backend

## Descrição
Este projeto é uma aplicação backend desenvolvida como parte do desafio UOL. Ele fornece uma API RESTful para gerenciar [descrever a funcionalidade principal, por exemplo, "usuários, eventos, etc."].

## Instalação
Para instalar e configurar o projeto, siga os passos abaixo:

1. Clone o repositório:
    ```bash
    git clone https://github.com/teresabat/desafio-backend-uol.git
    cd desafio-backend-uol/desafio-uol-backend
    ```

2. Instale as dependências:
    ```bash
    ./mvnw install
    ```

3. Configure as variáveis de ambiente necessárias no arquivo `.env`.

4. Inicie a aplicação:
    ```bash
    ./mvnw spring-boot:run
    ```

## Uso
Uma vez que a aplicação estiver em execução, você pode acessar a API em `http://localhost:8080`. 

### Endpoints Disponíveis
- `GET /api/endpoint1` - Descrição do endpoint 1
- `POST /api/endpoint2` - Descrição do endpoint 2

## Estrutura do Projeto
A estrutura do projeto é a seguinte:

desafio-uol-backend/
│
├── src/
│ ├── main/
│ │ ├── java/
│ │ │ └── teresa/bat/desafio_uol_backend/
│ │ │ ├── controller/
│ │ │ ├── exceptions/
│ │ │ ├── infra/
│ │ │ ├── model/
│ │ │ ├── repository/
│ │ │ ├── service/
│ │ │ └── ...
│ └── test/
│ └── ...
│
├── .env
├── pom.xml
└── ...

## Contribuição
Se você quiser contribuir com este projeto, por favor siga os passos abaixo:

1. Fork o projeto
2. Crie uma branch para sua feature (`git checkout -b feature/AmazingFeature`)
3. Faça commit das suas alterações (`git commit -m 'Add some AmazingFeature'`)
4. Envie para o branch (`git push origin feature/AmazingFeature`)
5. Abra um Pull Request

## Licença
Distribuído sob a licença MIT. Veja `LICENSE` para mais informações.

## Contato
Teresa Bat - [contatotommymateus@gmail.com]

Link do projeto: [https://github.com/teresabat/desafio-backend-uol](https://github.com/teresabat/desafio-backend-uol)
