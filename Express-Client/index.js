'use-strict';

const { response } = require('express');
const express = require('express');
const soap = require('soap');
const app = express();

const PORT = 5000;

app.get("/getUsers", (req , res)=>{
    const url = "http://localhost:8000/service/soap?wsdl";

    soap.createClient(url , (error , client)=>{
        if (error){
            //error handlers
        }
        else{
            //we have a client and we are ready to get data
            client.getUsersService((error , data)=>{
                res.json(data);
            })
        }
    })
})




app.listen(PORT , ()=> {

    console.log(`server is up and running in http://localhost:${PORT}`)
})