use PDF::API2;
use Scalar::Util qw(looks_like_number);

$pdf=PDF::API2->open("test.pdf");
$pages=$pdf->pages;
$filename="1000_HALLS.BA.pdf";
$substring = substr($filename, 0, 4);
print "1- $pages \n";
print "2- $substring \n";
$teststring=looks_like_number($substring);
print "3- $teststring \n";
my $filesize = -s "test.pdf";
print "4- $filesize \n";
if(($pages==1) && ($teststring==1) && ($filesize<7000)){
print  "$name is a valid split PDF output file";
} else {
print  "PDF has more than 1 page. It contains $pages pages \n";
print  "$filename is not a valid split PDF output";
}