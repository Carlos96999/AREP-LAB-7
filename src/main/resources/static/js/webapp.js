var webapp = (function () {

    var url = "http://localhost:5000/celsius?value="

    function getCelsius(fahre) {
        if(fahre.toString()==""){
            alert("Inserte un valor");
        }
        else {
            $("#table > tbody").empty();
            axios.get(url + fahre).then(res => {
                document.getElementById("respuesta").innerHTML = res.data.output + " grados Celsius";
                console.log(res.data);
            }).catch(error => {
                console.log(error);
            });
        }
    }
    return {
        getCelsius:getCelsius
    };
})();