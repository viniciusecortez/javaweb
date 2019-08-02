plugins {
   war
   id("org.gretty") version "2.2.0"
}

repositories {
    jcenter()
}

dependencies {
    providedCompile ("javax.servlet:javax.servlet-api:3.1.0" ) // Api ServLets
    testCompile ("junit:junit:4.12") // Junit para testes unitários
    testCompile("org.mockito:mockito-core:2.7.19") // cria Mocks *usuários fictícios para conseguir executar os programas de testes
    // ainda falta adicionar o cucumber para o teste de aceitação
}