<?php
$text = 'This is a test';
$str = preg_replace("/[^A-Za-z]/","",$text);
$l= strlen($str);
echo $l;
?>
