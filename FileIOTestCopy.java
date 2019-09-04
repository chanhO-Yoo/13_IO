p:a:c:k:a:g:e: :k:h:.:j:a:v:a:.:i:o:.:b:y:t:e:_:.:f:i:l:e:;::
::
:i:m:p:o:r:t: :j:a:v:a:.:i:o:.:F:i:l:e:;::
:i:m:p:o:r:t: :j:a:v:a:.:i:o:.:F:i:l:e:I:n:p:u:t:S:t:r:e:a:m:;::
:i:m:p:o:r:t: :j:a:v:a:.:i:o:.:F:i:l:e:N:o:t:F:o:u:n:d:E:x:c:e:p:t:i:o:n:;::
:i:m:p:o:r:t: :j:a:v:a:.:i:o:.:F:i:l:e:O:u:t:p:u:t:S:t:r:e:a:m:;::
:i:m:p:o:r:t: :j:a:v:a:.:i:o:.:I:O:E:x:c:e:p:t:i:o:n:;::
::
:p:u:b:l:i:c: :c:l:a:s:s: :F:i:l:e:I:O:T:e:s:t: :{::
::
:	:p:u:b:l:i:c: :s:t:a:t:i:c: :v:o:i:d: :m:a:i:n:(:S:t:r:i:n:g:[:]: :a:r:g:s:): :{::
:	:	:F:i:l:e:I:O:T:e:s:t: :f: :=: :n:e:w: :F:i:l:e:I:O:T:e:s:t:(:):;::
:	:	:f:.:t:e:s:t:1:(:):;::
:	:}::
:	::
:	:p:u:b:l:i:c: :v:o:i:d: :t:e:s:t:1:(:): :{::
:	:	:S:t:r:i:n:g: :f:i:l:e:N:a:m:e: :=: :":s:r:c:/:k:h:/:j:a:v:a:/:i:o:/:b:y:t:e:_:/:f:i:l:e:/:F:i:l:e:I:O:T:e:s:t:.:j:a:v:a:":;::
:	:	:F:i:l:e:I:n:p:u:t:S:t:r:e:a:m: :f:i:s: :=: :n:u:l:l:;::
:	:	:F:i:l:e:O:u:t:p:u:t:S:t:r:e:a:m: :f:o:s: :=: :n:u:l:l:;::
:	:	:F:i:l:e: :n:e:w:F:i:l:e: :=: :n:e:w: :F:i:l:e:(:":F:i:l:e:I:O:T:e:s:t:C:o:p:y:.:j:a:v:a:":):;::
:	:	::
:	:	:t:r:y: :{::
:	:	:	:f:i:s: :=: :n:e:w: :F:i:l:e:I:n:p:u:t:S:t:r:e:a:m:(:f:i:l:e:N:a:m:e:):;::
:	:	:	:f:o:s: :=: :n:e:w: :F:i:l:e:O:u:t:p:u:t:S:t:r:e:a:m:(:n:e:w:F:i:l:e:):;::
:	:	:	::
:	:	:	:i:n:t: :d:a:t:a: :=: :0:;::
:	:	:	::
:	:	:	:w:h:i:l:e:(:(:d:a:t:a:=:f:i:s:.:r:e:a:d:(:):): :!:=: :-:1:): :{::
:	:	:	:	:/:/:1:b:y:t:e:Ï:î:©: :Ï:ù:Ω:Ï:ñ:¥:Ï:ò:®: :Î:ç:∞:Ï:ù:¥:Ì:Ñ:∞:Î:•:º: :Î:¨:∏:Ï:û:ê:Ì:ò:ï:Ï:ú:º:Î:°:ú: :Î:≥:Ä:Ì:ô:ò:Ì:õ:Ñ: :Ï:∂:ú:Î:†:•::
:	:	:	:	:S:y:s:t:e:m:.:o:u:t:.:p:r:i:n:t:(:(:c:h:a:r:):d:a:t:a:):;::
:	:	:	:	::
:	:	:	:	:/:/:Ì:å:å:Ï:ù:º:Ï:ó:ê: :Ï:∂:ú:Î:†:•:(:Ï:ì:∞:Í:∏:∞:)::
:	:	:	:	:f:o:s:.:w:r:i:t:e:(:d:a:t:a:):;::
:	:	:	:	:f:o:s:.:w:r:i:t:e:(:5:8:):;:/:/::: :Ï:ï:Ñ:Ï:ä:§:Ì:Ç:§:Ï:Ω:î:Î:ì:ú: :5:8:Î:¨:∏:Ï:û:ê::
:	:	:	:	::
:	:	:	:}::
:	:	:	::
:	:	:}: :c:a:t:c:h:(:F:i:l:e:N:o:t:F:o:u:n:d:E:x:c:e:p:t:i:o:n: :e:): :{::
:	:	:	:e:.:p:r:i:n:t:S:t:a:c:k:T:r:a:c:e:(:):;::
:	:	:}: :c:a:t:c:h:(:I:O:E:x:c:e:p:t:i:o:n: :e:): :{::
:	:	:	:e:.:p:r:i:n:t:S:t:a:c:k:T:r:a:c:e:(:):;::
:	:	:}: :f:i:n:a:l:l:y: :{::
:	:	:	:t:r:y: :{::
:	:	:	:	:f:i:s:.:c:l:o:s:e:(:):;::
:	:	:	:	:f:o:s:.:c:l:o:s:e:(:):;::
:	:	:	:}:c:a:t:c:h:(:I:O:E:x:c:e:p:t:i:o:n: :e:): :{::
:	:	:	:	:e:.:p:r:i:n:t:S:t:a:c:k:T:r:a:c:e:(:):;::
:	:	:	:}::
:	:	:}::
:	:	::
:	:}::
::
:}::
: