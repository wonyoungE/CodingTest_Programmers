function solution(numbers) {
    numbers.sort((a, b) => b - a);
    
    const mul1 = numbers[0] * numbers[1];
    const mul2 = numbers[numbers.length-1] * numbers[numbers.length-2];
    
    return mul1 >= mul2 ? mul1 : mul2;
}