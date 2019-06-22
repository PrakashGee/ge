<?php
$text = 'This is a test';
$l= strlen($str);
$str = preg_replace("/[^A-Za-z]/","",$text);
$l= strlen($str);
echo $l;
?>
