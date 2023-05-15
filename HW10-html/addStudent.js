averageAge();

document.querySelector("button").onclick = createRow;

function createRow(){
    let tbody = document.querySelector(".tbody");
    let lastChild = tbody.lastChild;

    let tr = document.createElement('tr');
    let td1 = document.createElement('td');
    let name = document.querySelector(".name").value;
    td1.innerHTML = name + " (new)";
    tr.appendChild(td1);
        
    let td2 = document.createElement('td');
    let sex = document.querySelector(".sex").value;
    td2.innerHTML = sex;
    tr.appendChild(td2);

    let td3 = document.createElement('td');
    let date = document.querySelector(".date").value;
    td3.innerHTML = date;
    tr.appendChild(td3);

    let td4 = document.createElement('td');
    let age = parseInt((new Date().getTime() - new Date(date).getTime())/1000/60/60/24/365);        td4.innerHTML = age;
    tr.appendChild(td4);

    tbody.insertBefore(tr, lastChild);

    averageAge();	
    }

function averageAge(){
    let averageAge = document.querySelector('.averageAge');

    let tbody = document.querySelector(".tbody");

    let sumAge = 0;

    let rows = tbody.querySelectorAll("tr");
    for (var i = 0; i < rows.length; i++) { 
        var cols = rows[i].querySelectorAll('td'); 
        for (var j = 0; j < cols.length; j++) { 
            if(j = 3){ 
                sumAge += parseInt(cols[j].textContent);
            }
        }
    }

    let rez = sumAge/rows.length;

    averageAge.innerHTML = rez;
}       