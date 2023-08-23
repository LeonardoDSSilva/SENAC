var globalGreetings = 'Good ';

function testGreeting() {
	var localGreetings = ' Morning';
	console.log("Function: ");
	console.log(globalGreetings);
	console.log(localGreetings);
}

testGreeting();

console.log("Main Program: ");
console.log(globalGreetings);


let testObj = {};
console.log(typeof testObj);


let testObj1 = {
	nr: 600,
	str: "text"
};

console.log(testObj1.nr);
console.log(testObj1.str);

let user1 = {
	name: "Calvin",
	surname: "Klein",
	age: 66,
	email: "CalvinMHart@mail.com"
};

console.log(user1.name);
console.log(user1.surname);
console.log(user1.age);

user1.age = 67;
console.log(user1.age);

console.log(user1.phone);

let test = {
	nr: 10,
	b: false,
	str: "uno dos tres",
	arr: [10, 20, 30],
	obj: {
		x: 10,
		y: 20
	},
	fn: function (arg) {
		console.log(arg);
	}
};

test.fn(123);

console.log(test.arr[1]);
console.log(test.obj.x);
test.obj.y = 40;

let point = {
	x: 0,
	y: 0
}

let days = ["Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"];

console.log(days[0]);
console.log(days[2]);
console.log(days[5]);

days[0] = "Sunday";


console.log("1" == 1);
console.log("1" === 1);

let valor = 1;
console.log(valor == 1);
console.log(valor === 1);

let aux = "1";
console.log(aux == 1);
console.log(aux === 1);

valor = "2";
console.log(valor != 1);
console.log(valor !== 1);
