function solution(array, height) {
    var answer = 0;
    
    array.forEach((i) => {
        if(i > height) {
            answer++;
        }
    })
    
    return answer;
}