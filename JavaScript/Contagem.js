// const prompt = require("prompt-sync")();
const N = Number(prompt("Digite o número de notas: "))
let contador = 0;

for (let i = 1; i <= N; i++) {
    let nota = Number(prompt("Digite uma nota: "))

    if (nota >= 50) contador++
}

console.log(`O número de alunos aprovados foi ${contador}`)