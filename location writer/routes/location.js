const express = require('express');
const router = express.Router();
const fs = require('fs');

router.post('/',(req,res,next)=>{
    //console.log("waddaa");
    const data=req.body.latitude+"/"+req.body.longitude;
    
    fs.writeFile('D:/Github/CSSD-asignment/location.txt',data, function (err) {
        if (err){
            res.status(404).json({
                message: "location fetch failed"
            });
        }
        else{
            res.status(200).json({
                message: "written success",
                data:this.data
            });
        }
       
      })

})

router.get('/',(req,res,next)=>{

    readline = require('readline');

var rd = readline.createInterface({
    input: fs.createReadStream('D:/Github/CSSD-asignment/location.txt'),
    //output: process.stdout,
    console: false
});

rd.on('line', function(line) {
    console.log(line);
    var str=""+line;
    var arr=str.split("/");
    
    res.status(200).json({
        message: "written success",
        latitude: arr[0],
        longitude: arr[1]

    });
});
    

})
module.exports = router;
