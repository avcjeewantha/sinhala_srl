 / * *  
   *   @ a u t h o r   R a j i t h   P r i y a n g a   ( c )   2 0 1 3   -   r p r i y a n g a @ y a h o o . c o m    
   *    
   *    
   * /  
 p a c k a g e   h e l a b a s a . n o u n s ;  
  
 i m p o r t   h e l a b a s a . H B P O S ;  
 i m p o r t   h e l a b a s a . H B T r a n s f o r m ;  
 i m p o r t   h e l a b a s a . H B T r a n s f o r m R u l e ;  
 i m p o r t   h e l a b a s a . H B T r a n s f o r m R u l e S e t ;  
 i m p o r t   h e l a b a s a . H B W o r d ;  
 i m p o r t   h e l a b a s a . H e l a b a s a ;  
 i m p o r t   h e l a b a s a . n o u n s . s c o r i n g . H B A v a i l a b i l i t y B a s e d S c o r i n g A l g o r i t h m ;  
 i m p o r t   h e l a b a s a . n o u n s . s c o r i n g . H B N o u n S c o r i n g A l g o r i t h m ;  
 i m p o r t   h e l a b a s a . s a n d h i . s c o r i n g . H B N o u n F o r m S c o r i n g A l o g o r i t h m ;  
  
 i m p o r t   j a v a . u t i l . A r r a y L i s t ;  
 i m p o r t   j a v a . u t i l . L i s t ;  
  
 p u b l i c   c l a s s   H B N o u n A n a l y z e r   {  
  
 	 L i s t < H B T r a n s f o r m R u l e S e t >   l i s t _ R u l e S e t   =   n e w   A r r a y L i s t < H B T r a n s f o r m R u l e S e t > ( ) ;  
 	  
 	 p u b l i c   H B N o u n A n a l y z e r ( )    
 	 { 	 	  
 	 	 / / T O D O   L o a d   N o u n   R u l e   S e t s   f r o m   f i l e  
 	 	 / /���  
 	 	 H B T r a n s f o r m R u l e S e t   o R u l e S e t   =   H B T r a n s f o r m R u l e S e t . E x t r a c t R u l e S e t ( " N N - L M = * G " ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " P R - D S = L M +� " ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " P R - I S = L M +��� " ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " P R - P L = L M +� " ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " K R - D S = L M +� " ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " K R - I S = L M +��� " ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " K R - P L = L M +��� " ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " A L - D S = L M +� " ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " A L - D S = L M +���� " ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " A L - P L = L M +��� " ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " A L - P L = L M +��� " ) ;  
 	 	 o R u l e S e t . S e t N a m e ( "���  ��� " ) ;  
 	 	 o R u l e S e t . S e t I D ( 1 ) ;  
 	 	  
 	 	 l i s t _ R u l e S e t . a d d ( o R u l e S e t ) ;  
 	 	 / /���  
 	 	 o R u l e S e t   =   H B T r a n s f o r m R u l e S e t . E x t r a c t R u l e S e t ( " N N - L M = *� " ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " P R - D S = L M +� " ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " P R - I S = L M +��� " ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " P R - P L = L M +� " ) ;    
 	 	 o R u l e S e t . E x t r a c t R u l e ( " K R - D S = L M +� " ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " K R - I S = L M +��� " ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " K R - P L = L M +��� " ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " A L - D S = L M +���� " ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " A L - P L = L M +��� " ) ;  
 	 	 o R u l e S e t . S e t N a m e ( "���  ��� " ) ;  
 	 	 o R u l e S e t . S e t I D ( 2 ) ;  
 	 	 	 	  
 	 	 l i s t _ R u l e S e t . a d d ( o R u l e S e t ) ;  
 	 	 / /�����  
 	 	 o R u l e S e t   =   H B T r a n s f o r m R u l e S e t . E x t r a c t R u l e S e t ( " N N - L M = *� " ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " P R - D S = L M +� " ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " P R - I S = L M +��� " ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " P R - P L = L M +�� " ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " K R - D S = L M +� " ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " K R - I S = L M +�� " ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " K R - P L = L M +��� " ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " A L - D S = L M +� " ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " A L - D S = L M +��� " ) ; 	 	  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " A L - P L = L M +��� " ) ; 	  
 	 	 o R u l e S e t . S e t N a m e ( "�����  ��� " ) ;  
 	 	 o R u l e S e t . S e t I D ( 3 ) ;  
 	 	  
 	 	 l i s t _ R u l e S e t . a d d ( o R u l e S e t ) ;  
 	 	  
 	 	 / /���  
 	 	 o R u l e S e t   =   H B T r a n s f o r m R u l e S e t . E x t r a c t R u l e S e t ( " N N - L M = * G " ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " P R - D S = L M +� " ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " P R - I S = L M +��� " ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " P R - P L = L M " ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " K R - D S = L M +� " ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " K R - I S = L M +��� " ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " K R - P L = L M " ) ;  
 	 	 o R u l e S e t . S e t N a m e ( "���  ��� " ) ;  
 	 	 o R u l e S e t . S e t I D ( 4 ) ;  
 	 	  
 	 	 l i s t _ R u l e S e t . a d d ( o R u l e S e t ) ;  
 	 	  
 	 	 / /���  
 	 	 o R u l e S e t   =   H B T r a n s f o r m R u l e S e t . E x t r a c t R u l e S e t ( " N N - L M = *� " ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " P R - D S = L M +� " ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " P R - I S = L M +��� " ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " P R - P L = L M " ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " K R - D S = L M +� " ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " K R - I S = L M +��� " ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " K R - P L = L M " ) ;  
 	 	 o R u l e S e t . S e t N a m e ( "���  ��� " ) ;  
 	 	 o R u l e S e t . S e t I D ( 5 ) ;  
 	 	 	 	  
 	 	 l i s t _ R u l e S e t . a d d ( o R u l e S e t ) ;  
 	 	  
 	 	 / /��  
 	 	 o R u l e S e t   =   H B T r a n s f o r m R u l e S e t . E x t r a c t R u l e S e t ( " N N - L M = *� " ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " P R - D S = L M +� " ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " P R - I S = L M +��� " ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " P R - P L = L M " ) ;    
 	 	 o R u l e S e t . E x t r a c t R u l e ( " K R - D S = L M +� " ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " K R - I S = L M +��� " ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " K R - P L = L M " ) ;  
 	 	 o R u l e S e t . S e t N a m e ( "��  ��� " ) ;  
 	 	 o R u l e S e t . S e t I D ( 6 ) ;  
 	 	  
 	 	 l i s t _ R u l e S e t . a d d ( o R u l e S e t ) ;  
 	 	  
 	 	 / /����  
 	 	 o R u l e S e t   =   H B T r a n s f o r m R u l e S e t . E x t r a c t R u l e S e t ( " N N - L M = *� " ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " P R - D S = L M +�� " ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " P R - I S = L M +���� " ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " P R - P L = L M +�� " ) ;    
 	 	 o R u l e S e t . E x t r a c t R u l e ( " K R - D S = L M +�� " ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " K R - I S = L M +��� " ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " K R - P L = L M +���� " ) ;  
 	 	 o R u l e S e t . S e t N a m e ( "����  ��� " ) ;  
 	 	 o R u l e S e t . S e t I D ( 7 ) ;  
 	 	  
 	 	 l i s t _ R u l e S e t . a d d ( o R u l e S e t ) ; 	 	  
 	 	  
 	 }  
  
 	 p u b l i c   L i s t < H B T r a n s f o r m R u l e S e t >   G e t R u l e S e t L i s t ( )  
 	 {  
 	 	 r e t u r n   l i s t _ R u l e S e t ;  
 	 }  
 	  
 	 / * *  
 	   *   T O D O   :    
 	   *     1 .   F i n d   t h e   R u l e   S e t s   w i t h   a   m a t c h i n g   L e m m a  
 	   *     2 .   F i n d   a l l   t h e   R u l e   S e t s   t h a t   h a s   R u l e s   t h a t   g i v e s   a   m a t c h i n g   o u t p u t   a n d   f i n d   L e m m a s  
 	   *     3 .   F o r   a l l   t h e   L e m m a s   c o n j u g a t e   a s   N o u n  
 	   *     4 .   F i n d   t h e   c o l l e c t i v e   f r e q u e n c y   o f   a l l   t h e   N o u n   f o r m s  
 	   *     5 .   F i n d   t h e   o n e s   w i t h   l a r g e r   s c o r e s    
 	   *   @ p a r a m   o W o r d  
 	   *   @ p a r a m   l i s t N o u n s  
 	   * /  
 	  
 	 / /   P o p u l a t e s   t h e   n o u n   l i s t   w i t h   a l l   p o s s i b i l i t i e s 	  
 	 p u b l i c   v o i d   A n a l y z e ( H B W o r d   o W o r d ,   L i s t < H B P O S >   l i s t N o u n s )  
 	 { 	 	 	  
 	 	 L i s t < H B T r a n s f o r m R u l e S e t >   o M a t c h i n g R u l e S e t L i s t   =   n e w   A r r a y L i s t < H B T r a n s f o r m R u l e S e t > ( ) ;  
 	 	  
 	 	 F i n d M a t c h i n g R u l e S e t s F o r L e m m a ( o W o r d ,   o M a t c h i n g R u l e S e t L i s t ) ;  
 	 	  
 	 	 f o r ( i n t   i = 0 ;   i < o M a t c h i n g R u l e S e t L i s t . s i z e ( ) ;   i + + )  
 	 	 {  
 	 	 	 H B T r a n s f o r m R u l e S e t   o R u l e S e t   =   o M a t c h i n g R u l e S e t L i s t . g e t ( i ) ; 	 	 	 	  
 	 	 	 	  
 	 	 	 H B N o u n   o N o u n   =   n e w   H B N o u n ( ) ;  
 	 	 	 o N o u n . S e t L e m m a ( o W o r d ) ;  
 	 	 	 o N o u n . S e t R u l e S e t ( o R u l e S e t ) ;  
 	 	 	  
 	 	 	 H B N o u n S c o r i n g A l g o r i t h m   o A l g o   =   n e w   H B A v a i l a b i l i t y B a s e d S c o r i n g A l g o r i t h m ( ) ;  
 	 	 	 o A l g o . E v a l u a t e ( o N o u n ) ;  
 	 	 	 	 	 	  
 	 	 	 H e l a b a s a . G e t L o g ( ) . p r i n t l n ( " N o u n A n a l y z e   :   M a t c h   R u l e S e t   :   L e m m a = "   +   o W o r d . G e t N a t u r a l F o r m ( )   +   "   :   S c o r e = "   +   o N o u n . G e t S c o r e ( )   +   " < b r > \ r < b r > \ n \ r " ) ;  
 	 	 	 o R u l e S e t . D e b u g P r i n t ( ) ;  
 	 	 	  
 	 	 	 l i s t N o u n s . a d d ( o N o u n ) ; 	 	 	 	 	  
 	 	 }  
 	 	  
 	 	 L i s t < H B T r a n s f o r m >   l i s t T r a n s f o r m L i s t   =   n e w   A r r a y L i s t < H B T r a n s f o r m > ( ) ;  
 	 	  
 	 	 F i n d M a t c h i n g T r a n s f o r m s ( o W o r d ,   l i s t T r a n s f o r m L i s t ) ;  
 	 	 	 	 	 	  
 	 	 f o r ( i n t   i = 0 ;   i < l i s t T r a n s f o r m L i s t . s i z e ( ) ;   i + + )  
 	 	 {  
 	 	 	 H B T r a n s f o r m   o T r a n s f o r m   =   l i s t T r a n s f o r m L i s t . g e t ( i ) ;  
  
 	 	 	 H B W o r d   o L e m m a   =   o T r a n s f o r m . G e t L e m m a ( ) ;  
 	 	 	  
 	 	 	 / / H e l a b a s a . G e t L o g ( ) . p r i n t l n ( " N o u n A n a l y z e   :   M a t c h   R u l e   :   L e m m a = "   +   o L e m m a . G e t N a t u r a l F o r m ( )   +     "   :   F o r m = "   +   o W o r d . G e t N a t u r a l F o r m ( )   +   " < b r > \ r < b r > \ n \ r " ) ;  
 	 	 	 i f ( ! I s D u p l i c a t e ( l i s t N o u n s ,   o T r a n s f o r m . G e t R u l e ( ) ,   o L e m m a ) )  
 	 	 	 {  
 	 	 	 	 H B N o u n   o N o u n   =   n e w   H B N o u n ( ) ;  
 	 	 	 	 o N o u n . S e t L e m m a ( o L e m m a ) ;  
 	 	 	 	 o N o u n . S e t R u l e S e t ( o T r a n s f o r m . G e t R u l e ( ) . G e t R u l e S e t ( ) ) ; 	 	 	 	 	 	  
 	 	 	 	 o N o u n . C a l c u l a t e S c o r e ( ) ;  
 	 	 	 	 / / H e l a b a s a . G e t L o g ( ) . p r i n t l n ( " N o u n A n a l y z e   :   M a t c h   R u l e   :   L e m m a = "   +   o L e m a L i s t . g e t ( j ) . G e t N a t u r a l F o r m ( )   +     "   :   F o r m = "   +   o W o r d . G e t N a t u r a l F o r m ( )   +   "   :   S c o r e = "   +   o N o u n . G e t S c o r e ( )   +   "   :   L e m m a S c o r e = "   +   i L e m m a S c o r e   +   " < b r > \ r < b r > \ n \ r " ) ;  
 	 	 	 	 l i s t N o u n s . a d d ( o N o u n ) ;  
 	 	 	 } 	 	 	  
 	 	 } 	 	  
 	 	 / / H e l a b a s a . G e t L o g ( ) . p r i n t l n ( " < b > N o u n A n a l y z e r   :   A n a l y z e   :   W o r d s = "   +   l i s t N o u n s . s i z e ( )   +   " < / b > \ r < b r > \ n \ r " ) ; 	 	 	  
 	 }  
 	  
 	  
 	 / /   P o p u l a t e s   t h e   n o u n   l i s t   w i t h   a l l   p o s s i b i l i t i e s 	  
 	 p u b l i c   v o i d   A n a l y z e L e m m a ( H B W o r d   o W o r d ,   L i s t < H B P O S >   l i s t N o u n s )  
 	 { 	 	 	  
 	 	 L i s t < H B T r a n s f o r m R u l e S e t >   o M a t c h i n g R u l e S e t L i s t   =   n e w   A r r a y L i s t < H B T r a n s f o r m R u l e S e t > ( ) ;  
 	 	  
 	 	 F i n d M a t c h i n g R u l e S e t s F o r L e m m a ( o W o r d ,   o M a t c h i n g R u l e S e t L i s t ) ;  
 	 	  
 	 	 f o r ( i n t   i = 0 ;   i < o M a t c h i n g R u l e S e t L i s t . s i z e ( ) ;   i + + )  
 	 	 {  
 	 	 	 H B T r a n s f o r m R u l e S e t   o R u l e S e t   =   o M a t c h i n g R u l e S e t L i s t . g e t ( i ) ; 	 	 	 	  
 	 	 	 	  
 	 	 	 H B N o u n   o N o u n   =   n e w   H B N o u n ( ) ;  
 	 	 	 o N o u n . S e t L e m m a ( o W o r d ) ;  
 	 	 	 o N o u n . S e t R u l e S e t ( o R u l e S e t ) ;  
 	 	 	 o N o u n . G e n e r a t e F o r m s ( n e w   H B N o u n F o r m S c o r i n g A l o g o r i t h m ( ) ) ;  
 	 	 	  
 	 	 	 H B N o u n S c o r i n g A l g o r i t h m   o A l g o   =   n e w   H B A v a i l a b i l i t y B a s e d S c o r i n g A l g o r i t h m ( ) ;  
 	 	 	 o A l g o . E v a l u a t e ( o N o u n ) ; 	  
 	 	 	  
 	 	 	 / / H e l a b a s a . G e t L o g ( ) . p r i n t l n ( " N o u n A n a l y z e   :   M a t c h   R u l e S e t   :   L e m m a = "   +   o W o r d . G e t N a t u r a l F o r m ( )   +   "   :   S c o r e = "   +   o N o u n . G e t S c o r e ( )   +   " < b r > \ r < b r > \ n \ r " ) ;  
 	 	 	 / / o R u l e S e t . D e b u g P r i n t ( ) ;  
 	 	 	  
 	 	 	 l i s t N o u n s . a d d ( o N o u n ) ; 	 	  
 	 	 } 	 	 	 	  
 	 }  
 	  
 	 p u b l i c   v o i d   A n a l y z e L e m m a ( H B W o r d   o W o r d ,   L i s t < H B P O S >   l i s t N o u n s ,   i n t   i R u l e S e t I D )  
 	 { 	 	 	  
 	 	 i f ( i R u l e S e t I D = = 0 )  
 	 	 {  
 	 	 	   A n a l y z e L e m m a ( o W o r d ,   l i s t N o u n s ) ;  
 	 	 }  
 	 	 e l s e  
 	 	 {  
 	 	 	 H B T r a n s f o r m R u l e S e t   o R u l e S e t   =   G e t R u l e S e t B y I D ( i R u l e S e t I D ) ;  
 	 	 	  
 	 	 	 i f ( o R u l e S e t ! = n u l l )  
 	 	 	 { 	 	 	  
 	 	 	 	 H B N o u n   o N o u n   =   n e w   H B N o u n ( ) ;  
 	 	 	 	 o N o u n . S e t L e m m a ( o W o r d ) ;  
 	 	 	 	 o N o u n . S e t R u l e S e t ( o R u l e S e t ) ;  
 	 	 	 	 o N o u n . G e n e r a t e F o r m s ( n e w   H B N o u n F o r m S c o r i n g A l o g o r i t h m ( ) ) ;  
  
 	 	 	 	 H B N o u n S c o r i n g A l g o r i t h m   o A l g o   =   n e w   H B A v a i l a b i l i t y B a s e d S c o r i n g A l g o r i t h m ( ) ;  
 	 	 	 	 o A l g o . E v a l u a t e ( o N o u n ) ;  
 	 	 	 	  
 	 	 	 	 / / H e l a b a s a . G e t L o g ( ) . p r i n t l n ( " N o u n A n a l y z e   :   M a t c h   R u l e S e t   :   L e m m a = "   +   o W o r d . G e t N a t u r a l F o r m ( )   +   "   :   S c o r e = "   +   o N o u n . G e t S c o r e ( )   +   " < b r > \ r < b r > \ n \ r " ) ;  
 	 	 	 	 / / o R u l e S e t . D e b u g P r i n t ( ) ;  
 	 	 	 	  
 	 	 	 	 l i s t N o u n s . a d d ( o N o u n ) ; 	 	  
 	 	 	 } 	 	 	 	  
 	 	 }  
 	 } 	  
 	  
 	  
 	 / /   P o p u l a t e s   t h e   n o u n   l i s t   w i t h   a l l   p o s s i b i l i t i e s 	  
 	 p u b l i c   v o i d   A n a l y z e 2 ( H B W o r d   o W o r d ,   L i s t < H B P O S >   l i s t N o u n s )  
 	 { 	 	  
 	 	 H B T r a n s f o r m R u l e S e t   o L e m m a R u l e S e t   =   F i n d B e s t M a t c h i n g R u l e S e t F o r L e m m a ( o W o r d ) ;  
 	 	 i f ( o L e m m a R u l e S e t ! = n u l l )  
 	 	 {  
 	 	 	 i n t   i S c o r e   =   o L e m m a R u l e S e t . M a t c h L e m m a ( o W o r d ) ;  
 	 	 	 i f ( i S c o r e   >   0 )  
 	 	 	 {  
 	 	 	 	 / / H e l a b a s a . G e t L o g ( ) . p r i n t l n ( " N o u n A n a l y z e   :   M a t c h   R u l e S e t   :   L e m m a = "   +   o W o r d . G e t N a t u r a l F o r m ( )   +   "   :   S c o r e = "   +   i S c o r e   +   " < b r > \ r < b r > \ n \ r " ) ;  
 	 	 	 	 / / o L e m m a R u l e S e t . D e b u g P r i n t ( ) ;  
 	 	 	 	  
 	 	 	 	 H B N o u n   o N o u n   =   n e w   H B N o u n ( ) ;  
 	 	 	 	 o N o u n . S e t L e m m a ( o W o r d ) ;  
 	 	 	 	 o N o u n . S e t R u l e S e t ( o L e m m a R u l e S e t ) ;  
 	 	 	 	 / / o N o u n . S e t S c o r e ( i S c o r e ) ;  
 	 	 	 	 / / o N o u n . C a l c u l a t e S c o r e ( ) ;  
 	 	 	 	 l i s t N o u n s . a d d ( o N o u n ) ;  
 	 	 	 } 	 	 	  
 	 	 } 	 	  
 	 	 L i s t < H B T r a n s f o r m R u l e >   o F o r m R u l e L i s t   =   F i n d B e s t M a t c h i n g R u l e F o r F o r m s ( o W o r d ) ;  
 	 	 i f ( o F o r m R u l e L i s t ! = n u l l )  
 	 	 { 	 	 	  
 	 	 	 f o r ( i n t   i = 0 ;   i < o F o r m R u l e L i s t . s i z e ( ) ;   i + + )  
 	 	 	 {  
 	 	 	 	 H B T r a n s f o r m R u l e   o F o r m R u l e   =   o F o r m R u l e L i s t . g e t ( i ) ;  
 	 	 	 	 l o n g   i S c o r e   =   o F o r m R u l e . M a t c h F o r m ( o W o r d ) ;  
 	 	 	 	 i f ( i S c o r e   >   0 )  
 	 	 	 	 { 	 	 	 	 	 	  
 	 	 	 	 	 o F o r m R u l e . D e b u g P r i n t ( ) ;  
 	 	 	 	 	  
 	 	 	 	 	 L i s t < H B W o r d >   o L e m a L i s t   =   o F o r m R u l e . E x t r a c t L e m m a ( o W o r d ) ;  
 	 	 	 	 	  
 	 	 	 	 	 f o r ( i n t   j = 0 ;   j < o L e m a L i s t . s i z e ( ) ;   j + + )  
 	 	 	 	 	 {  
 	 	 	 	 	 	 i n t   i L e m m a S c o r e   =   o F o r m R u l e . G e t R u l e S e t ( ) . M a t c h L e m m a ( o L e m a L i s t . g e t ( j ) ) ;  
 	 	 	 	 	 	 i f ( i L e m m a S c o r e > 0 )  
 	 	 	 	 	 	 {  
 	 	 	 	 	 	 	 H e l a b a s a . G e t L o g ( ) . p r i n t l n ( " N o u n A n a l y z e   :   M a t c h   R u l e   :   L e m m a = "   +   o L e m a L i s t . g e t ( j ) . G e t N a t u r a l F o r m ( )   +     "   :   F o r m = "   +   o W o r d . G e t N a t u r a l F o r m ( )   +   "   :   S c o r e = "   +   i S c o r e   +   "   :   L e m m a S c o r e = "   +   i L e m m a S c o r e   +   " < b r > \ r < b r > \ n \ r " ) ;  
 	 	 	 	 	 	 	 i f ( ! I s D u p l i c a t e ( l i s t N o u n s ,   o F o r m R u l e ,   o L e m a L i s t . g e t ( j ) ) )  
 	 	 	 	 	 	 	 {  
 	 	 	 	 	 	 	 	 H B N o u n   o N o u n   =   n e w   H B N o u n ( ) ;  
 	 	 	 	 	 	 	 	 o N o u n . S e t L e m m a ( o L e m a L i s t . g e t ( j ) ) ;  
 	 	 	 	 	 	 	 	 o N o u n . S e t R u l e S e t ( o F o r m R u l e . G e t R u l e S e t ( ) ) ;  
 	 	 	 	 	 	 	 	 / / o N o u n . S e t S c o r e ( i S c o r e ) ;  
 	 	 	 	 	 	 	 	 o N o u n . C a l c u l a t e S c o r e ( ) ;  
 	 	 	 	 	 	 	 	 l i s t N o u n s . a d d ( o N o u n ) ;  
 	 	 	 	 	 	 	 }  
 	 	 	 	 	 	 }  
 	 	 	 	 	 	 e l s e  
 	 	 	 	 	 	 {  
 	 	 	 	 	 	 	 H e l a b a s a . G e t L o g ( ) . p r i n t l n ( " N o u n A n a l y z e   :   L e m m a   D o e s   n o t   m a t c h   R u l e   S e t   :   L e m m a = "   +   o L e m a L i s t . g e t ( j ) . G e t N a t u r a l F o r m ( )   +   "   :   L e m m a S c o r e = "   +   i L e m m a S c o r e   +   " < b r > \ r < b r > \ n \ r " ) ;  
 	 	 	 	 	 	 }  
 	 	 	 	 	 }  
 	 	 	 	 }  
 	 	 	 }  
 	 	 } 	  
 	 }  
 	  
 	 p r i v a t e   b o o l e a n   I s D u p l i c a t e ( L i s t < H B P O S >   o N o u n L i s t ,   H B T r a n s f o r m R u l e   o R u l e ,   H B W o r d   o L e m m a )  
 	 {  
 	 	 f o r ( i n t   j = 0 ;   j < o N o u n L i s t . s i z e ( ) ;   j + + )  
 	 	 { 	 	 	 	  
 	 	 	 H B P O S   o N o u n   =   o N o u n L i s t . g e t ( j ) ; 	 	 	  
 	 	 	 i f ( o N o u n . G e t R u l e S e t ( ) = = o R u l e . G e t R u l e S e t ( )   & &   o N o u n . G e t L e m m a ( ) . E q u a l s ( o L e m m a ) )  
 	 	 	 {  
 	 	 	 	 r e t u r n   t r u e ;  
 	 	 	 }  
 	 	 } 	 	  
 	 	  
 	 	 r e t u r n   f a l s e ;  
 	 }  
 	  
 	 p r i v a t e   H B T r a n s f o r m R u l e S e t   F i n d B e s t M a t c h i n g R u l e S e t F o r L e m m a ( H B W o r d   o W o r d )  
 	 { 	 	 	 	  
 	 	 i n t   i M a t c h P o s   =   - 1 ;  
 	 	 i n t   i M a x S c o r e   =   0 ;  
 	 	 i n t   i S c o r e   =   0 ;  
 	 	 i n t   i C o u n t   =   l i s t _ R u l e S e t . s i z e ( ) ;  
 	 	  
 	 	 f o r ( i n t   i = 0 ;   i < i C o u n t ;   i + + )  
 	 	 { 	 	 	  
 	 	 	 H B T r a n s f o r m R u l e S e t   o R u l e S e t   =   l i s t _ R u l e S e t . g e t ( i ) ; 	 	  
 	 	 	 i S c o r e   =   o R u l e S e t . M a t c h L e m m a ( o W o r d ) ;    
 	 	 	  
 	 	 	 / / H e l a b a s a . G e t L o g ( ) . p r i n t l n ( " C h e c k i n g   :   R u l e S e t   "   +     ( i + 1 )   +   "   :   S c o r e = "   +   i S c o r e   +   " < b r > \ r " ) ;  
 	 	 	 / / o R u l e S e t . D e b u g P r i n t ( ) ;  
 	 	 	  
 	 	 	 i f ( i S c o r e   >   i M a x S c o r e )  
 	 	 	 {  
 	 	 	 	 i M a t c h P o s   =   i ;  
 	 	 	 	 i M a x S c o r e   =   i S c o r e ;  
 	 	 	 }  
 	 	 }  
 	 	  
 	 	 i f ( i M a t c h P o s   > =   0 )  
 	 	 {  
 	 	 	 r e t u r n     l i s t _ R u l e S e t . g e t ( i M a t c h P o s ) ;  
 	 	 }  
 	 	 e l s e 	 	 	  
 	 	 	 r e t u r n   n u l l ; 	 	  
 	 }  
 	  
 	 p u b l i c   v o i d   F i n d M a t c h i n g R u l e S e t s F o r L e m m a ( H B W o r d   o W o r d ,   L i s t < H B T r a n s f o r m R u l e S e t >   l i s t R u l e S e t s )  
 	 { 	 	 	 	  
 	 	 i n t   i S c o r e   =   0 ;  
 	 	 i n t   i C o u n t   =   l i s t _ R u l e S e t . s i z e ( ) ;  
 	 	  
 	 	 f o r ( i n t   i = 0 ;   i < i C o u n t ;   i + + )  
 	 	 { 	 	 	  
 	 	 	 H B T r a n s f o r m R u l e S e t   o R u l e S e t   =   l i s t _ R u l e S e t . g e t ( i ) ; 	 	  
 	 	 	 i S c o r e   =   o R u l e S e t . M a t c h L e m m a ( o W o r d ) ;    
 	 	 	  
 	 	 	 / / H e l a b a s a . G e t L o g ( ) . p r i n t l n ( " C h e c k i n g   :   R u l e S e t   < b r > \ r " ) ;  
 	 	 	 / / o R u l e S e t . D e b u g P r i n t ( ) ;  
 	 	 	  
 	 	 	 i f ( i S c o r e   >   0 )  
 	 	 	 {  
 	 	 	 	 / / H e l a b a s a . G e t L o g ( ) . p r i n t l n ( " M a t c h   :   R u l e S e t   "   +     ( i + 1 )   +   "   :   S c o r e = "   +   i S c o r e   +   " < b r > \ r " ) ;  
 	 	 	 	 l i s t R u l e S e t s . a d d ( o R u l e S e t ) ;  
 	 	 	 }  
 	 	 } 	 	 	 	  
 	 } 	  
  
 	 p r i v a t e   H B T r a n s f o r m R u l e S e t   G e t R u l e S e t B y I D ( i n t   i I D )  
 	 {  
 	 	 i n t   i C o u n t   =   l i s t _ R u l e S e t . s i z e ( ) ;  
 	 	  
 	 	 f o r ( i n t   i = 0 ;   i < i C o u n t ;   i + + )  
 	 	 {  
 	 	 	 H B T r a n s f o r m R u l e S e t   o R u l e S e t   =   l i s t _ R u l e S e t . g e t ( i ) ;  
 	 	 	 i f ( o R u l e S e t . G e t I D ( ) = = i I D )  
 	 	 	 {  
 	 	 	 	 r e t u r n   o R u l e S e t ;  
 	 	 	 }  
 	 	 }  
 	 	 r e t u r n   n u l l ;  
 	 }  
 	  
 	 p r i v a t e   L i s t < H B T r a n s f o r m R u l e >   F i n d B e s t M a t c h i n g R u l e F o r F o r m s ( H B W o r d   o W o r d )  
 	 {  
 	 	 L i s t < H B T r a n s f o r m R u l e >   o M a t c h i n g R u l e L i s t   =   n u l l ;    
  
 	 	 i n t   i C o u n t   =   l i s t _ R u l e S e t . s i z e ( ) ;  
 	 	  
 	 	 f o r ( i n t   i = 0 ;   i < i C o u n t ;   i + + )  
 	 	 {  
 	 	 	 H B T r a n s f o r m R u l e S e t   o R u l e S e t   =   l i s t _ R u l e S e t . g e t ( i ) ; 	 	 	  
 	 	 	 L i s t < H B T r a n s f o r m R u l e >   o R u l e L i s t   =   o R u l e S e t . M a t c h F o r m s ( o W o r d ) ;    
 	 	 	 i f ( o R u l e L i s t ! = n u l l )  
 	 	 	 {  
 	 	 	 	 f o r ( i n t   j = 0 ;   j < o R u l e L i s t . s i z e ( ) ;   j + + )  
 	 	 	 	 {  
 	 	 	 	 	 i f ( o M a t c h i n g R u l e L i s t = = n u l l )  
 	 	 	 	 	 {  
 	 	 	 	 	 	 o M a t c h i n g R u l e L i s t   =   n e w   A r r a y L i s t < H B T r a n s f o r m R u l e > ( ) ; 	 	 	 	 	 	  
 	 	 	 	 	 }  
 	 	 	 	 	 o M a t c h i n g R u l e L i s t . a d d ( o R u l e L i s t . g e t ( j ) ) ;  
 	 	 	 	 	 H e l a b a s a . G e t L o g ( ) . p r i n t l n ( " M a t c h i n g   F o r m s   :   R u l e S e t = "   +     ( i + 1 )   +   " R u l e = "   +   ( j + 1 )   +   " < b r > \ r " ) ;  
 	 	 	 	 	 o R u l e L i s t . g e t ( j ) . D e b u g P r i n t ( ) ;  
 	 	 	 	 }  
 	 	 	 }  
 	 	 }  
 	 	  
 	 	 r e t u r n   o M a t c h i n g R u l e L i s t ;  
 	 }  
 	  
 	 p r i v a t e   v o i d   F i n d M a t c h i n g T r a n s f o r m s ( H B W o r d   o W o r d ,   L i s t < H B T r a n s f o r m >   l i s t T r a n s f o r m s )  
 	 { 	 	  
 	 	 i n t   i C o u n t   =   l i s t _ R u l e S e t . s i z e ( ) ;  
 	 	  
 	 	 f o r ( i n t   i = 0 ;   i < i C o u n t ;   i + + )  
 	 	 {  
 	 	 	 H B T r a n s f o r m R u l e S e t   o R u l e S e t   =   l i s t _ R u l e S e t . g e t ( i ) ; 	 	 	  
 	 	 	 o R u l e S e t . M a t c h F o r m s ( o W o r d ,   l i s t T r a n s f o r m s ) ; 	 	 	  
 	 	 } 	 	  
 	 }  
 	  
 	  
 }  
