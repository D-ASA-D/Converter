async function convertLengths() {
    const in_unit = document.getElementById("source-unit");
    const in_number = document.getElementById("value");
    const out_unit = document.getElementById("target-unit");

    in_unit_text = in_unit.value;
    in_number_text = in_number.value;
    out_unit_text = out_unit.value;
    
    try {
        const response = await fetch('http://localhost:8080/convert/length', {
            method: 'POST',
            headers: {
                'Content-Type': 'application/json'
            },
            body: JSON.stringify({
                number: in_number_text,
                inUnits: in_unit_text,
                outUnits: out_unit_text
            })
        });

        if (!response.ok) throw new Error('Ошибка сервера');
        
        const result = await response.text();
        //alert(result);
        document.getElementById('result').innerHTML = 
                `Результат: ${in_number_text} [${in_unit_text}] = ${result} [${out_unit_text}]`;

    } catch (error) {
        console.log(`Ошибка: ${error.message}`);
    };
};