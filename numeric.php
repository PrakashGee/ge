<?php
$text='this22 is a30 text';
$num = preg_replace('/[^0-9]/', '', $text);
 $l=strlen($num);
 echo $l;
?>
