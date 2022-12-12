<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>

    <style>
        body
        {
            background-color: rgb(124, 206, 236);
            margin: 0;
            padding: 0;
            display: flex;
            align-items: center;
            justify-content: center;
            height: 100vh;
            font-family: Arial, Helvetica, sans-serif;
            background: linear-gradient(27deg, #F1C40F 50%, #717D7E 50% );
        }
        form
        {
            text-align: center;
            color: white;
            font-size :20px;
            font-family: monospace;
        }

    </style>
    
</head>
<body>
    <h1 style="text-align: center;
    color: white; font-family:
    monospace; font-size : 40px" >DOLAR</h1>
        <form  method="post">
            
            

            <script>
                pDolar=prompt('ingrese el precio actual del dolar')
                dolares=prompt('ingrese la cantidad de dolares a convertir')
                    pesos= dolares*pDolar;
                    
                    alert(  dolares +  " dolares son: " + pesos + "pesos")
                </script>


    <ul>
        <li><a href="Menu.html">Regresar</a></li>
    </ul>

</body>
</html>