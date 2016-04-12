function bit(value) {
	var el;
	if (value.charAt(0) == '#') {
		el = [document.getElementById(value.substr(1))];
	} else {
		el = document.getElementsByTagName(value);
	}
	
	// 리턴할 배열에 조미료를 뿌리자!
	el.click = function(cb) {
		for (var i = 0; i < el.length; i++) {
			el[i].onclick = cb; // callback == event listner
		}
	};
	
	el.val = function(v) {
		if (arguments.length > 0) {
			for (var i = 0; i < el.length; i++) {
				el[i].value = v; 
			}
		} else {
			return el[0].value;
		}
	};
	
	return el;
}

var $ = bit;