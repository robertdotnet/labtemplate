var express = require('express');
var router = express.Router();

router.get('/', (req, res) => res.status(200).send({
  message: 'Welcome to the API! Testm',
}));

module.exports = router;
