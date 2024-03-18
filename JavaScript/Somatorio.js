// const prompt = require("prompt-sync")()
const N = Number(prompt("Escreva a quantidade de números: "))

let somatorio = 0;

for (let i = 1; i <= N; i++) {
    let numero = Number(prompt("Digite o próximo número: "))
    somatorio += numero
}

console.log(`O valor do somatório foi: ${somatorio}`)