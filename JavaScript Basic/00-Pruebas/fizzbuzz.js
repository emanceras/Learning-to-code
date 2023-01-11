let mdetres = "Fizz";
let mdecinco = "Buzz";
let mdetresycinco = "FizzBuzz";

for(let i = 0; i < 100; i++){
    if (i%3 == 0 && i%5 == 0) {
    console.log(mdetresycinco);
    
} else if (i%5 == 0){
    console.log(mdecinco);
} else if (i%3 == 0){
    console.log(mdetres);
}else{
    console.log(i)
}
}