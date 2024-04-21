function solution(id) {
  const str = id;
  const new_id = [];
  let answer = "";

  for (let i = 0; i < str.length; i += 1) {
    if (str[i] >= "A" && str[i] <= "Z") {
      new_id.push(str[i].toLowerCase());
    } else if (
      (str[i] >= "0" && str[i] <= "9") ||
      str[i] === "-" ||
      str[i] === "." ||
      str[i] === "_" ||
      (str[i] >= "a" && str[i] <= "z")
    ) {
      new_id.push(str[i]);
    }
  }
  if (new_id.includes(".")) {
    for (let i = 0; i < new_id.length - 1; i += 1) {
      let j = i + 1;
      if (new_id[i] === "." && new_id[j] === ".") {
        new_id[i] = -1;
      }
    }
    if (new_id[new_id.length - 1] === ".") new_id[new_id.length - 1] = -1;
  }
  const filterNew_id = new_id.filter((element) => element != -1);
  if (filterNew_id[0] === ".") filterNew_id.splice(0, 1);
  if (filterNew_id.length === 0) return "aaa";
  while (filterNew_id.length > 15) {
    filterNew_id.pop();
  }
  if (filterNew_id[filterNew_id.length - 1] === ".") filterNew_id.pop();
  if (filterNew_id.length < 3) {
    while (filterNew_id.length < 3) {
      filterNew_id.push(filterNew_id[filterNew_id.length - 1]);
    }
  }
  // console.log(filterNew_id.join(""));
  return (answer = filterNew_id.join(""));
}
// solution("...!@BaT#*..y.abcdefghijklm");
// solution("z-+.^.");
// solution("=.=");
// solution("123_.def");
// solution("abcdefghijklmn.p");
// solution("1234567890.123.456"); //"1234567890.123"
// solution("f...b");
// solution("-.~!@#$%&*()=+[{]}:?,<>/.-");
// solution("~!@#$%&*()=+[{]}:?,<>/");
// solution(".1.");
// solution("......a......a......a.....");

/*연속으로 나오는 '.'을 false로 표현 했었는데 요소에 '0'또한 false로 인식해 filter에 같이 걸러지는 
문제가 발생해 -1로 변경 */
