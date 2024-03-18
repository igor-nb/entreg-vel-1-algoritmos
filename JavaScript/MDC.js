console.log(mdc(45, 30))

function mdc(a, b) {
    let maximoDivisor = 1;

    if (a > b) {
        let aux = a
        a = b
        b = aux
    }

    for (let i = 2; i <= a; i++) {

        if (a % i == 0) {
            if (b % i == 0) maximoDivisor = i
        }
    }
    return `O mdc de ${a} e ${b} é ${maximoDivisor}`
}