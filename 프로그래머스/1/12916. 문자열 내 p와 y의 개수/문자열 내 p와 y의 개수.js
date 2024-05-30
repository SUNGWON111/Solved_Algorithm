function solution(s){
    let str = s.toLowerCase();
    let counter = {
        p: 0,
        y: 0,
    };
    if (!s.includes('p') && !s.includes('y')) return true;
    for (let element of str){
        if (element === 'p') counter.p += 1;
        else if (element === 'y') counter.y += 1;
    }
    if (counter.p === counter.y) return true;
    else return false;
}

// return s.toLowerCase().split('p').length === s.toLowerCase().split('y').length;
