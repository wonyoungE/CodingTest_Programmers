function solution(cipher, code) {
    var answer = '';
    const split = cipher.split("");
    
    for(let i = code; i <= split.length; i+= code) {
        answer += split[i-1];
    }
    return answer;
}