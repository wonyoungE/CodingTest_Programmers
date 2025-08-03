function solution(my_string) {
    my_string = my_string.replace(/['a','e','i','o','u']/g, "");
    return my_string;
}