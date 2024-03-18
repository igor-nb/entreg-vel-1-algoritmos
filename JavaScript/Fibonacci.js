// const prompt = require("prompt-sync")()
const N = Number(prompt("Digite o número de termos da Sequência de Fibonacci: "))

console.log(fibonacci(N))

function fibonacci(N) {
    let primeiroTermo = 0; let segundoTermo = 1; let aux; 
    let sequencia = ""

    for (let i = 1; i <= N; i++) {
        sequencia += `${primeiroTermo}, `

        aux = primeiroTermo + segundoTermo
        primeiroTermo = segundoTermo
        segundoTermo = aux
    }
    return sequencia
}