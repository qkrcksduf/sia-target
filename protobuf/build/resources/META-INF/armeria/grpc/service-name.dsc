
�
account/message/Id.proto"
LongId
id (Rid"
StringId
id (	RidBPJ�
  


  

 "
	

 "


  


 

  

  

  


  


 





 	

 	

 		

 	bproto3
�1
google/protobuf/timestamp.protogoogle.protobuf";
	Timestamp
seconds (Rseconds
nanos (RnanosB�
com.google.protobufBTimestampProtoPZ2google.golang.org/protobuf/types/known/timestamppb��GPB�Google.Protobuf.WellKnownTypesJ�/
 �
�
 2� Protocol Buffers - Google's data interchange format
 Copyright 2008 Google Inc.  All rights reserved.
 https://developers.google.com/protocol-buffers/

 Redistribution and use in source and binary forms, with or without
 modification, are permitted provided that the following conditions are
 met:

     * Redistributions of source code must retain the above copyright
 notice, this list of conditions and the following disclaimer.
     * Redistributions in binary form must reproduce the above
 copyright notice, this list of conditions and the following disclaimer
 in the documentation and/or other materials provided with the
 distribution.
     * Neither the name of Google Inc. nor the names of its
 contributors may be used to endorse or promote products derived from
 this software without specific prior written permission.

 THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS
 "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT
 LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR
 A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT
 OWNER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL,
 SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT
 LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE,
 DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY
 THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE
 OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.


  

" ;
	
%" ;

# 
	
# 

$ I
	
$ I

% ,
	
% ,

& /
	
& /

' "
	

' "

( !
	
$( !
�
 � �� A Timestamp represents a point in time independent of any time zone or local
 calendar, encoded as a count of seconds and fractions of seconds at
 nanosecond resolution. The count is relative to an epoch at UTC midnight on
 January 1, 1970, in the proleptic Gregorian calendar which extends the
 Gregorian calendar backwards to year one.

 All minutes are 60 seconds long. Leap seconds are "smeared" so that no leap
 second table is needed for interpretation, using a [24-hour linear
 smear](https://developers.google.com/time/smear).

 The range is from 0001-01-01T00:00:00Z to 9999-12-31T23:59:59.999999999Z. By
 restricting to that range, we ensure that we can convert to and from [RFC
 3339](https://www.ietf.org/rfc/rfc3339.txt) date strings.

 # Examples

 Example 1: Compute Timestamp from POSIX `time()`.

     Timestamp timestamp;
     timestamp.set_seconds(time(NULL));
     timestamp.set_nanos(0);

 Example 2: Compute Timestamp from POSIX `gettimeofday()`.

     struct timeval tv;
     gettimeofday(&tv, NULL);

     Timestamp timestamp;
     timestamp.set_seconds(tv.tv_sec);
     timestamp.set_nanos(tv.tv_usec * 1000);

 Example 3: Compute Timestamp from Win32 `GetSystemTimeAsFileTime()`.

     FILETIME ft;
     GetSystemTimeAsFileTime(&ft);
     UINT64 ticks = (((UINT64)ft.dwHighDateTime) << 32) | ft.dwLowDateTime;

     // A Windows tick is 100 nanoseconds. Windows epoch 1601-01-01T00:00:00Z
     // is 11644473600 seconds before Unix epoch 1970-01-01T00:00:00Z.
     Timestamp timestamp;
     timestamp.set_seconds((INT64) ((ticks / 10000000) - 11644473600LL));
     timestamp.set_nanos((INT32) ((ticks % 10000000) * 100));

 Example 4: Compute Timestamp from Java `System.currentTimeMillis()`.

     long millis = System.currentTimeMillis();

     Timestamp timestamp = Timestamp.newBuilder().setSeconds(millis / 1000)
         .setNanos((int) ((millis % 1000) * 1000000)).build();


 Example 5: Compute Timestamp from Java `Instant.now()`.

     Instant now = Instant.now();

     Timestamp timestamp =
         Timestamp.newBuilder().setSeconds(now.getEpochSecond())
             .setNanos(now.getNano()).build();


 Example 6: Compute Timestamp from current time in Python.

     timestamp = Timestamp()
     timestamp.GetCurrentTime()

 # JSON Mapping

 In JSON format, the Timestamp type is encoded as a string in the
 [RFC 3339](https://www.ietf.org/rfc/rfc3339.txt) format. That is, the
 format is "{year}-{month}-{day}T{hour}:{min}:{sec}[.{frac_sec}]Z"
 where {year} is always expressed using four digits while {month}, {day},
 {hour}, {min}, and {sec} are zero-padded to two digits each. The fractional
 seconds, which can go up to 9 digits (i.e. up to 1 nanosecond resolution),
 are optional. The "Z" suffix indicates the timezone ("UTC"); the timezone
 is required. A proto3 JSON serializer should always use UTC (as indicated by
 "Z") when printing the Timestamp type and a proto3 JSON parser should be
 able to accept both UTC and other timezones (as indicated by an offset).

 For example, "2017-01-15T01:30:15.01Z" encodes 15.01 seconds past
 01:30 UTC on January 15, 2017.

 In JavaScript, one can convert a Date object to this format using the
 standard
 [toISOString()](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date/toISOString)
 method. In Python, a standard `datetime.datetime` object can be converted
 to this format using
 [`strftime`](https://docs.python.org/2/library/time.html#time.strftime) with
 the time format spec '%Y-%m-%dT%H:%M:%S.%fZ'. Likewise, in Java, one can use
 the Joda Time's [`ISODateTimeFormat.dateTime()`](
 http://www.joda.org/joda-time/apidocs/org/joda/time/format/ISODateTimeFormat.html#dateTime%2D%2D
 ) to obtain a formatter capable of generating timestamps in this format.




 �
�
  �� Represents seconds of UTC time since Unix epoch
 1970-01-01T00:00:00Z. Must be from 0001-01-01T00:00:00Z to
 9999-12-31T23:59:59Z inclusive.


  �

  �

  �
�
 �� Non-negative fractions of a second at nanosecond resolution. Negative
 second values with fractions must still have non-negative nanos values
 that count forward in time. Must be from 0 to 999,999,999
 inclusive.


 �

 �

 �bproto3
�
!account/message/AccountRole.proto**
AccountRoleProto	
ADMIN 
GENERALBPJ�
  

  

 "
	

 "


  


 

  

  

  


 

 	

 bproto3
�
account/message/Account.protogoogle/protobuf/timestamp.proto!account/message/AccountRole.proto"�
AccountResponseProto
id (	Rid
name (	Rname=
created_time (2.google.protobuf.TimestampRcreatedTimeC
latest_accessed (2.google.protobuf.TimestampRlatestAccessed
deleted (Rdeleted%
role (2.AccountRoleProtoRroleBPJ�
  

  
	
  )
	
 +

 "
	

 "


  


 

  

  

  	

  

 	

 	

 		

 	

 
-

 


 
(

 
+,

 0

 

 +

 ./

 

 

 

 

 

 

 

 bproto3
�
account/message/SignIn.proto!account/message/AccountRole.proto"@
SignInRequestProto
id (	Rid
password (	Rpassword"`
SignInResponseProto
id (	Rid
name (	Rname%
role (2.AccountRoleProtoRroleBPJ�
  

  
	
  +

 "
	

 "


  	


 

  

  

  	

  

 

 

 	

 


 




 

 

 	

 





	









bproto3
�
account/message/SignUp.proto!account/message/AccountRole.proto"{
SignUpRequestProto
id (	Rid
name (	Rname
password (	Rpassword%
role (2.AccountRoleProtoRrole"`
SignUpResponseProto
id (	Rid
name (	Rname%
role (2.AccountRoleProtoRroleBPJ�
  

  
	
  +

 "
	

 "


  


 

  

  

  	

  

 

 

 	

 

 	

 	

 		

 	

 


 


 


 



 




 

 

 	

 





	









bproto3
�
 account/grpc/AccountRouter.protoaccount/message/Id.protoaccount/message/Account.protoaccount/message/SignIn.protoaccount/message/SignUp.proto2�
AccountRouter4
getAccountById	.StringId.AccountResponseProto" 5
signIn.SignInRequestProto.SignInResponseProto" 5
signUp.SignUpRequestProto.SignUpResponseProto" BPJ�
  

  
	
  "
	
 '
	
 &
	
 &

 "
	

 "


 	 


 	

  
@

  


  


  
(<

 A

 

 

 *=

 A

 

 

 *=bproto3
�
com/sia/common/Color.protocom.sia.common"C
Color
red (Rred
green (Rgreen
blue (RblueBB
ColorProtoPJ�
  

  

 

 "
	

 "

 +
	
 +


  


 

  

  

  

  

 	

 	

 	

 	

 


 


 


 
bproto3
�
com/sia/common/Count.protocom.sia.common"
Count
count (RcountBB
CountProtoPJ�
  	

  

 

 "
	

 "

 +
	
 +


  	


 

  

  	

  


  bproto3
�
com/sia/common/DayOfWeek.protocom.sia.common*�
	DayOfWeek
DAY_OF_WEEK_UNSPECIFIED 

MONDAY
TUESDAY
	WEDNESDAY
THURSDAY

FRIDAY
SATURDAY

SUNDAYBBDayOfWeekProtoPJ�
   

  

 

 "
	

 "

 /
	
 /
'
    Represents a day of week.



 
+
  
 The unspecified day-of-week.


  


  

)
  The day-of-week of Monday.


 

 
*
  The day-of-week of Tuesday.


 	

 
,
  The day-of-week of Wednesday.


 

 
+
  The day-of-week of Thursday.


 


 
)
  The day-of-week of Friday.


 

 
+
  The day-of-week of Saturday.


 


 
)
  The day-of-week of Sunday.


 

 bproto3
�
 com/sia/common/DoubleRange.protocom.sia.common"5
DoubleRange
start (Rstart
end (RendBBDoubleRangeProtoPJ�
  

  

 

 "
	

 "

 1
	
 1


  


 

  	 필수


  	

  		

  	

  필수


 

 	

 bproto3
�
com/sia/common/GeoPoint.protocom.sia.common"D
GeoPoint
latitude (Rlatitude
	longitude (R	longitudeBBGeoPointProtoPJ�
  


  

 

 "
	

 "

 .
	
 .


  



 

  

  


  

  

 	

 	


 	

 	bproto3
�
com/sia/common/Extent.protocom.sia.commoncom/sia/common/GeoPoint.proto"�
Extent2
center (2.com.sia.common.GeoPointH Rcenter=
geo_location (2.com.sia.common.GeoPointH RgeoLocation
mgrs (	H Rmgrs
radius (RradiusB
center_pointBBExtentProtoPJ�
  

  

 

 "
	

 "

 ,
	
 ,
	
  '


 	 


 	

   필수


  

+
  ' @Deprecated 기존의 센터


  

  "

  %&
!
 - 4326 기준 센터


 

 (

 +,
!
  mrgs 기준 센터


 

 

 
$
  필수, 미터 단위


 	

 


 bproto3
�
 com/sia/common/HealthCheck.protocom.sia.common"J
HealthCheckRequest
service (	Rservice
interval (Rinterval"�
HealthCheckResponseI
status (21.com.sia.common.HealthCheckResponse.ServingStatusRstatus"O
ServingStatus
UNKNOWN 
SERVING
NOT_SERVING
SERVICE_UNKNOWN2�
HealthCheckP
Check".com.sia.common.HealthCheckRequest#.com.sia.common.HealthCheckResponseR
Watch".com.sia.common.HealthCheckRequest#.com.sia.common.HealthCheckResponse0BBHealthCheckProtoPJ�
  +

  

 

 "
	

 "

 1
	
 1


  



 

  

  


  

  

 	

 		

 	


 	


 




 

 	

  

  

  

 

 

 

 

 

 
/
 "  Used only by the Watch method.


 

 

 

 

 

 


  +


 
^
  @Q If the requested service is unknown, the call will fail with status
 NOT_FOUND.


  

   

  +>
�
 *G� Performs a watch for the serving status of the requested service.
 The server will immediately send back a message indicating the current
 serving status.  It will then subsequently send a new message whenever
 the service's serving status changes.

 If the requested service is unknown when the call is received, the
 server will send a message setting the serving status to
 SERVICE_UNKNOWN but will *not* terminate the call.  If at some
 future point, the serving status of the service becomes known, the
 server will send a new message with the service's serving status.

 If the call terminates with status UNIMPLEMENTED, then clients
 should assume this method is not supported and should not retry the
 call.  If the call terminates with any other status (including OK),
 clients should retry the call with appropriate exponential backoff.


 *

 * 

 *+1

 *2Ebproto3
�
com/sia/common/IntRange.protocom.sia.common"2
IntRange
start (Rstart
end (RendBBIntRangeProtoPJ�
  

  

 

 "
	

 "

 .
	
 .


  


 

  	 필수


  	

  	

  	

  필수


 

 

 bproto3
�
com/sia/common/Language.protocom.sia.common*
Language
KR 
ENBBLanguageProtoPJ�
  


  

 

 "
	

 "

 .
	
 .


  



 

  	

  

  

 		

 	

 	bproto3
�
com/sia/common/MongoId.protocom.sia.common"
MongoId
value (	RvalueBBMongoIdProtoPJ�
  	

  

 

 "
	

 "

 -
	
 -


  	


 

  

  


  

  bproto3
�
com/sia/common/Point.protocom.sia.common"#
Point
x (Rx
y (RyBB
PointProtoPJ�
  


  

 

 "
	

 "

 +
	
 +


  



 

  

  


  

  

 	

 	


 	

 	bproto3
�
com/sia/common/MultiPoint.protocom.sia.commoncom/sia/common/Point.proto"9

MultiPoint+
point (2.com.sia.common.PointRpointBBMultiPointProtoPJ�
  

  

 

 "
	

 "

 0
	
 0
	
  $


 	 


 	

  


  


  


  


  
bproto3
�
com/sia/common/Polygon.protocom.sia.commoncom/sia/common/Point.proto"H
Polygon+
point (2.com.sia.common.PointRpoint
wkb (RwkbBBPolygonProtoPJ�
  

  

 

 "
	

 "

 -
	
 -
	
  $


 	 


 	

  
,

  


  
!

  
"'

  
*+

 

 	

 


 bproto3
�
!com/sia/common/MultiPolygon.protocom.sia.commoncom/sia/common/Polygon.proto"S
MultiPolygon1
polygon (2.com.sia.common.PolygonRpolygon
wkb (RwkbBBMultiPolygonProtoPJ�
  

  

 

 "
	

 "

 2
	
 2
	
  &


 	 


 	

  
!

  


  


  


  
 

 

 	

 


 bproto3
�
com/sia/common/Paging.protocom.sia.common"2
Paging
page (Rpage
count (RcountBBPagingProtoPJ�
  

  

 

 "
	

 "

 ,
	
 ,


  


 

  	 필수


  	

  	

  	

  필수


 

 

 bproto3
�
com/sia/common/Period.protocom.sia.commongoogle/protobuf/timestamp.proto"h
Period0
start (2.google.protobuf.TimestampRstart,
end (2.google.protobuf.TimestampRendBBPeriodProtoPJ�
  

  

 

 "
	

 "

 ,
	
 ,
	
  )


 	 


 	

  
(

  


  
#

  
&'

 &

 

 !

 $%bproto3
�
com/sia/common/Point3D.protocom.sia.common"3
Point3D
x (Rx
y (Ry
z (RzBBPoint3DProtoPJ�
  

  

 

 "
	

 "

 -
	
 -


  


 

  

  


  

  

 	

 	


 	

 	

 


 



 


 
bproto3
�
#com/sia/common/ProgressStatus.protocom.sia.common*U
ProgressStatus
WAITING 
IN_PROGRESS
SUCCESS

FAILED
CANCELEDBBProgressStatusProtoPJ�
  

  

 

 "
	

 "

 4
	
 4


  


 

  

  

  

 	

 	

 	

 


 


 


 

 


 

 

 

 bproto3
�
"com/sia/common/SortDirection.protocom.sia.common*/
SortDirection
DEFAULT 
ASC
DESCBBSortDirectionProtoPJ�
  

  

 

 "
	

 "

 3
	
 3


  


 

  

  

  

 	

 	

 	


 


 


 
bproto3
�
com/sia/common/StringId.protocom.sia.common" 
StringId
value (	RvalueBBStringIdProtoPJ�
  	

  

 

 "
	

 "

 .
	
 .


  	


 

  

  

  	

  bproto3
�
com/sia/common/TimeZone.protocom.sia.common"#
TimeZone
zone_id (	RzoneIdBBTimeZoneProtoPJ�
  	

  

 

 "
	

 "

 .
	
 .


  	


 

  

  


  

  bproto3
�
#com/sia/common/TimestampRange.protocom.sia.commongoogle/protobuf/timestamp.proto"p
TimestampRange0
start (2.google.protobuf.TimestampRstart,
end (2.google.protobuf.TimestampRendBBTimestampRangeProtoPJ�
  

  

 

 "
	

 "

 4
	
 4
	
  )


 	 


 	

  
(

  


  
#

  
&'

 &

 

 !

 $%bproto3
�
com/sia/common/UUID.protocom.sia.common"
UUID
value (	RvalueBB	UUIDProtoPJ�
  	

  

 

 "
	

 "

 *
	
 *


  	


 

  

  


  

  bproto3
�	
/com/sia/obision/target/v1/attach/AttachV1.proto com.sia.obision.target.v1.attachcom/sia/common/UUID.proto"�
Attach$
id (2.com.sia.common.UUIDRid
fileName (	RfileName
size (RsizeU
fileExtension (2/.com.sia.obision.target.v1.attach.FileExtensionRfileExtension*m
FileExtension
DEFAULT 
CSV
PDF
HWP
TXT
SHP
JPG
PNG
PPT
ZIP	BBAttachV1ProtoPJ�
  

  

 )

 "
	

 "

 .
	
 .
	
  #


 	 


 	

  


  


  


  


 

 

 	

 

 

 

 

 

 "

 

 

  !


  


 

  

  	

  

 


 

 	

 


 

 	

 


 

 	

 


 

 	

 


 

 	

 


 

 	

 


 

 	

 


 

 	

 	


 	

 		bproto3
�
5com/sia/obision/target/v1/attach/UploadAttachV1.proto com.sia.obision.target.v1.attach/com/sia/obision/target/v1/attach/AttachV1.protocom/sia/common/UUID.proto"�
UploadAttachRequestV10
recordId (2.com.sia.common.UUIDRrecordId
file (Rfile
fileName (	RfileName
size (RsizeU
fileExtension (2/.com.sia.obision.target.v1.attach.FileExtensionRfileExtension"J
UploadAttachResponseV10
attachId (2.com.sia.common.UUIDRattachIdBBUploadAttachV1ProtoPJ�
  

  

 )

 "
	

 "

 4
	
 4
	
  9
	
 #


 
 


 


  #

  

  

  !"

 

 

 

 

 

 

 	

 

 

 

 

 

 "

 

 

  !


 




 #

 

 

 !"bproto3
�
7com/sia/obision/target/v1/attach/DownloadAttachV1.proto com.sia.obision.target.v1.attachcom/sia/common/UUID.proto"K
DownloadAttachRequestV10
attachId (2.com.sia.common.UUIDRattachId".
DownloadAttachResponseV1
file (RfileBBDownloadAttachV1ProtoPJ�
  

  

 )

 "
	

 "

 6
	
 6
	
  #


 	 


 	

  


  


  


  



 


 

 

 

 

 bproto3
�
5com/sia/obision/target/v1/attach/DeleteAttachV1.proto com.sia.obision.target.v1.attachcom/sia/common/UUID.proto"=
DeleteAttachRequestV1$
id (2.com.sia.common.UUIDRidBBDeleteAttachV1ProtoPJ�
  

  

 )

 "
	

 "

 4
	
 4
	
  #


 	 


 	

  


  


  


  
bproto3
�
google/protobuf/empty.protogoogle.protobuf"
EmptyB}
com.google.protobufB
EmptyProtoPZ.google.golang.org/protobuf/types/known/emptypb��GPB�Google.Protobuf.WellKnownTypesJ�
 3
�
 2� Protocol Buffers - Google's data interchange format
 Copyright 2008 Google Inc.  All rights reserved.
 https://developers.google.com/protocol-buffers/

 Redistribution and use in source and binary forms, with or without
 modification, are permitted provided that the following conditions are
 met:

     * Redistributions of source code must retain the above copyright
 notice, this list of conditions and the following disclaimer.
     * Redistributions in binary form must reproduce the above
 copyright notice, this list of conditions and the following disclaimer
 in the documentation and/or other materials provided with the
 distribution.
     * Neither the name of Google Inc. nor the names of its
 contributors may be used to endorse or promote products derived from
 this software without specific prior written permission.

 THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS
 "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT
 LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR
 A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT
 OWNER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL,
 SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT
 LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE,
 DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY
 THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE
 OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.


  

" ;
	
%" ;

# E
	
# E

$ ,
	
$ ,

% +
	
% +

& "
	

& "

' !
	
$' !

( 
	
( 
�
 3 � A generic empty message that you can re-use to avoid defining duplicated
 empty messages in your APIs. A typical example is to use it as the request
 or the response type of an API method. For instance:

     service Foo {
       rpc Bar(google.protobuf.Empty) returns (google.protobuf.Empty);
     }

 The JSON representation for `Empty` is empty JSON object `{}`.



 3bproto3
�
)com/sia/obision/target/AttachRouter.protocom.sia.obision.target5com/sia/obision/target/v1/attach/UploadAttachV1.proto7com/sia/obision/target/v1/attach/DownloadAttachV1.proto5com/sia/obision/target/v1/attach/DeleteAttachV1.protogoogle/protobuf/empty.proto2�
AttachRouter�
uploadAttach7.com.sia.obision.target.v1.attach.UploadAttachRequestV18.com.sia.obision.target.v1.attach.UploadAttachResponseV1" �
downloadAttach9.com.sia.obision.target.v1.attach.DownloadAttachRequestV1:.com.sia.obision.target.v1.attach.DownloadAttachResponseV1" a
deleteAttach7.com.sia.obision.target.v1.attach.DeleteAttachRequestV1.google.protobuf.Empty" BPJ�
  

  

 

 "
	

 "
	
  ?
	
 A
	
 ?
	
	 %


  


 

  a

  

  2

  =]

 g

 

 6

 Ac

 V

 

 2

 =Rbproto3
�
9com/sia/obision/target/v1/category/CreateCategoryV1.proto"com.sia.obision.target.v1.categorycom/sia/common/UUID.proto"�
CreateCategoryRequestV1"
mainCategory (	RmainCategory&
middleCategory (	RmiddleCategory 
subCategory (	RsubCategory"@
CreateCategoryResponseV1$
id (2.com.sia.common.UUIDRidBBCreateCategoryV1ProtoPJ�
  

  

 +

 "
	

 "

 6
	
 6
	
  #


 	 


 	

  


  


  
	

  


 

 

 	

 

 

 

 	

 


 


 

 

 

 

 bproto3
�
3com/sia/obision/target/v1/category/CategoryV1.proto"com.sia.obision.target.v1.categorycom/sia/common/UUID.proto"�
Category$
id (2.com.sia.common.UUIDRid"
mainCategory (	RmainCategory&
middleCategory (	RmiddleCategory 
subCategory (	RsubCategoryBBCategoryV1ProtoPJ�
  

  

 +

 "
	

 "

 0
	
 0
	
  #


 	 


 	

  


  


  


  


 

 

 	

 

 

 

 	

 

 

 

 	

 bproto3
�
:com/sia/obision/target/v1/category/GetCategoryListV1.proto"com.sia.obision.target.v1.category3com/sia/obision/target/v1/category/CategoryV1.proto"e
GetCategoryListResponseV1H
category (2,.com.sia.obision.target.v1.category.CategoryRcategoryBBGetCategoryListV1ProtoPJ�
  

  

 +

 "
	

 "

 7
	
 7
	
  =


 	 


 	!

  
!

  



  


  


  
 bproto3
�
=com/sia/obision/target/v1/category/CreateCategoryListV1.proto"com.sia.obision.target.v1.category9com/sia/obision/target/v1/category/CreateCategoryV1.proto"v
CreateCategoryListRequestV1W
category (2;.com.sia.obision.target.v1.category.CreateCategoryRequestV1Rcategory"x
CreateCategoryListResponseV1X
category (2<.com.sia.obision.target.v1.category.CreateCategoryResponseV1RcategoryBBCreateCategoryListV1ProtoPJ�
  

  

 +

 "
	

 "

 :
	
 :
	
  C


 	 


 	#

  
0

  



  
"

  
#+

  
./


 


$

 1

 


 #

 $,

 /0bproto3
�
9com/sia/obision/target/v1/category/UpdateCategoryV1.proto"com.sia.obision.target.v1.categorycom/sia/common/UUID.proto"�
UpdateCategoryRequestV1$
id (2.com.sia.common.UUIDRid"
mainCategory (	RmainCategory&
middleCategory (	RmiddleCategory 
subCategory (	RsubCategoryBBUpdateCategoryV1ProtoPJ�
  

  

 +

 "
	

 "

 6
	
 6
	
  #


 	 


 	

  


  


  


  


 

 

 	

 

 

 

 	

 

 

 

 	

 bproto3
�
9com/sia/obision/target/v1/category/DeleteCategoryV1.proto"com.sia.obision.target.v1.categorycom/sia/common/UUID.proto"?
DeleteCategoryRequestV1$
id (2.com.sia.common.UUIDRidBBDeleteCategoryV1ProtoPJ�
  

  

 +

 "
	

 "

 6
	
 6
	
  #


 	 


 	

  


  


  


  
bproto3
�
=com/sia/obision/target/v1/category/DeleteCategoryListV1.proto"com.sia.obision.target.v1.category9com/sia/obision/target/v1/category/DeleteCategoryV1.proto"v
DeleteCategoryListRequestV1W
category (2;.com.sia.obision.target.v1.category.DeleteCategoryRequestV1RcategoryBBDeleteCategoryListV1ProtoPJ�
  

  

 +

 "
	

 "

 :
	
 :
	
  C


 	 


 	#

  
0

  



  
"

  
#+

  
./bproto3
�
+com/sia/obision/target/CategoryRouter.protocom.sia.obision.target9com/sia/obision/target/v1/category/CreateCategoryV1.proto:com/sia/obision/target/v1/category/GetCategoryListV1.proto=com/sia/obision/target/v1/category/CreateCategoryListV1.proto9com/sia/obision/target/v1/category/UpdateCategoryV1.proto9com/sia/obision/target/v1/category/DeleteCategoryV1.proto=com/sia/obision/target/v1/category/DeleteCategoryListV1.protogoogle/protobuf/empty.proto2�
CategoryRouter�
createCategory;.com.sia.obision.target.v1.category.CreateCategoryRequestV1<.com.sia.obision.target.v1.category.CreateCategoryResponseV1" �
createCategoryList?.com.sia.obision.target.v1.category.CreateCategoryListRequestV1@.com.sia.obision.target.v1.category.CreateCategoryListResponseV1" j
getCategoryList.google.protobuf.Empty=.com.sia.obision.target.v1.category.GetCategoryListResponseV1" g
updateCategory;.com.sia.obision.target.v1.category.UpdateCategoryRequestV1.google.protobuf.Empty" g
deleteCategory;.com.sia.obision.target.v1.category.DeleteCategoryRequestV1.google.protobuf.Empty" o
deleteCategoryList?.com.sia.obision.target.v1.category.DeleteCategoryListRequestV1.google.protobuf.Empty" BPJ�
  

  

 

 "
	

 "
	
  C
	
 D
	
 G
	
	 C
	

 C
	
 G
	
 %


  


 

  j

  

  8

  Cg

 v

 

 @

 Ks

 ^

 

 +

 6[

 [

 

 8

 CX

 [

 

 8

 CX

 c

 

 @

 K`bproto3
�
5com/sia/obision/target/v1/record/CreateRecordV1.proto com.sia.obision.target.v1.recordcom/sia/common/UUID.proto"�
CreateRecordRequestV1

targetName (	R
targetName
contents (	Rcontents
creator (	Rcreator 
isEmergency (RisEmergency">
CreateRecordResponseV1$
id (2.com.sia.common.UUIDRidBBCreateRecordV1ProtoPJ�
  

  

 )

 "
	

 "

 4
	
 4
	
  #


 	 


 	

  


  


  
	

  


 

 

 	

 

 

 

 	

 

 

 

 

 


 




 

 

 

 bproto3
�
5com/sia/obision/target/v1/record/UpdateRecordV1.proto com.sia.obision.target.v1.recordcom/sia/common/UUID.proto"�
UpdateRecordRequestV1$
id (2.com.sia.common.UUIDRid

targetName (	R
targetName
contents (	Rcontents 
isEmergency (RisEmergencyBBUpdateRecordProtoV1PJ�
  

  

 )

 "
	

 "

 4
	
 4
	
  #


 	 


 	

  


  


  


  


 

 

 	

 

 

 

 	

 

 

 

 

 bproto3
�
5com/sia/obision/target/v1/record/DeleteRecordV1.proto com.sia.obision.target.v1.recordcom/sia/common/UUID.proto"=
DeleteRecordRequestV1$
id (2.com.sia.common.UUIDRidBBDeleteRecordV1ProtoPJ�
  

  

 )

 "
	

 "

 4
	
 4
	
  #


 	 


 	

  


  


  


  
bproto3
�
7com/sia/obision/target/v1/record/RecordBookMarkV1.proto com.sia.obision.target.v1.recordcom/sia/common/UUID.proto"k
RecordBookMarkRequestV10
recordId (2.com.sia.common.UUIDRrecordId

isFavorite (R
isFavoriteBBRecordBookMarkV1ProtoPJ�
  

  

 )

 "
	

 "

 6
	
 6
	
  #


 	 


 	

  


  


  


  


 

 

 

 bproto3
�
0com/sia/obision/target/v1/FilterPropertyV1.protocom.sia.obision.target.v1com/sia/common/UUID.proto#com/sia/common/TimestampRange.proto"�
FilterProperty4

categoryId (2.com.sia.common.UUIDR
categoryId<
	timeRange (2.com.sia.common.TimestampRangeR	timeRangeBBFilterPropertyV1ProtoPJ�
  

  

 "

 "
	

 "

 6
	
 6
	
  #
	
 -


 
 


 


  .

  


  

  )

  ,-

 .

 

  )

 ,-bproto3
�
;com/sia/obision/target/v1/record/RecordSortPropertyV1.proto com.sia.obision.target.v1.record*D
RecordSortProperty
DEFAULT 
TARGET_NAME
CREATED_TIMEBBRecordSortPropertyV1ProtoPJ�
  

  

 )

 "
	

 "

 :
	
 :


  


 

  

  	

  

 	

 	

 	

 


 


 
bproto3
�

/com/sia/obision/target/v1/record/RecordV1.proto com.sia.obision.target.v1.recordgoogle/protobuf/timestamp.proto/com/sia/obision/target/v1/attach/AttachV1.protocom/sia/common/UUID.proto"�
Record0
recordId (2.com.sia.common.UUIDRrecordId
targetId (	RtargetId

targetName (	R
targetName
contents (	Rcontents@
attach (2(.com.sia.obision.target.v1.attach.AttachRattach<
createdTime (2.google.protobuf.TimestampRcreatedTime
creator (	Rcreator*
isFavoriteTarget (RisFavoriteTarget*
isFavoriteRecord	 (RisFavoriteRecord 
isEmergency
 (RisEmergencyBBRecordV1ProtoPJ�
  

  

 )

 "
	

 "

 .
	
 .
	
  )
	
 9
	
	 #


  


 

  

  

  

  

 

 

 	

 

 

 

 	

 

 

 

 	

 

 $

 


 

 

 "#

 ,

 

 '

 *+

 

 

 	

 

 

 

 

 

 

 

 

 

 	

 	

 	

 	bproto3
�
;com/sia/obision/target/v1/record/RecordSelectOptionV1.proto com.sia.obision.target.v1.record"�
RecordSelectOption*
isFavoriteRecord (RisFavoriteRecord*
isFavoriteTarget (RisFavoriteTarget 
isEmergency (RisEmergencyBBRecordSelectOptionV1ProtoPJ�
  

  

 )

 "
	

 "

 :
	
 :


  


 

  

  

  

  

 	

 	

 	

 	

 


 


 


 
bproto3
�
5com/sia/obision/target/v1/record/RecordFilterV1.proto com.sia.obision.target.v1.record#com/sia/common/TimestampRange.protocom/sia/common/Paging.proto"com/sia/common/SortDirection.proto0com/sia/obision/target/v1/FilterPropertyV1.proto;com/sia/obision/target/v1/record/RecordSortPropertyV1.proto/com/sia/obision/target/v1/record/RecordV1.proto;com/sia/obision/target/v1/record/RecordSelectOptionV1.proto"�
RecordFilterRequestV1Q
filterProperty (2).com.sia.obision.target.v1.FilterPropertyRfilterPropertyX
selectOption (24.com.sia.obision.target.v1.record.RecordSelectOptionRselectOptionC
sortDirection (2.com.sia.common.SortDirectionRsortDirectiond
recordSortProperty (24.com.sia.obision.target.v1.record.RecordSortPropertyRrecordSortProperty.
paging (2.com.sia.common.PagingRpaging"z
RecordFilterResponseV1@
record (2(.com.sia.obision.target.v1.record.RecordRrecord

totalCount (R
totalCountBBRecordFilterV1ProtoPJ�
  

  

 )

 "
	

 "

 4
	
 4
	
  -
	
 %
	
	 ,
	

 :
	
 E
	
 9
	
 E


  


 

  $

  

  

  "#

 &

 

 !

 $%

 1

 

 ,

 /0

 ,

 

 '

 *+

 #

 

 

 !"


 




 

 


 

 

 







bproto3
�
5com/sia/obision/target/v1/record/RecordSearchV1.proto com.sia.obision.target.v1.record;com/sia/obision/target/v1/record/RecordSelectOptionV1.proto;com/sia/obision/target/v1/record/RecordSortPropertyV1.proto/com/sia/obision/target/v1/record/RecordV1.proto"com/sia/common/SortDirection.protocom/sia/common/Paging.proto"�
RecordSearchRequestV1^
searchProperty (26.com.sia.obision.target.v1.record.RecordSearchPropertyRsearchPropertyX
selectOption (24.com.sia.obision.target.v1.record.RecordSelectOptionRselectOptionC
sortDirection (2.com.sia.common.SortDirectionRsortDirectiond
recordSortProperty (24.com.sia.obision.target.v1.record.RecordSortPropertyRrecordSortProperty.
paging (2.com.sia.common.PagingRpaging"z
RecordSearchResponseV1@
record (2(.com.sia.obision.target.v1.record.RecordRrecord

totalCount (R
totalCount"l
RecordSearchProperty

targetName (	R
targetName
creator (	Rcreator
contents (	RcontentsBBRecordSearchV1ProtoPJ�
  

  

 )

 "
	

 "

 4
	
 4
	
  E
	
 E
	
	 9
	

 ,
	
 %


  


 

  *

  

  %

  ()

 &

 

 !

 $%

 1

 

 ,

 /0

 ,

 

 '

 *+

 #

 

 

 !"


 




 

 


 

 

 










 




 

 

 	

 





	







	

bproto3
�
)com/sia/obision/target/RecordRouter.protocom.sia.obision.targetgoogle/protobuf/empty.proto5com/sia/obision/target/v1/record/CreateRecordV1.proto5com/sia/obision/target/v1/record/UpdateRecordV1.proto5com/sia/obision/target/v1/record/DeleteRecordV1.proto7com/sia/obision/target/v1/record/RecordBookMarkV1.proto5com/sia/obision/target/v1/record/RecordFilterV1.proto5com/sia/obision/target/v1/record/RecordSearchV1.proto2�
RecordRouter�
createRecord7.com.sia.obision.target.v1.record.CreateRecordRequestV18.com.sia.obision.target.v1.record.CreateRecordResponseV1" a
updateRecord7.com.sia.obision.target.v1.record.UpdateRecordRequestV1.google.protobuf.Empty" a
deleteRecord7.com.sia.obision.target.v1.record.DeleteRecordRequestV1.google.protobuf.Empty" _
bookMark9.com.sia.obision.target.v1.record.RecordBookMarkRequestV1.google.protobuf.Empty" �
recordFilter7.com.sia.obision.target.v1.record.RecordFilterRequestV18.com.sia.obision.target.v1.record.RecordFilterResponseV1" �
recordSearch7.com.sia.obision.target.v1.record.RecordSearchRequestV18.com.sia.obision.target.v1.record.RecordSearchResponseV1" BPJ�
  

  

 

 "
	

 "
	
  %
	
 ?
	
 ?
	
	 ?
	

 A
	
 ?
	
 ?


  


 

  a

  

  2

  =]

 V

 

 2

 =R

 V

 

 2

 =R

 T

 

 0

 ;P

 a

 

 2

 =]

 a

 

 2

 =]bproto3
�
5com/sia/obision/target/v1/target/CreateTargetV1.proto com.sia.obision.target.v1.targetcom/sia/common/UUID.proto"�
CreateTargetRequestV1
id (	Rid
name (	Rname4

categoryId (2.com.sia.common.UUIDR
categoryId
mgrs (	Rmgrs
latitude (	Rlatitude
	longitude (	R	longitude
be (	Rbe
jdpi (	RjdpiBBCreateTargetV1ProtoPJ�
  

  

 )

 "
	

 "

 4
	
 4
	
  #


 	 


 	

  


  


  
	

  


 

 

 	

 

 %

 

  

 #$

 

 

 	

 

 

 

 	

 

 

 

 	

 

 

 

 	

 

 

 

 	

 bproto3
�
9com/sia/obision/target/v1/target/CreateTargetListV1.proto com.sia.obision.target.v1.target5com/sia/obision/target/v1/target/CreateTargetV1.proto"l
CreateTargetListRequestV1O
target (27.com.sia.obision.target.v1.target.CreateTargetRequestV1RtargetBBCreateTargetListV1ProtoPJ�
  

  

 )

 "
	

 "

 8
	
 8
	
  ?


 	 


 	!

  
,

  



  
 

  
!'

  
*+bproto3
�
5com/sia/obision/target/v1/target/UpdateTargetV1.proto com.sia.obision.target.v1.targetcom/sia/common/UUID.proto"�
UpdateTargetRequestV1
	currentId (	R	currentId
newId (	RnewId
name (	Rname4

categoryId (2.com.sia.common.UUIDR
categoryId
mgrs (	Rmgrs
latitude (	Rlatitude
	longitude (	R	longitude
be (	Rbe
jdpi	 (	RjdpiBBUpdateTargetV1ProtoPJ�
  

  

 )

 "
	

 "

 4
	
 4
	
  #


 	 


 	

  


  


  
	

  


 

 

 	

 

 

 

 	

 

 %

 

  

 #$

 

 

 	

 

 

 

 	

 

 

 

 	

 

 

 

 	

 

 

 

 	

 bproto3
�
5com/sia/obision/target/v1/target/DeleteTargetV1.proto com.sia.obision.target.v1.target"'
DeleteTargetRequestV1
id (	RidBBDeleteTargetV1ProtoPJ�
  	

  

 )

 "
	

 "

 4
	
 4


  	


 

  

  

  	

  bproto3
�
;com/sia/obision/target/v1/target/TargetSortPropertyV1.proto com.sia.obision.target.v1.target*S
TargetSortProperty
DEFAULT 
	TARGET_ID
TARGET_NAME
CREATED_TIMEBBTargetSortPropertyV1ProtoPJ�
  

  

 )

 "
	

 "

 :
	
 :


  


 

  

  	

  

 	

 	

 	

 


 


 


 

 

 bproto3
�	
/com/sia/obision/target/v1/target/TargetV1.proto com.sia.obision.target.v1.targetcom/sia/common/GeoPoint.proto3com/sia/obision/target/v1/category/CategoryV1.protogoogle/protobuf/timestamp.proto"�
Target
id (	Rid
name (	RnameH
category (2,.com.sia.obision.target.v1.category.CategoryRcategory
mgrs (	Rmgrs6
	geography (2.com.sia.common.GeoPointR	geography
be (	Rbe
jdpi (	Rjdpi<
createdTime (2.google.protobuf.TimestampRcreatedTime

isFavorite	 (R
isFavoriteBBTargetV1ProtoPJ�
  

  

 )

 "
	

 "

 .
	
 .
	
  '
	
 =
	
	 )


  


 

  

  

  	

  

 

 

 	

 

 !

 

 

  

 

 

 	

 

 (

 

 #

 &'

 

 

 	

 

 

 

 	

 

 ,

 

 '

 *+

 

 

 

 bproto3
�
5com/sia/obision/target/v1/target/TargetSearchV1.proto com.sia.obision.target.v1.targetcom/sia/common/Paging.proto"com/sia/common/SortDirection.proto;com/sia/obision/target/v1/target/TargetSortPropertyV1.proto/com/sia/obision/target/v1/target/TargetV1.proto"�
TargetSearchRequestV1^
searchProperty (26.com.sia.obision.target.v1.target.TargetSearchPropertyRsearchProperty

isFavorite (R
isFavoriteC
sortDirection (2.com.sia.common.SortDirectionRsortDirectiond
targetSortProperty (24.com.sia.obision.target.v1.target.TargetSortPropertyRtargetSortProperty.
paging (2.com.sia.common.PagingRpaging"z
TargetSearchResponseV1@
target (2(.com.sia.obision.target.v1.target.TargetRtarget

totalCount (R
totalCount"V
TargetSearchProperty
id (	Rid
name (	Rname
category (	RcategoryBBTargetSearchV1ProtoPJ�
  

  

 )

 "
	

 "

 4
	
 4
	
  %
	
 ,
	
	 E
	

 9


  


 

  *

  

  %

  ()

 

 

 

 

 1

 

 ,

 /0

 ,

 

 '

 *+

 #

 

 

 !"


 




 

 


 

 

 










 




 

 

 	

 





	







	

bproto3
�
7com/sia/obision/target/v1/target/TargetBookMarkV1.proto com.sia.obision.target.v1.target"U
TargetBookMarkRequestV1
targetId (	RtargetId

isFavorite (R
isFavoriteBBTargetBookMartV1ProtoPJ�
  


  

 )

 "
	

 "

 6
	
 6


  



 

  

  

  	

  

 	

 	

 	

 	bproto3
�
9com/sia/obision/target/v1/target/DeleteTargetListV1.proto com.sia.obision.target.v1.target5com/sia/obision/target/v1/target/DeleteTargetV1.proto"d
DeleteTargetListRequestV1G
id (27.com.sia.obision.target.v1.target.DeleteTargetRequestV1RidBBDeleteTargetListV1ProtoPJ�
  

  

 )

 "
	

 "

 8
	
 8
	
  ?


 	 


 	!

  
(

  



  
 

  
!#

  
&'bproto3
�
;com/sia/obision/target/v1/target/TargetSelectOptionV1.proto com.sia.obision.target.v1.target"4
TargetSelectOption

isFavorite (R
isFavoriteBBTargetSelectOptionV1ProtoPJ�
  	

  

 )

 "
	

 "

 :
	
 :


  	


 

  

  

  

  bproto3
�
5com/sia/obision/target/v1/target/TargetFilterV1.proto com.sia.obision.target.v1.targetcom/sia/common/UUID.proto#com/sia/common/TimestampRange.proto"com/sia/common/SortDirection.protocom/sia/common/Paging.proto/com/sia/obision/target/v1/target/TargetV1.proto;com/sia/obision/target/v1/target/TargetSortPropertyV1.proto0com/sia/obision/target/v1/FilterPropertyV1.proto;com/sia/obision/target/v1/target/TargetSelectOptionV1.proto"�
TargetFilterRequestV1Q
filterProperty (2).com.sia.obision.target.v1.FilterPropertyRfilterPropertyX
selectOption (24.com.sia.obision.target.v1.target.TargetSelectOptionRselectOptionC
sortDirection (2.com.sia.common.SortDirectionRsortDirectiond
targetSortProperty (24.com.sia.obision.target.v1.target.TargetSortPropertyRtargetSortProperty.
paging (2.com.sia.common.PagingRpaging"z
TargetFilterResponseV1@
target (2(.com.sia.obision.target.v1.target.TargetRtarget

totalCount (R
totalCountBBTargetFilterV1ProtoPJ�
  

  

 )

 "
	

 "

 4
	
 4
	
  #
	
 -
	
	 ,
	

 %
	
 9
	
 E
	
 :
	
 E


  


 

  $

  

  

  "#

 &

 

 !

 $%

 1

 

 ,

 /0

 ,

 

 '

 *+

 #

 

 

 !"


 




 

 


 

 

 







bproto3
�
)com/sia/obision/target/TargetRouter.protocom.sia.obision.target5com/sia/obision/target/v1/target/CreateTargetV1.proto9com/sia/obision/target/v1/target/CreateTargetListV1.proto5com/sia/obision/target/v1/target/UpdateTargetV1.proto5com/sia/obision/target/v1/target/DeleteTargetV1.proto5com/sia/obision/target/v1/target/TargetSearchV1.proto7com/sia/obision/target/v1/target/TargetBookMarkV1.proto9com/sia/obision/target/v1/target/DeleteTargetListV1.proto5com/sia/obision/target/v1/target/TargetFilterV1.protogoogle/protobuf/empty.proto2�
TargetRoutera
createTarget7.com.sia.obision.target.v1.target.CreateTargetRequestV1.google.protobuf.Empty" i
createTargetList;.com.sia.obision.target.v1.target.CreateTargetListRequestV1.google.protobuf.Empty" �
targetSearch7.com.sia.obision.target.v1.target.TargetSearchRequestV18.com.sia.obision.target.v1.target.TargetSearchResponseV1" �
targetFilter7.com.sia.obision.target.v1.target.TargetFilterRequestV18.com.sia.obision.target.v1.target.TargetFilterResponseV1" a
updateTarget7.com.sia.obision.target.v1.target.UpdateTargetRequestV1.google.protobuf.Empty" a
deleteTarget7.com.sia.obision.target.v1.target.DeleteTargetRequestV1.google.protobuf.Empty" i
deleteTargetList;.com.sia.obision.target.v1.target.DeleteTargetListRequestV1.google.protobuf.Empty" _
bookMark9.com.sia.obision.target.v1.target.TargetBookMarkRequestV1.google.protobuf.Empty" BPJ�
  

  

 

 "
	

 "
	
  ?
	
 C
	
 ?
	
	 ?
	

 ?
	
 A
	
 C
	
 ?
	
 %


  


 

  V

  

  2

  =R

 _

 

 ;

 F[

 b

 

 3

 >^

 b

 

 3

 >^

 W

 

 3

 >S

 W

 

 3

 >S

 _

 

 ;

 F[

 U

 

 1

 <Qbproto3
�
5com/sia/obision/target/v1/attach/CreateAttachV1.proto com.sia.obision.target.v1.attachcom/sia/common/UUID.proto/com/sia/obision/target/v1/attach/AttachV1.proto"�
CreateAttachRequestV10
recordId (2.com.sia.common.UUIDRrecordId
file (Rfile
fileName (	RfileName
size (RsizeU
fileExtension (2/.com.sia.obision.target.v1.attach.FileExtensionRfileExtensionBBCreateAttachV1ProtoPJ�
  

  

 )

 "
	

 "

 4
	
 4
	
  #
	
 9


 
 


 


  #

  

  

  !"

 

 

 

 

 

 

 	

 

 

 

 

 

 "

 

 

  !bproto3
�
6com/sia/obision/target/v1/attach/GetAttachListV1.proto com.sia.obision.target.v1.attach/com/sia/obision/target/v1/attach/AttachV1.proto"[
GetAttachListResponseV1@
attach (2(.com.sia.obision.target.v1.attach.AttachRattachBBGetAttachListV1ProtoPJ�
  

  

 )

 "
	

 "

 5
	
 5
	
  9


 	 


 	

  


  



  


  


  
bproto3
�
8com/sia/obision/target/v1/record/RecordEmergencyV1.proto com.sia.obision.target.v1.record"X
RecordEmergencyRequestV1
recordId (	RrecordId 
isEmergency (RisEmergencyBBRecordEmergencyV1ProtoPJ�
  


  

 )

 "
	

 "

 7
	
 7


  



  

  

  

  	

  

 	

 	

 	

 	bproto3