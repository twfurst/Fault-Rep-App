<!SGML "ISO 8879:1986"

   CHARSET                       --DOCUMENT CHARACTER SET--
      BASESET
      "ISO 646-1983//CHARSET
      International Reference Version (IRV)//ESC 2/5 4/0"
      DESCSET
          0   9   UNUSED
          9   2    9
         11   2   UNUSED
         13   1   13
         14  18   UNUSED
         32  95   32
        127   1   UNUSED

   CAPACITY SGMLREF
     TOTALCAP   10000000   -- Changed from 500000 --
     ELEMCAP      500000   -- Changed from  70000 --
     ENTCAP       500000   -- Changed from  70000 --
     IDREFCAP     500000   -- Changed from  70000 --
     ENTCHCAP     500000   -- Changed from  35000 --
     EXGRPCAP     500000   -- Changed from  35000 --
     EXNMCAP      500000   -- Changed from  35000 --
     ATTCHCAP     500000   -- Changed from  35000 --
     GRPCAP      1000000   -- Changed from 150000 --
     IDCAP        500000   -- Changed from 100000 --
     ATTCAP       500000   -- Changed from 100000 --
     LKNMCAP      500000   -- Changed from  35000 --
     LKSETCAP     500000   -- Changed from  35000 --
     AVGRPCAP     500000   -- Changed from 100000 --
     MAPCAP       500000   -- Changed from  35000 --
     NOTCAP       500000   -- Changed from  35000 --
     NOTCHCAP     500000   -- Changed from  35000 --

   SCOPE DOCUMENT

   SYNTAX
     SHUNCHAR  CONTROLS
          0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17
          18 19 20 21 22 23 24 25 26 27 28 29 30 31 127 255
     BASESET   "ISO 646-1983//CHARSET
                International Reference Version (IRV)//ESC 2/5 4/0"
     DESCSET   0 128 0
     FUNCTION  RE                13
               RS                10
               SPACE             32
               TAB      SEPCHAR   9
     NAMING    LCNMSTRT ""
               UCNMSTRT ""
               LCNMCHAR "-."     -- Lower-case hyphen, period are --
               UCNMCHAR "-."     -- same as upper case (45 46).   --
               NAMECASE GENERAL  YES
                        ENTITY   NO
     DELIM     GENERAL  SGMLREF
               SHORTREF SGMLREF
     NAMES     SGMLREF
     QUANTITY  SGMLREF
               NORMSEP       2
               NAMELEN       64    
               LITLEN        2048  
               ATTCNT        1000  -- Changed from 400  --
               GRPCNT        1000  -- Changed from 100  --
     FEATURES
         MINIMIZE
            DATATAG  NO
            OMITTAG  YES
            RANK     NO
            SHORTTAG YES
         LINK
            SIMPLE   NO
            IMPLICIT NO
            EXPLICIT NO
         OTHER
            CONCUR   NO
            SUBDOC   NO   
            FORMAL   YES

   APPINFO NONE           
>

<!--**********************************************************************
    *                                                                    *
    *                        S1000D Issue 3                              *
    *                   Document Type Definition                         *
    *                                                                    *
    *                     Release Version 3.0                            *
    *                       Date: 2007-07-31                             *
    *                                                                    *
    *                                                                    *
    * Formal Public Identifier for the S1000D SGML Declaration:          *
    *                                                                    *
    * "-//S1000D//SYNTAX Reference 20070731//EN"                         *
    ********************************************************************** -->
