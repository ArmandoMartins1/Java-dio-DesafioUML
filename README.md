# Java-dio-DesafioUML

## Getting Started

Welcome to the VS Code Java world. Here is a guideline to help you get started to write Java code in Visual Studio Code.

## UML
### Exemplo de Diagrama UML (Mermaid)
```mermaid
classDiagram
    class ReprodutorMusical {
        -musica: String
        +getMusica() String
        +setMusica(Musica: String) Void
        +selecionarMusica(Musica: String) Void
        +pausar() Void
        +tocar() Void
    }

    class AparelhoTelefonico {
        -numero: String
        +getNumero() String
        +setNumero(numero: String) Void
        +ligar(numero: String) Void
        +atender() Void
        +iniciarCorreioVoz() Void
    }

    class NavegadorInternet {
        -url: String
        +geturl() String
        +seturl(url: String) Void
        +exibirPagina(url: String) Void
        +adicionarNovaAba() Void
        +atualizarPagina() Void
    }

    class Iphone {
    }

    Iphone --> ReprodutorMusical
    Iphone --> AparelhoTelefonico
    Iphone --> NavegadorInternet
```
## Dependency Management

The `JAVA PROJECTS` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).
