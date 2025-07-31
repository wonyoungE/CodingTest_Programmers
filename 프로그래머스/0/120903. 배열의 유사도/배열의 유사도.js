function solution(s1, s2) {
    var answer = 0;
    
    s1.forEach((i) => {
        s2.forEach((j) => {
            if(i === j) answer++;
        })
    })
    
    return answer;
}