package top.niunaijun.obfuscator;


import java.util.Arrays;

public class ObfDic {

    public static void setDic(String[] dic){
        try {
            System.out.println("AAAA"+ Arrays.toString(dic));
        } catch (Exception e) {
           e.printStackTrace();
        }
        if (dic != null && dic.length != 0){
            ObfDic.dic = dic;
        }
    }

    public static String[] dic = {"a",
            "b",
            "c",
            "d",
            "e",
            "f",
            "g",
            "h",
            "i",
            "j",
            "k",
            "l",
            "m",
            "n",
            "o",
            "p",
            "q",
            "r",
            "s",
            "t",
            "u",
            "v",
            "w",
            "x",
            "y",
            "z",
            "ab",
            "ac",
            "ad",
            "ae",
            "af",
            "ag",
            "ah",
            "ai",
            "aj",
            "ak",
            "al",
            "am",
            "an",
            "ao",
            "ap",
            "aq",
            "ar",
            "as",
            "at",
            "au",
            "av",
            "aw",
            "ax",
            "ay",
            "az",
            "ba",
            "bc",
            "bd",
            "be",
            "bf",
            "bg",
            "bh",
            "bi",
            "bj",
            "bk",
            "bl",
            "bm",
            "bn",
            "bo",
            "bp",
            "bq",
            "br",
            "bs",
            "bt",
            "bu",
            "bv",
            "bw",
            "bx",
            "by",
            "bz",
            "ca",
            "cb",
            "cd",
            "ce",
            "cf",
            "cg",
            "ch",
            "ci",
            "cj",
            "ck",
            "cl",
            "cm",
            "cn",
            "co",
            "cp",
            "cq",
            "cr",
            "cs",
            "ct",
            "cu",
            "cv",
            "cw",
            "cx",
            "cy",
            "cz",
            "da",
            "db",
            "dc",
            "de",
            "df",
            "dg",
            "dh",
            "di",
            "dj",
            "dk",
            "dl",
            "dm",
            "dn",
            "do",
            "dp",
            "dq",
            "dr",
            "ds",
            "dt",
            "du",
            "dv",
            "dw",
            "dx",
            "dy",
            "dz",
            "ea",
            "eb",
            "ec",
            "ed",
            "ef",
            "eg",
            "eh",
            "ei",
            "ej",
            "ek",
            "el",
            "em",
            "en",
            "eo",
            "ep",
            "eq",
            "er",
            "es",
            "et",
            "eu",
            "ev",
            "ew",
            "ex",
            "ey",
            "ez",
            "fa",
            "fb",
            "fc",
            "fd",
            "fe",
            "fg",
            "fh",
            "fi",
            "fj",
            "fk",
            "fl",
            "fm",
            "fn",
            "fo",
            "fp",
            "fq",
            "fr",
            "fs",
            "ft",
            "fu",
            "fv",
            "fw",
            "fx",
            "fy",
            "fz",
            "ga",
            "gb",
            "gc",
            "gd",
            "ge",
            "gf",
            "gh",
            "gi",
            "gj",
            "gk",
            "gl",
            "gm",
            "gn",
            "go",
            "gp",
            "gq",
            "gr",
            "gs",
            "gt",
            "gu",
            "gv",
            "gw",
            "gx",
            "gy",
            "gz",
            "ha",
            "hb",
            "hc",
            "hd",
            "he",
            "hf",
            "hg",
            "hi",
            "hj",
            "hk",
            "hl",
            "hm",
            "hn",
            "ho",
            "hp",
            "hq",
            "hr",
            "hs",
            "ht",
            "hu",
            "hv",
            "hw",
            "hx",
            "hy",
            "hz",
            "ia",
            "ib",
            "ic",
            "id",
            "ie",
            "if",
            "ig",
            "ih",
            "ij",
            "ik",
            "il",
            "im",
            "in",
            "io",
            "ip",
            "iq",
            "ir",
            "is",
            "it",
            "iu",
            "iv",
            "iw",
            "ix",
            "iy",
            "iz",
            "ja",
            "jb",
            "jc",
            "jd",
            "je",
            "jf",
            "jg",
            "jh",
            "ji",
            "jk",
            "jl",
            "jm",
            "jn",
            "jo",
            "jp",
            "jq",
            "jr",
            "js",
            "jt",
            "ju",
            "jv",
            "jw",
            "jx",
            "jy",
            "jz",
            "ka",
            "kb",
            "kc",
            "kd",
            "ke",
            "kf",
            "kg",
            "kh",
            "ki",
            "kj",
            "kl",
            "km",
            "kn",
            "ko",
            "kp",
            "kq",
            "kr",
            "ks",
            "kt",
            "ku",
            "kv",
            "kw",
            "kx",
            "ky",
            "kz",
            "la",
            "lb",
            "lc",
            "ld",
            "le",
            "lf",
            "lg",
            "lh",
            "li",
            "lj",
            "lk",
            "lm",
            "ln",
            "lo",
            "lp",
            "lq",
            "lr",
            "ls",
            "lt",
            "lu",
            "lv",
            "lw",
            "lx",
            "ly",
            "lz",
            "ma",
            "mb",
            "mc",
            "md",
            "me",
            "mf",
            "mg",
            "mh",
            "mi",
            "mj",
            "mk",
            "ml",
            "mn",
            "mo",
            "mp",
            "mq",
            "mr",
            "ms",
            "mt",
            "mu",
            "mv",
            "mw",
            "mx",
            "my",
            "mz",
            "abc",
            "abd",
            "abe",
            "abf",
            "abg",
            "abh",
            "abi",
            "abj",
            "abk",
            "abl",
            "abm",
            "abn",
            "abo",
            "abp",
            "abq",
            "abr",
            "abs",
            "abt",
            "abu",
            "abv",
            "abw",
            "abx",
            "aby",
            "abz",
            "acb",
            "acd",
            "ace",
            "acf",
            "acg",
            "ach",
            "aci",
            "acj",
            "ack",
            "acl",
            "acm",
            "acn",
            "aco",
            "acp",
            "acq",
            "acr",
            "acs",
            "act",
            "acu",
            "acv",
            "acw",
            "acx",
            "acy",
            "acz",
            "adb",
            "adc",
            "ade",
            "adf",
            "adg",
            "adh",
            "adi",
            "adj",
            "adk",
            "adl",
            "adm",
            "adn",
            "ado",
            "adp",
            "adq",
            "adr",
            "ads",
            "adt",
            "adu",
            "adv",
            "adw",
            "adx",
            "ady",
            "adz",
            "aeb",
            "aec",
            "aed",
            "aef",
            "aeg",
            "aeh",
            "aei",
            "aej",
            "aek",
            "ael",
            "aem",
            "aen",
            "aeo",
            "aep",
            "aeq",
            "aer",
            "aes",
            "aet",
            "aeu",
            "aev",
            "aew",
            "aex",
            "aey",
            "aez",
            "afb",
            "afc",
            "afd",
            "afe",
            "afg",
            "afh",
            "afi",
            "afj",
            "afk",
            "afl",
            "afm",
            "afn",
            "afo",
            "afp",
            "afq",
            "afr",
            "afs",
            "aft",
            "afu",
            "afv",
            "afw",
            "afx",
            "afy",
            "afz",
            "agb",
            "agc",
            "agd",
            "age",
            "agf",
            "agh",
            "agi",
            "agj",
            "agk",
            "agl",
            "agm",
            "agn",
            "ago",
            "agp",
            "agq",
            "agr",
            "ags",
            "agt",
            "agu",
            "agv",
            "agw",
            "agx",
            "agy",
            "agz",
            "ahb",
            "ahc",
            "ahd",
            "ahe",
            "ahf",
            "ahg",
            "ahi",
            "ahj",
            "ahk",
            "ahl",
            "ahm",
            "ahn",
            "aho",
            "ahp",
            "ahq",
            "ahr",
            "ahs",
            "aht",
            "ahu",
            "ahv",
            "ahw",
            "ahx",
            "ahy",
            "ahz",
            "aib",
            "aic",
            "aid",
            "aie",
            "aif",
            "aig",
            "aih",
            "aij",
            "aik",
            "ail",
            "aim",
            "ain",
            "aio",
            "aip",
            "aiq",
            "air",
            "ais",
            "ait",
            "aiu",
            "aiv",
            "aiw",
            "aix",
            "aiy",
            "aiz",
            "ajb",
            "ajc",
            "ajd",
            "aje",
            "ajf",
            "ajg",
            "ajh",
            "aji",
            "ajk",
            "ajl",
            "ajm",
            "ajn",
            "ajo",
            "ajp",
            "ajq",
            "ajr",
            "ajs",
            "ajt",
            "aju",
            "ajv",
            "ajw",
            "ajx",
            "ajy",
            "ajz",
            "akb",
            "akc",
            "akd",
            "ake",
            "akf",
            "akg",
            "akh",
            "aki",
            "akj",
            "akl",
            "akm",
            "akn",
            "ako",
            "akp",
            "akq",
            "akr",
            "aks",
            "akt",
            "aku",
            "akv",
            "akw",
            "akx",
            "aky",
            "akz",
            "alb",
            "alc",
            "ald",
            "ale",
            "alf",
            "alg",
            "alh",
            "ali",
            "alj",
            "alk",
            "alm",
            "aln",
            "alo",
            "alp",
            "alq",
            "alr",
            "als",
            "alt",
            "alu",
            "alv",
            "alw",
            "alx",
            "aly",
            "alz",
            "amb",
            "amc",
            "amd",
            "ame",
            "amf",
            "amg",
            "amh",
            "ami",
            "amj",
            "amk",
            "aml",
            "amn",
            "amo",
            "amp",
            "amq",
            "amr",
            "ams",
            "amt",
            "amu",
            "amv",
            "amw",
            "amx",
            "amy",
            "amz",
            "anb",
            "anc",
            "and",
            "ane",
            "anf",
            "ang",
            "anh",
            "ani",
            "anj",
            "ank",
            "anl",
            "anm",
            "ano",
            "anp",
            "anq",
            "anr",
            "ans",
            "ant",
            "anu",
            "anv",
            "anw",
            "anx",
            "any",
            "anz",
            "aob",
            "aoc",
            "aod",
            "aoe",
            "aof",
            "aog",
            "aoh",
            "aoi",
            "aoj",
            "aok",
            "aol",
            "aom",
            "aon",
            "aop",
            "aoq",
            "aor",
            "aos",
            "aot",
            "aou",
            "aov",
            "aow",
            "aox",
            "aoy",
            "aoz",
            "apb",
            "apc",
            "apd",
            "ape",
            "apf",
            "apg",
            "aph",
            "api",
            "apj",
            "apk",
            "apl",
            "apm",
            "apn",
            "apo",
            "apq",
            "apr",
            "aps",
            "apt",
            "apu",
            "apv",
            "apw",
            "apx",
            "apy",
            "apz",
            "aqb",
            "aqc",
            "aqd",
            "aqe",
            "aqf",
            "aqg",
            "aqh",
            "aqi",
            "aqj",
            "aqk",
            "aql",
            "aqm",
            "aqn",
            "aqo",
            "aqp",
            "aqr",
            "aqs",
            "aqt",
            "aqu",
            "aqv",
            "aqw",
            "aqx",
            "aqy",
            "aqz",
            "arb",
            "arc",
            "ard",
            "are",
            "arf",
            "arg",
            "arh",
            "ari",
            "arj",
            "ark",
            "arl",
            "arm",
            "arn",
            "aro",
            "arp",
            "arq",
            "ars",
            "art",
            "aru",
            "arv",
            "arw",
            "arx",
            "ary",
            "arz",
            "asb",
            "asc",
            "asd",
            "ase",
            "asf",
            "asg",
            "ash",
            "asi",
            "asj",
            "ask",
            "asl",
            "asm",
            "asn",
            "aso",
            "asp",
            "asq",
            "asr",
            "ast",
            "asu",
            "asv",
            "asw",
            "asx",
            "asy",
            "asz",
            "atb",
            "atc",
            "atd",
            "ate",
            "atf",
            "atg",
            "ath",
            "ati",
            "atj",
            "atk",
            "atl",
            "atm",
            "atn",
            "ato",
            "atp",
            "atq",
            "atr",
            "ats",
            "atu",
            "atv",
            "atw",
            "atx",
            "aty",
            "atz",
            "aub",
            "auc",
            "aud",
            "aue",
            "auf",
            "aug",
            "auh",
            "aui",
            "auj",
            "auk",
            "aul",
            "aum",
            "aun",
            "auo",
            "aup",
            "auq",
            "aur",
            "aus",
            "aut",
            "auv",
            "auw",
            "aux",
            "auy",
            "auz",
            "avb",
            "avc",
            "avd",
            "ave",
            "avf",
            "avg",
            "avh",
            "avi",
            "avj",
            "avk",
            "avl",
            "avm",
            "avn",
            "avo",
            "avp",
            "avq",
            "avr",
            "avs",
            "avt",
            "avu",
            "avw",
            "avx",
            "avy",
            "avz",
            "awb",
            "awc",
            "awd",
            "awe",
            "awf",
            "awg",
            "awh",
            "awi",
            "awj",
            "awk",
            "awl",
            "awm",
            "awn",
            "awo",
            "awp",
            "awq",
            "awr",
            "aws",
            "awt",
            "awu",
            "awv",
            "awx",
            "awy",
            "awz",
            "axb",
            "axc",
            "axd",
            "axe",
            "axf",
            "axg",
            "axh",
            "axi",
            "axj",
            "axk",
            "axl",
            "axm",
            "axn",
            "axo",
            "axp",
            "axq",
            "axr",
            "axs",
            "axt",
            "axu",
            "axv",
            "axw",
            "axy",
            "axz",
            "ayb",
            "ayc",
            "ayd",
            "aye",
            "ayf",
            "ayg",
            "ayh",
            "ayi",
            "ayj",
            "ayk",
            "ayl",
            "aym",
            "ayn",
            "ayo",
            "ayp",
            "ayq",
            "ayr",
            "ays",
            "ayt",
            "ayu",
            "ayv",
            "ayw",
            "ayx",
            "ayz",
            "azb",
            "azc",
            "azd",
            "aze",
            "azf",
            "azg",
            "azh",
            "azi",
            "azj",
            "azk",
            "azl",
            "azm",
            "azn",
            "azo",
            "azp",
            "azq",
            "azr",
            "azs",
            "azt",
            "azu",
            "azv",
            "azw",
            "azx",
            "azy",
            "bac",
            "bad",
            "bae",
            "baf",
            "bag",
            "bah",
            "bai",
            "baj",
            "bak",
            "bal",
            "bam",
            "ban",
            "bao",
            "bap",
            "baq",
            "bar",
            "bas",
            "bat",
            "bau",
            "bav",
            "baw",
            "bax",
            "bay",
            "baz",
            "bca",
            "bcd",
            "bce",
            "bcf",
            "bcg",
            "bch",
            "bci",
            "bcj",
            "bck",
            "bcl",
            "bcm",
            "bcn",
            "bco",
            "bcp",
            "bcq",
            "bcr",
            "bcs",
            "bct",
            "bcu",
            "bcv",
            "bcw",
            "bcx",
            "bcy",
            "bcz",
            "bda",
            "bdc",
            "bde",
            "bdf",
            "bdg",
            "bdh",
            "bdi",
            "bdj",
            "bdk",
            "bdl",
            "bdm",
            "bdn",
            "bdo",
            "bdp",
            "bdq",
            "bdr",
            "bds",
            "bdt",
            "bdu",
            "bdv",
            "bdw",
            "bdx",
            "bdy",
            "bdz",
            "bea",
            "bec",
            "bed",
            "bef",
            "beg",
            "beh",
            "bei",
            "bej",
            "bek",
            "bel",
            "bem",
            "ben",
            "beo",
            "bep",
            "beq",
            "ber",
            "bes",
            "bet",
            "beu",
            "bev",
            "bew",
            "bex",
            "bey",
            "bez",
            "bfa",
            "bfc",
            "bfd",
            "bfe",
            "bfg",
            "bfh",
            "bfi",
            "bfj",
            "bfk",
            "bfl",
            "bfm",
            "bfn",
            "bfo",
            "bfp",
            "bfq",
            "bfr",
            "bfs",
            "bft",
            "bfu",
            "bfv",
            "bfw",
            "bfx",
            "bfy",
            "bfz",
            "bga",
            "bgc",
            "bgd",
            "bge",
            "bgf",
            "bgh",
            "bgi",
            "bgj",
            "bgk",
            "bgl",
            "bgm",
            "bgn",
            "bgo",
            "bgp",
            "bgq",
            "bgr",
            "bgs",
            "bgt",
            "bgu",
            "bgv",
            "bgw",
            "bgx",
            "bgy",
            "bgz",
            "bha",
            "bhc",
            "bhd",
            "bhe",
            "bhf",
            "bhg",
            "bhi",
            "bhj",
            "bhk",
            "bhl",
            "bhm",
            "bhn",
            "bho",
            "bhp",
            "bhq",
            "bhr",
            "bhs",
            "bht",
            "bhu",
            "bhv",
            "bhw",
            "bhx",
            "bhy",
            "bhz",
            "bia",
            "bic",
            "bid",
            "bie",
            "bif",
            "big",
            "bih",
            "bij",
            "bik",
            "bil",
            "bim",
            "bin",
            "bio",
            "bip",
            "biq",
            "bir",
            "bis",
            "bit",
            "biu",
            "biv",
            "biw",
            "bix",
            "biy",
            "biz",
            "bja",
            "bjc",
            "bjd",
            "bje",
            "bjf",
            "bjg",
            "bjh",
            "bji",
            "bjk",
            "bjl",
            "bjm",
            "bjn",
            "bjo",
            "bjp",
            "bjq",
            "bjr",
            "bjs",
            "bjt",
            "bju",
            "bjv",
            "bjw",
            "bjx",
            "bjy",
            "bjz",
            "bka",
            "bkc",
            "bkd",
            "bke",
            "bkf",
            "bkg",
            "bkh",
            "bki",
            "bkj",
            "bkl",
            "bkm",
            "bkn",
            "bko",
            "bkp",
            "bkq",
            "bkr",
            "bks",
            "bkt",
            "bku",
            "bkv",
            "bkw",
            "bkx",
            "bky",
            "bkz",
            "bla",
            "blc",
            "bld",
            "ble",
            "blf",
            "blg",
            "blh",
            "bli",
            "blj",
            "blk",
            "blm",
            "bln",
            "blo",
            "blp",
            "blq",
            "blr",
            "bls",
            "blt",
            "blu",
            "blv",
            "blw",
            "blx",
            "bly",
            "blz",
            "bma",
            "bmc",
            "bmd",
            "bme",
            "bmf",
            "bmg",
            "bmh",
            "bmi",
            "bmj",
            "bmk",
            "bml",
            "bmn",
            "bmo",
            "bmp",
            "bmq",
            "bmr",
            "bms",
            "bmt",
            "bmu",
            "bmv",
            "bmw",
            "bmx",
            "bmy",
            "bmz",
            "bna",
            "bnc",
            "bnd",
            "bne",
            "bnf",
            "bng",
            "bnh",
            "bni",
            "bnj",
            "bnk",
            "bnl",
            "bnm",
            "bno",
            "bnp",
            "bnq",
            "bnr",
            "bns",
            "bnt",
            "bnu",
            "bnv",
            "bnw",
            "bnx",
            "bny",
            "bnz",
            "boa",
            "boc",
            "bod",
            "boe",
            "bof",
            "bog",
            "boh",
            "boi",
            "boj",
            "bok",
            "bol",
            "bom",
            "bon",
            "bop",
            "boq",
            "bor",
            "bos",
            "bot",
            "bou",
            "bov",
            "bow",
            "box",
            "boy",
            "boz",
            "bpa",
            "bpc",
            "bpd",
            "bpe",
            "bpf",
            "bpg",
            "bph",
            "bpi",
            "bpj",
            "bpk",
            "bpl",
            "bpm",
            "bpn",
            "bpo",
            "bpq",
            "bpr",
            "bps",
            "bpt",
            "bpu",
            "bpv",
            "bpw",
            "bpx",
            "bpy",
            "bpz",
            "bqa",
            "bqc",
            "bqd",
            "bqe",
            "bqf",
            "bqg",
            "bqh",
            "bqi",
            "bqj",
            "bqk",
            "bql",
            "bqm",
            "bqn",
            "bqo",
            "bqp",
            "bqr",
            "bqs",
            "bqt",
            "bqu",
            "bqv",
            "bqw",
            "bqx",
            "bqy",
            "bqz",
            "bra",
            "brc",
            "brd",
            "bre",
            "brf",
            "brg",
            "brh",
            "bri",
            "brj",
            "brk",
            "brl",
            "brm",
            "brn",
            "bro",
            "brp",
            "brq",
            "brs",
            "brt",
            "bru",
            "brv",
            "brw",
            "brx",
            "bry",
            "brz",
            "bsa",
            "bsc",
            "bsd",
            "bse",
            "bsf",
            "bsg",
            "bsh",
            "bsi",
            "bsj",
            "bsk",
            "bsl",
            "bsm",
            "bsn",
            "bso",
            "bsp",
            "bsq",
            "bsr",
            "bst",
            "bsu",
            "bsv",
            "bsw",
            "bsx",
            "bsy",
            "bsz",
            "bta",
            "btc",
            "btd",
            "bte",
            "btf",
            "btg",
            "bth",
            "bti",
            "btj",
            "btk",
            "btl",
            "btm",
            "btn",
            "bto",
            "btp",
            "btq",
            "btr",
            "bts",
            "btu",
            "btv",
            "btw",
            "btx",
            "bty",
            "btz",
            "bua",
            "buc",
            "bud",
            "bue",
            "buf",
            "bug",
            "buh",
            "bui",
            "buj",
            "buk",
            "bul",
            "bum",
            "bun",
            "buo",
            "bup",
            "buq",
            "bur",
            "bus",
            "but",
            "buv",
            "buw",
            "bux",
            "buy",
            "buz",
            "bva",
            "bvc",
            "bvd",
            "bve",
            "bvf",
            "bvg",
            "bvh",
            "bvi",
            "bvj",
            "bvk",
            "bvl",
            "bvm",
            "bvn",
            "bvo",
            "bvp",
            "bvq",
            "bvr",
            "bvs",
            "bvt",
            "bvu",
            "bvw",
            "bvx",
            "bvy",
            "bvz",
            "bwa",
            "bwc",
            "bwd",
            "bwe",
            "bwf",
            "bwg",
            "bwh",
            "bwi",
            "bwj",
            "bwk",
            "bwl",
            "bwm",
            "bwn",
            "bwo",
            "bwp",
            "bwq",
            "bwr",
            "bws",
            "bwt",
            "bwu",
            "bwv",
            "bwx",
            "bwy",
            "bwz",
            "bxa",
            "bxc",
            "bxd",
            "bxe",
            "bxf",
            "bxg",
            "bxh",
            "bxi",
            "bxj",
            "bxk",
            "bxl",
            "bxm",
            "bxn",
            "bxo",
            "bxp",
            "bxq",
            "bxr",
            "bxs",
            "bxt",
            "bxu",
            "bxv",
            "bxw",
            "bxy",
            "bxz",
            "bya",
            "byc",
            "byd",
            "bye",
            "byf",
            "byg",
            "byh",
            "byi",
            "byj",
            "byk",
            "byl",
            "bym",
            "byn",
            "byo",
            "byp",
            "byq",
            "byr",
            "bys",
            "byt",
            "byu",
            "byv",
            "byw",
            "byx",
            "byz",
            "bza",
            "bzc",
            "bzd",
            "bze",
            "bzf",
            "bzg",
            "bzh",
            "bzi",
            "bzj",
            "bzk",
            "bzl",
            "bzm",
            "bzn",
            "bzo",
            "bzp",
            "bzq",
            "bzr",
            "bzs",
            "bzt",
            "bzu",
            "bzv",
            "bzw",
            "bzx",
            "bzy",
            "cab",
            "cad",
            "cae",
            "caf",
            "cag",
            "cah",
            "cai",
            "caj",
            "cak",
            "cal",
            "cam",
            "can",
            "cao",
            "cap",
            "caq",
            "car",
            "cas",
            "cat",
            "cau",
            "cav",
            "caw",
            "cax",
            "cay",
            "caz",
            "cba",
            "cbd",
            "cbe",
            "cbf",
            "cbg",
            "cbh",
            "cbi",
            "cbj",
            "cbk",
            "cbl",
            "cbm",
            "cbn",
            "cbo",
            "cbp",
            "cbq",
            "cbr",
            "cbs",
            "cbt",
            "cbu",
            "cbv",
            "cbw",
            "cbx",
            "cby",
            "cbz",
            "cda",
            "cdb",
            "cde",
            "cdf",
            "cdg",
            "cdh",
            "cdi",
            "cdj",
            "cdk",
            "cdl",
            "cdm",
            "cdn",
            "cdo",
            "cdp",
            "cdq",
            "cdr",
            "cds",
            "cdt",
            "cdu",
            "cdv",
            "cdw",
            "cdx",
            "cdy",
            "cdz",
            "cea",
            "ceb",
            "ced",
            "cef",
            "ceg",
            "ceh",
            "cei",
            "cej",
            "cek",
            "cel",
            "cem",
            "cen",
            "ceo",
            "cep",
            "ceq",
            "cer",
            "ces",
            "cet",
            "ceu",
            "cev",
            "cew",
            "cex",
            "cey",
            "cez",
            "cfa",
            "cfb",
            "cfd",
            "cfe",
            "cfg",
            "cfh",
            "cfi",
            "cfj",
            "cfk",
            "cfl",
            "cfm",
            "cfn",
            "cfo",
            "cfp",
            "cfq",
            "cfr",
            "cfs",
            "cft",
            "cfu",
            "cfv",
            "cfw",
            "cfx",
            "cfy",
            "cfz",
            "cga",
            "cgb",
            "cgd",
            "cge",
            "cgf",
            "cgh",
            "cgi",
            "cgj",
            "cgk",
            "cgl",
            "cgm",
            "cgn",
            "cgo",
            "cgp",
            "cgq",
            "cgr",
            "cgs",
            "cgt",
            "cgu",
            "cgv",
            "cgw",
            "cgx",
            "cgy",
            "cgz",
            "cha",
            "chb",
            "chd",
            "che",
            "chf",
            "chg",
            "chi",
            "chj",
            "chk",
            "chl",
            "chm",
            "chn",
            "cho",
            "chp",
            "chq",
            "chr",
            "chs",
            "cht",
            "chu",
            "chv",
            "chw",
            "chx",
            "chy",
            "chz",
            "cia",
            "cib",
            "cid",
            "cie",
            "cif",
            "cig",
            "cih",
            "cij",
            "cik",
            "cil",
            "cim",
            "cin",
            "cio",
            "cip",
            "ciq",
            "cir",
            "cis",
            "cit",
            "ciu",
            "civ",
            "ciw",
            "cix",
            "ciy",
            "ciz",
            "cja",
            "cjb",
            "cjd",
            "cje",
            "cjf",
            "cjg",
            "cjh",
            "cji",
            "cjk",
            "cjl",
            "cjm",
            "cjn",
            "cjo",
            "cjp",
            "cjq",
            "cjr",
            "cjs",
            "cjt",
            "cju",
            "cjv",
            "cjw",
            "cjx",
            "cjy",
            "cjz",
            "cka",
            "ckb",
            "ckd",
            "cke",
            "ckf",
            "ckg",
            "ckh",
            "cki",
            "ckj",
            "ckl",
            "ckm",
            "ckn",
            "cko",
            "ckp",
            "ckq",
            "ckr",
            "cks",
            "ckt",
            "cku",
            "ckv",
            "ckw",
            "ckx",
            "cky",
            "ckz",
            "cla",
            "clb",
            "cld",
            "cle",
            "clf",
            "clg",
            "clh",
            "cli",
            "clj",
            "clk",
            "clm",
            "cln",
            "clo",
            "clp",
            "clq",
            "clr",
            "cls",
            "clt",
            "clu",
            "clv",
            "clw",
            "clx",
            "cly",
            "clz",
            "cma",
            "cmb",
            "cmd",
            "cme",
            "cmf",
            "cmg",
            "cmh",
            "cmi",
            "cmj",
            "cmk",
            "cml",
            "cmn",
            "cmo",
            "cmp",
            "cmq",
            "cmr",
            "cms",
            "cmt",
            "cmu",
            "cmv",
            "cmw",
            "cmx",
            "cmy",
            "cmz",
            "cna",
            "cnb",
            "cnd",
            "cne",
            "cnf",
            "cng",
            "cnh",
            "cni",
            "cnj",
            "cnk",
            "cnl",
            "cnm",
            "abcd",
            "abce",
            "abcf",
            "abcg",
            "abch",
            "abci",
            "abcj",
            "abck",
            "abcl",
            "abcm",
            "abcn",
            "abco",
            "abcp",
            "abcq",
            "abcr",
            "abcs",
            "abct",
            "abcu",
            "abcv",
            "abcw",
            "abcx",
            "abcy",
            "abcz",
            "abdc",
            "abde",
            "abdf",
            "abdg",
            "abdh",
            "abdi",
            "abdj",
            "abdk",
            "abdl",
            "abdm",
            "abdn",
            "abdo",
            "abdp",
            "abdq",
            "abdr",
            "abds",
            "abdt",
            "abdu",
            "abdv",
            "abdw",
            "abdx",
            "abdy",
            "abdz",
            "abec",
            "abed",
            "abef",
            "abeg",
            "abeh",
            "abei",
            "abej",
            "abek",
            "abel",
            "abem",
            "aben",
            "abeo",
            "abep",
            "abeq",
            "aber",
            "abes",
            "abet",
            "abeu",
            "abev",
            "abew",
            "abex",
            "abey",
            "abez",
            "abfc",
            "abfd",
            "abfe",
            "abfg",
            "abfh",
            "abfi",
            "abfj",
            "abfk",
            "abfl",
            "abfm",
            "abfn",
            "abfo",
            "abfp",
            "abfq",
            "abfr",
            "abfs",
            "abft",
            "abfu",
            "abfv",
            "abfw",
            "abfx",
            "abfy",
            "abfz",
            "abgc",
            "abgd",
            "abge",
            "abgf",
            "abgh",
            "abgi",
            "abgj",
            "abgk",
            "abgl",
            "abgm",
            "abgn",
            "abgo",
            "abgp",
            "abgq",
            "abgr",
            "abgs",
            "abgt",
            "abgu",
            "abgv",
            "abgw",
            "abgx",
            "abgy",
            "abgz",
            "abhc",
            "abhd",
            "abhe",
            "abhf",
            "abhg",
            "abhi",
            "abhj",
            "abhk",
            "abhl",
            "abhm",
            "abhn",
            "abho",
            "abhp",
            "abhq",
            "abhr",
            "abhs",
            "abht",
            "abhu",
            "abhv",
            "abhw",
            "abhx",
            "abhy",
            "abhz",
            "abic",
            "abid",
            "abie",
            "abif",
            "abig",
            "abih",
            "abij",
            "abik",
            "abil",
            "abim",
            "abin",
            "abio",
            "abip",
            "abiq",
            "abir",
            "abis",
            "abit",
            "abiu",
            "abiv",
            "abiw",
            "abix",
            "abiy",
            "abiz",
            "abjc",
            "abjd",
            "abje",
            "abjf",
            "abjg",
            "abjh",
            "abji",
            "abjk",
            "abjl",
            "abjm",
            "abjn",
            "abjo",
            "abjp",
            "abjq",
            "abjr",
            "abjs",
            "abjt",
            "abju",
            "abjv",
            "abjw",
            "abjx",
            "abjy",
            "abjz",
            "abkc",
            "abkd",
            "abke",
            "abkf",
            "abkg",
            "abkh",
            "abki",
            "abkj",
            "abkl",
            "abkm",
            "abkn",
            "abko",
            "abkp",
            "abkq",
            "abkr",
            "abks",
            "abkt",
            "abku",
            "abkv",
            "abkw",
            "abkx",
            "abky",
            "abkz",
            "ablc",
            "abld",
            "able",
            "ablf",
            "ablg",
            "ablh",
            "abli",
            "ablj",
            "ablk",
            "ablm",
            "abln",
            "ablo",
            "ablp",
            "ablq",
            "ablr",
            "abls",
            "ablt",
            "ablu",
            "ablv",
            "ablw",
            "ablx",
            "ably",
            "ablz",
            "abmc",
            "abmd",
            "abme",
            "abmf",
            "abmg",
            "abmh",
            "abmi",
            "abmj",
            "abmk",
            "abml",
            "abmn",
            "abmo",
            "abmp",
            "abmq",
            "abmr",
            "abms",
            "abmt",
            "abmu",
            "abmv",
            "abmw",
            "abmx",
            "abmy",
            "abmz",
            "abnc",
            "abnd",
            "abne",
            "abnf",
            "abng",
            "abnh",
            "abni",
            "abnj",
            "abnk",
            "abnl",
            "abnm",
            "abno",
            "abnp",
            "abnq",
            "abnr",
            "abns",
            "abnt",
            "abnu",
            "abnv",
            "abnw",
            "abnx",
            "abny",
            "abnz",
            "aboc",
            "abod",
            "aboe",
            "abof",
            "abog",
            "aboh",
            "aboi",
            "aboj",
            "abok",
            "abol",
            "abom",
            "abon",
            "abop",
            "aboq",
            "abor",
            "abos",
            "abot",
            "abou",
            "abov",
            "abow",
            "abox",
            "aboy",
            "aboz",
            "abpc",
            "abpd",
            "abpe",
            "abpf",
            "abpg",
            "abph",
            "abpi",
            "abpj",
            "abpk",
            "abpl",
            "abpm",
            "abpn",
            "abpo",
            "abpq",
            "abpr",
            "abps",
            "abpt",
            "abpu",
            "abpv",
            "abpw",
            "abpx",
            "abpy",
            "abpz",
            "abqc",
            "abqd",
            "abqe",
            "abqf",
            "abqg",
            "abqh",
            "abqi",
            "abqj",
            "abqk",
            "abql",
            "abqm",
            "abqn",
            "abqo",
            "abqp",
            "abqr",
            "abqs",
            "abqt",
            "abqu",
            "abqv",
            "abqw",
            "abqx",
            "abqy",
            "abqz",
            "abrc",
            "abrd",
            "abre",
            "abrf",
            "abrg",
            "abrh",
            "abri",
            "abrj",
            "abrk",
            "abrl",
            "abrm",
            "abrn",
            "abro",
            "abrp",
            "abrq",
            "abrs",
            "abrt",
            "abru",
            "abrv",
            "abrw",
            "abrx",
            "abry",
            "abrz",
            "absc",
            "absd",
            "abse",
            "absf",
            "absg",
            "absh",
            "absi",
            "absj",
            "absk",
            "absl",
            "absm",
            "absn",
            "abso",
            "absp",
            "absq",
            "absr",
            "abst",
            "absu",
            "absv",
            "absw",
            "absx",
            "absy",
            "absz",
            "abtc",
            "abtd",
            "abte",
            "abtf",
            "abtg",
            "abth",
            "abti",
            "abtj",
            "abtk",
            "abtl",
            "abtm",
            "abtn",
            "abto",
            "abtp",
            "abtq",
            "abtr",
            "abts",
            "abtu",
            "abtv",
            "abtw",
            "abtx",
            "abty",
            "abtz",
            "abuc",
            "abud",
            "abue",
            "abuf",
            "abug",
            "abuh",
            "abui",
            "abuj",
            "abuk",
            "abul",
            "abum",
            "abun",
            "abuo",
            "abup",
            "abuq",
            "abur",
            "abus",
            "abut",
            "abuv",
            "abuw",
            "abux",
            "abuy",
            "abuz",
            "abvc",
            "abvd",
            "abve",
            "abvf",
            "abvg",
            "abvh",
            "abvi",
            "abvj",
            "abvk",
            "abvl",
            "abvm",
            "abvn",
            "abvo",
            "abvp",
            "abvq",
            "abvr",
            "abvs",
            "abvt",
            "abvu",
            "abvw",
            "abvx",
            "abvy",
            "abvz",
            "abwc",
            "abwd",
            "abwe",
            "abwf",
            "abwg",
            "abwh",
            "abwi",
            "abwj",
            "abwk",
            "abwl",
            "abwm",
            "abwn",
            "abwo",
            "abwp",
            "abwq",
            "abwr",
            "abws",
            "abwt",
            "abwu",
            "abwv",
            "abwx",
            "abwy",
            "abwz",
            "abxc",
            "abxd",
            "abxe",
            "abxf",
            "abxg",
            "abxh",
            "abxi",
            "abxj",
            "abxk",
            "abxl",
            "abxm",
            "abxn",
            "abxo",
            "abxp",
            "abxq",
            "abxr",
            "abxs",
            "abxt",
            "abxu",
            "abxv",
            "abxw",
            "abxy",
            "abxz",
            "abyc",
            "abyd",
            "abye",
            "abyf",
            "abyg",
            "abyh",
            "abyi",
            "abyj",
            "abyk",
            "abyl",
            "abym",
            "abyn",
            "abyo",
            "abyp",
            "abyq",
            "abyr",
            "abys",
            "abyt",
            "abyu",
            "abyv",
            "abyw",
            "abyx",
            "abyz",
            "abzc",
            "abzd",
            "abze",
            "abzf",
            "abzg",
            "abzh",
            "abzi",
            "abzj",
            "abzk",
            "abzl",
            "abzm",
            "abzn",
            "abzo",
            "abzp",
            "abzq",
            "abzr",
            "abzs",
            "abzt",
            "abzu",
            "abzv",
            "abzw",
            "abzx",
            "abzy",
            "acbd",
            "acbe",
            "acbf",
            "acbg",
            "acbh",
            "acbi",
            "acbj",
            "acbk",
            "acbl",
            "acbm",
            "acbn",
            "acbo",
            "acbp",
            "acbq",
            "acbr",
            "acbs",
            "acbt",
            "acbu",
            "acbv",
            "acbw",
            "acbx",
            "acby",
            "acbz",
            "acdb",
            "acde",
            "acdf",
            "acdg",
            "acdh",
            "acdi",
            "acdj",
            "acdk",
            "acdl",
            "acdm",
            "acdn",
            "acdo",
            "acdp",
            "acdq",
            "acdr",
            "acds",
            "acdt",
            "acdu",
            "acdv",
            "acdw",
            "acdx",
            "acdy",
            "acdz",
            "aceb",
            "aced",
            "acef",
            "aceg",
            "aceh",
            "acei",
            "acej",
            "acek",
            "acel",
            "acem",
            "acen",
            "aceo",
            "acep",
            "aceq",
            "acer",
            "aces",
            "acet",
            "aceu",
            "acev",
            "acew",
            "acex",
            "acey",
            "acez",
            "acfb",
            "acfd",
            "acfe",
            "acfg",
            "acfh",
            "acfi",
            "acfj",
            "acfk",
            "acfl",
            "acfm",
            "acfn",
            "acfo",
            "acfp",
            "acfq",
            "acfr",
            "acfs",
            "acft",
            "acfu",
            "acfv",
            "acfw",
            "acfx",
            "acfy",
            "acfz",
            "acgb",
            "acgd",
            "acge",
            "acgf",
            "acgh",
            "acgi",
            "acgj",
            "acgk",
            "acgl",
            "acgm",
            "acgn",
            "acgo",
            "acgp",
            "acgq",
            "acgr",
            "acgs",
            "acgt",
            "acgu",
            "acgv",
            "acgw",
            "acgx",
            "acgy",
            "acgz",
            "achb",
            "achd",
            "ache",
            "achf",
            "achg",
            "achi",
            "achj",
            "achk",
            "achl",
            "achm",
            "achn",
            "acho",
            "achp",
            "achq",
            "achr",
            "achs",
            "acht",
            "achu",
            "achv",
            "achw",
            "achx",
            "achy",
            "achz",
            "acib",
            "acid",
            "acie",
            "acif",
            "acig",
            "acih",
            "acij",
            "acik",
            "acil",
            "acim",
            "acin",
            "acio",
            "acip",
            "aciq",
            "acir",
            "acis",
            "acit",
            "aciu",
            "aciv",
            "aciw",
            "acix",
            "aciy",
            "aciz",
            "acjb",
            "acjd",
            "acje",
            "acjf",
            "acjg",
            "acjh",
            "acji",
            "acjk",
            "acjl",
            "acjm",
            "acjn",
            "acjo",
            "acjp",
            "acjq",
            "acjr",
            "acjs",
            "acjt",
            "acju",
            "acjv",
            "acjw",
            "acjx",
            "acjy",
            "acjz",
            "ackb",
            "ackd",
            "acke",
            "ackf",
            "ackg",
            "ackh",
            "acki",
            "ackj",
            "ackl",
            "ackm",
            "ackn",
            "acko",
            "ackp",
            "ackq",
            "ackr",
            "acks",
            "ackt",
            "acku",
            "ackv",
            "ackw",
            "ackx",
            "acky",
            "ackz",
            "aclb",
            "acld",
            "acle",
            "aclf",
            "aclg",
            "aclh",
            "acli",
            "aclj",
            "aclk",
            "aclm",
            "acln",
            "aclo",
            "aclp",
            "aclq",
            "aclr",
            "acls",
            "aclt",
            "aclu",
            "aclv",
            "aclw",
            "aclx",
            "acly",
            "aclz",
            "acmb",
            "acmd",
            "acme",
            "acmf",
            "acmg",
            "acmh",
            "acmi",
            "acmj",
            "acmk",
            "acml",
            "acmn",
            "acmo",
            "acmp",
            "acmq",
            "acmr",
            "acms",
            "acmt",
            "acmu",
            "acmv",
            "acmw",
            "acmx",
            "acmy",
            "acmz",
            "acnb",
            "acnd",
            "acne",
            "acnf",
            "acng",
            "acnh",
            "acni",
            "acnj",
            "acnk",
            "acnl",
            "acnm",
            "acno",
            "acnp",
            "acnq",
            "acnr",
            "acns",
            "acnt",
            "acnu",
            "acnv",
            "acnw",
            "acnx",
            "acny",
            "acnz",
            "acob",
            "acod",
            "acoe",
            "acof",
            "acog",
            "acoh",
            "acoi",
            "acoj",
            "acok",
            "acol",
            "acom",
            "acon",
            "acop",
            "acoq",
            "acor",
            "acos",
            "acot",
            "acou",
            "acov",
            "acow",
            "acox",
            "acoy",
            "acoz",
            "acpb",
            "acpd",
            "acpe",
            "acpf",
            "acpg",
            "acph",
            "acpi",
            "acpj",
            "acpk",
            "acpl",
            "acpm",
            "acpn",
            "acpo",
            "acpq",
            "acpr",
            "acps",
            "acpt",
            "acpu",
            "acpv",
            "acpw",
            "acpx",
            "acpy",
            "acpz",
            "acqb",
            "acqd",
            "acqe",
            "acqf",
            "acqg",
            "acqh",
            "acqi",
            "acqj",
            "acqk",
            "acql",
            "acqm",
            "acqn",
            "acqo",
            "acqp",
            "acqr",
            "acqs",
            "acqt",
            "acqu",
            "acqv",
            "acqw",
            "acqx",
            "acqy",
            "acqz",
            "acrb",
            "acrd",
            "acre",
            "acrf",
            "acrg",
            "acrh",
            "acri",
            "acrj",
            "acrk",
            "acrl",
            "acrm",
            "acrn",
            "acro",
            "acrp",
            "acrq",
            "acrs",
            "acrt",
            "acru",
            "acrv",
            "acrw",
            "acrx",
            "acry",
            "acrz",
            "acsb",
            "acsd",
            "acse",
            "acsf",
            "acsg",
            "acsh",
            "acsi",
            "acsj",
            "acsk",
            "acsl",
            "acsm",
            "acsn",
            "acso",
            "acsp",
            "acsq",
            "acsr",
            "acst",
            "acsu",
            "acsv",
            "acsw",
            "acsx",
            "acsy",
            "acsz",
            "actb",
            "actd",
            "acte",
            "actf",
            "actg",
            "acth",
            "acti",
            "actj",
            "actk",
            "actl",
            "actm",
            "actn",
            "acto",
            "actp",
            "actq",
            "actr",
            "acts",
            "actu",
            "actv",
            "actw",
            "actx",
            "acty",
            "actz",
            "acub",
            "acud",
            "acue",
            "acuf",
            "acug",
            "acuh",
            "acui",
            "acuj",
            "acuk",
            "acul",
            "acum",
            "acun",
            "acuo",
            "acup",
            "acuq",
            "acur",
            "acus",
            "acut",
            "acuv",
            "acuw",
            "acux",
            "acuy",
            "acuz",
            "acvb",
            "acvd",
            "acve",
            "acvf",
            "acvg",
            "acvh",
            "acvi",
            "acvj",
            "acvk",
            "acvl",
            "acvm",
            "acvn",
            "acvo",
            "acvp",
            "acvq",
            "acvr",
            "acvs",
            "acvt",
            "acvu",
            "acvw",
            "acvx",
            "acvy",
            "acvz",
            "acwb",
            "acwd",
            "acwe",
            "acwf",
            "acwg",
            "acwh",
            "acwi",
            "acwj",
            "acwk",
            "acwl",
            "acwm",
            "acwn",
            "acwo",
            "acwp",
            "acwq",
            "acwr",
            "acws",
            "acwt",
            "acwu",
            "acwv",
            "acwx",
            "acwy",
            "acwz",
            "acxb",
            "acxd",
            "acxe",
            "acxf",
            "acxg",
            "acxh",
            "acxi",
            "acxj",
            "acxk",
            "acxl",
            "acxm",
            "acxn",
            "acxo",
            "acxp",
            "acxq",
            "acxr",
            "acxs",
            "acxt",
            "acxu",
            "acxv",
            "acxw",
            "acxy",
            "acxz",
            "acyb",
            "acyd",
            "acye",
            "acyf",
            "acyg",
            "acyh",
            "acyi",
            "acyj",
            "acyk",
            "acyl",
            "acym",
            "acyn",
            "acyo",
            "acyp",
            "acyq",
            "acyr",
            "acys",
            "acyt",
            "acyu",
            "acyv",
            "acyw",
            "acyx",
            "acyz",
            "aczb",
            "aczd",
            "acze",
            "aczf",
            "aczg",
            "aczh",
            "aczi",
            "aczj",
            "aczk",
            "aczl",
            "aczm",
            "aczn",
            "aczo",
            "aczp",
            "aczq",
            "aczr",
            "aczs",
            "aczt",
            "aczu",
            "aczv",
            "aczw",
            "aczx",
            "aczy",
            "adbc",
            "adbe",
            "adbf",
            "adbg",
            "adbh",
            "adbi",
            "adbj",
            "adbk",
            "adbl",
            "adbm",
            "adbn",
            "adbo",
            "adbp",
            "adbq",
            "adbr",
            "adbs",
            "adbt",
            "adbu",
            "adbv",
            "adbw",
            "adbx",
            "adby",
            "adbz",
            "adcb",
            "adce",
            "adcf",
            "adcg",
            "adch",
            "adci",
            "adcj",
            "adck",
            "adcl",
            "adcm",
            "adcn",
            "adco",
            "adcp",
            "adcq",
            "adcr",
            "adcs",
            "adct",
            "adcu",
            "adcv",
            "adcw",
            "adcx",
            "adcy",
            "adcz",
            "adeb",
            "adec",
            "adef",
            "adeg",
            "adeh",
            "adei",
            "adej",
            "adek",
            "adel",
            "adem",
            "aden",
            "adeo",
            "adep",
            "adeq",
            "ader",
            "ades",
            "adet",
            "adeu",
            "adev",
            "adew",
            "adex",
            "adey",
            "adez",
            "adfb",
            "adfc",
            "adfe",
            "adfg",
            "adfh",
            "adfi",
            "adfj",
            "adfk",
            "adfl",
            "adfm",
            "adfn",
            "adfo",
            "adfp",
            "adfq",
            "adfr",
            "adfs",
            "adft",
            "adfu",
            "adfv",
            "adfw",
            "adfx",
            "adfy",
            "adfz",
            "adgb",
            "adgc",
            "adge",
            "adgf",
            "adgh",
            "adgi",
            "adgj",
            "adgk",
            "adgl",
            "adgm",
            "adgn",
            "adgo",
            "adgp",
            "adgq",
            "adgr",
            "adgs",
            "adgt",
            "adgu",
            "adgv",
            "adgw",
            "adgx",
            "adgy",
            "adgz",
            "adhb",
            "adhc",
            "adhe",
            "adhf",
            "adhg",
            "adhi",
            "adhj",
            "adhk",
            "adhl",
            "adhm",
            "adhn",
            "adho",
            "adhp",
            "adhq",
            "adhr",
            "adhs",
            "adht",
            "adhu",
            "adhv",
            "adhw",
            "adhx",
            "adhy",
            "adhz",
            "adib",
            "adic",
            "adie",
            "adif",
            "adig",
            "adih",
            "adij",
            "adik",
            "adil",
            "adim",
            "adin",
            "adio",
            "adip",
            "adiq",
            "adir",
            "adis",
            "adit",
            "adiu",
            "adiv",
            "adiw",
            "adix",
            "adiy",
            "adiz",
            "adjb",
            "adjc",
            "adje",
            "adjf",
            "adjg",
            "adjh",
            "adji",
            "adjk",
            "adjl",
            "adjm",
            "adjn",
            "adjo",
            "adjp",
            "adjq",
            "adjr",
            "adjs",
            "adjt",
            "adju",
            "adjv",
            "adjw",
            "adjx",
            "adjy",
            "adjz",
            "adkb",
            "adkc",
            "adke",
            "adkf",
            "adkg",
            "adkh",
            "adki",
            "adkj",
            "adkl",
            "adkm",
            "adkn",
            "adko",
            "adkp",
            "adkq",
            "adkr",
            "adks",
            "adkt",
            "adku",
            "adkv",
            "adkw",
            "adkx",
            "adky",
            "adkz",
            "adlb",
            "adlc",
            "adle",
            "adlf",
            "adlg",
            "adlh",
            "adli",
            "adlj",
            "adlk",
            "adlm",
            "adln",
            "adlo",
            "adlp",
            "adlq",
            "adlr",
            "adls",
            "adlt",
            "adlu",
            "adlv",
            "adlw",
            "adlx",
            "adly",
            "adlz",
            "admb",
            "admc",
            "adme",
            "admf",
            "admg",
            "admh",
            "admi",
            "admj",
            "admk",
            "adml",
            "admn",
            "admo",
            "admp",
            "admq",
            "admr",
            "adms",
            "admt",
            "admu",
            "admv",
            "admw",
            "admx",
            "admy",
            "admz",
            "adnb",
            "adnc",
            "adne",
            "adnf",
            "adng",
            "adnh",
            "adni",
            "adnj",
            "adnk",
            "adnl",
            "adnm",
            "adno",
            "adnp",
            "adnq",
            "adnr",
            "adns",
            "adnt",
            "adnu",
            "adnv",
            "adnw",
            "adnx",
            "adny",
            "adnz",
            "adob",
            "adoc",
            "adoe",
            "adof",
            "adog",
            "adoh",
            "adoi",
            "adoj",
            "adok",
            "adol",
            "adom",
            "adon",
            "adop",
            "adoq",
            "ador",
            "ados",
            "adot",
            "adou",
            "adov",
            "adow",
            "adox",
            "adoy",
            "adoz",
            "adpb",
            "adpc",
            "adpe",
            "adpf",
            "adpg",
            "adph",
            "adpi",
            "adpj",
            "adpk",
            "adpl",
            "adpm",
            "adpn",
            "adpo",
            "adpq",
            "adpr",
            "adps",
            "adpt",
            "adpu",
            "adpv",
            "adpw",
            "adpx",
            "adpy",
            "adpz",
            "adqb",
            "adqc",
            "adqe",
            "adqf",
            "adqg",
            "adqh",
            "adqi",
            "adqj",
            "adqk",
            "adql",
            "adqm",
            "adqn",
            "adqo",
            "adqp",
            "adqr",
            "adqs",
            "adqt",
            "adqu",
            "adqv",
            "adqw",
            "adqx",
            "adqy",
            "adqz",
            "adrb",
            "adrc",
            "adre",
            "adrf",
            "adrg",
            "adrh",
            "adri",
            "adrj",
            "adrk",
            "adrl",
            "adrm",
            "adrn",
            "adro",
            "adrp",
            "adrq",
            "adrs",
            "adrt",
            "adru",
            "adrv",
            "adrw",
            "adrx",
            "adry",
            "adrz",
            "adsb",
            "adsc",
            "adse",
            "adsf",
            "adsg",
            "adsh",
            "adsi",
            "adsj",
            "adsk",
            "adsl",
            "adsm",
            "adsn",
            "adso",
            "adsp",
            "adsq",
            "adsr",
            "adst",
            "adsu",
            "adsv",
            "adsw",
            "adsx",
            "adsy",
            "adsz",
            "adtb",
            "adtc",
            "adte",
            "adtf",
            "adtg",
    };
        // getDic();
//    ("۫۫۬\n" +
//            "ۨۚۢ\n" +
//            "ۘۨۜ\n" +
//            "ۡۦۦ\n" +
//            "ۤ۟۟\n" +
//            "ۖ۫۫\n" +
//            "۫ۤۖۘ\n" +
//            "۠ۢۚ\n" +
//            "۟ۜۡ\n" +
//            "ۢ۠ۥۘ\n" +
//            "ۖۢ۬\n" +
//            "ۡۧۥۘ\n" +
//            "۠۫ۜۘ\n" +
//            "ۙ۬ۛ\n" +
//            "ۥۥ۫\n" +
//            "۫ۙۚ\n" +
//            "ۛۡۘۘ\n" +
//            "ۦۨ۠\n" +
//            "ۥۖۡ\n" +
//            "ۦۚۢ\n" +
//            "۠۟۬\n" +
//            "ۚۘۙ\n" +
//            "ۙ۫ۘ\n" +
//            "ۚ۠ۥۘ\n" +
//            "ۨۜۨ\n" +
//            "۟\n" +
//            "ۥۚ۠\n" +
//            "ۙ۫ۢ\n" +
//            "ۨ۬ۦ\n" +
//            "ۦۜۗ\n" +
//            "۟ۙۤ\n" +
//            "ۘۦۡ\n" +
//            "۟۟ۛ\n" +
//            "ۗۚۘۘ\n" +
//            "ۡۚۨ\n" +
//            "ۘ۫۟\n" +
//            "۬۠۬\n" +
//            "ۗۥۨۘ\n" +
//            "۠۠۟\n" +
//            "۫ۨۨۘ\n" +
//            "ۧۤۜ\n" +
//            "۬ۧۚ\n" +
//            "۠ۖۨۘ\n" +
//            "ۜۚۙ\n" +
//            "۬ۦۚ\n" +
//            "ۨۤ۠\n" +
//            "۫ۙۦ\n" +
//            "ۨۖۜۘ\n" +
//            "۫ۢۘۘ\n" +
//            "ۦۢۦ\n" +
//            "ۥۗ\n" +
//            "ۥۢۛ\n" +
//            "ۤۗۜۘ\n" +
//            "ۧ۠ۛ\n" +
//            "۫ۚ۬\n" +
//            "ۡۜ۠\n" +
//            "ۨۨۤ\n" +
//            "ۥۦۧۘ\n" +
//            "ۡ۟ۛ\n" +
//            "۟ۨۚ\n" +
//            "ۜ۠۬\n" +
//            "ۘۦۤ\n" +
//            "۟ۙۙ\n" +
//            "ۥۥ۠\n" +
//            "ۙۡۙ\n" +
//            "ۦۢۥۘ\n" +
//            "ۛۗ۠\n" +
//            "۬ۢۖ\n" +
//            "ۜۦۨ\n" +
//            "ۛۛۨ\n" +
//            "ۧۜۥۘ\n" +
//            "ۧۛۜۘ\n" +
//            "ۡ۬ۢ\n" +
//            "ۚۧۗ\n" +
//            "ۧۙ\n" +
//            "ۖ۠ۦ\n" +
//            "ۨۥۙ\n" +
//            "ۚۤۘ\n" +
//            "۫ۥ۠\n" +
//            "ۨۡۗ\n" +
//            "ۢۨۖۘ\n" +
//            "ۧ۫۠\n" +
//            "۠ۙۚ\n" +
//            "۟ۘۧ\n" +
//            "ۧۘۘ\n" +
//            "ۧ۠ۢ\n" +
//            "ۖۙۜ\n" +
//            "ۗۗۡۘ\n" +
//            "۬ۜۧۘ\n" +
//            "ۙۨۘۘ\n" +
//            "ۥۙ۫\n" +
//            "ۗۚ۟\n" +
//            "۠۟ۢ\n" +
//            "ۚ۬ۥ\n" +
//            "ۖۨۙ\n" +
//            "ۙۚۘۘ\n" +
//            "ۥۨۥ\n" +
//            "ۙۛ\n" +
//            "ۡۗۗ\n" +
//            "۠۠ۘۘ\n" +
//            "ۘۧۨ\n" +
//            "۟ۧۜۘ\n" +
//            "۫ۢۛ\n" +
//            "ۙۨۢ\n" +
//            "۫ۥۙ\n" +
//            "ۘۘۦۘ\n" +
//            "ۜۥۧ\n" +
//            "ۖۖۢ\n" +
//            "ۥۦۦ\n" +
//            "ۥۛۖۘ\n" +
//            "ۛ۠ۥ\n" +
//            "ۧۖۙ\n" +
//            "ۢۙۨۘ\n" +
//            "ۛۥ\n" +
//            "ۚۦۘۘ\n" +
//            "ۙ۬ۨ\n" +
//            "ۢۤۤ\n" +
//            "ۦۤۙ\n" +
//            "ۙۨۥ\n" +
//            "۟ۖۥ\n" +
//            "۟ۢۘ\n" +
//            "ۨۨۜ\n" +
//            "ۨۨۖۘ\n" +
//            "ۦۧۧ\n" +
//            "ۖۚۗ\n" +
//            "ۤۙۥ\n" +
//            "ۡۡ۫\n" +
//            "ۚ۬ۧ\n" +
//            "ۗۤۧ\n" +
//            "۬ۚۧ\n" +
//            "ۛۢ۫\n" +
//            "ۦۜۧ\n" +
//            "۫ۖۘۘ\n" +
//            "ۦ۠\n" +
//            "ۡ۬ۗ\n" +
//            "ۥۧۖ\n" +
//            "ۖۧۚ\n" +
//            "ۡۙۢ\n" +
//            "ۗۤۨ\n" +
//            "ۥۤۤ\n" +
//            "ۧۦۖۘ\n" +
//            "ۚۢ\n" +
//            "ۢۘۛ\n" +
//            "ۦۘۨۘ\n" +
//            "۬۟۬\n" +
//            "ۛۘۦۘ\n" +
//            "ۢۙۗ\n" +
//            "ۛۙ\n" +
//            "ۙ۟ۜۘ\n" +
//            "ۢۚۖ\n" +
//            "ۚۥ۫\n" +
//            "۬۬ۛ\n" +
//            "ۥۙۜ\n" +
//            "ۜۥۖ\n" +
//            "۫ۖۚ\n" +
//            "ۨ۬ۚ\n" +
//            "ۢۤ۟\n" +
//            "ۡۧۘ\n" +
//            "ۢۗۡۘ\n" +
//            "ۥۤ۫\n" +
//            "۠ۢۨ\n" +
//            "ۛۥۡ\n" +
//            "ۦۦۛ\n" +
//            "ۚۡۨۘ\n" +
//            "ۘۧۘ\n" +
//            "ۘۡ۠\n" +
//            "ۤۗ۠\n" +
//            "۟ۗۖ\n" +
//            "۫ۘۨ\n" +
//            "ۦۘۥۘ\n" +
//            "ۛۡۨ\n" +
//            "ۙۤۡ\n" +
//            "ۖۘۥۘ\n" +
//            "ۤۨۖ\n" +
//            "ۖۚۧ\n" +
//            "ۢۨۥ\n" +
//            "ۙۡۧۘ\n" +
//            "ۙۚۧ\n" +
//            "ۘۧ۟\n" +
//            "ۜ۬۫\n" +
//            "۫ۧ۠\n" +
//            "ۜۧۡۘ\n" +
//            "ۤۜۘۘ\n" +
//            "ۨۦۡ\n" +
//            "ۧۨۚ\n" +
//            "ۙۧۚ\n" +
//            "ۨۡ\n" +
//            "۬ۦۖۘ\n" +
//            "ۖۙۦ\n" +
//            "ۨ۫ۜ\n" +
//            "۠۬۠\n" +
//            "ۖۡۖۘ\n" +
//            "۟ۙۨۘ\n" +
//            "ۥۥۘۘ\n" +
//            "ۦۥۥۘ\n" +
//            "ۥۖۘۘ\n" +
//            "ۙۤۤ\n" +
//            "۟ۙۥۘ\n" +
//            "ۧۘۙ\n" +
//            "ۛۢۖ\n" +
//            "ۛۤۤ\n" +
//            "ۜۢ۫\n" +
//            "ۨۢۖۘ\n" +
//            "ۤۥ۫\n" +
//            "ۘ۫ۗ\n" +
//            "ۨۗۘ\n" +
//            "ۜۥ۬\n" +
//            "۬ۗ۬\n" +
//            "ۘۘۖۘ\n" +
//            "ۦ۫ۦۘ\n" +
//            "۟ۙۡ\n" +
//            "ۥۜۗ\n" +
//            "ۛۖۢ\n" +
//            "ۥۦۘۘ\n" +
//            "ۘۨۖۘ\n" +
//            "ۘۚ\n" +
//            "ۙ۫ۡۘ\n" +
//            "ۤ۟\n" +
//            "۟ۨۧ\n" +
//            "ۡۗۚ\n" +
//            "ۥۥۛ\n" +
//            "۬ۨ۫\n" +
//            "۠۠ۗ\n" +
//            "ۢۜ۠\n" +
//            "۫ۡۛ\n" +
//            "ۙۥۡ\n" +
//            "ۚۡۧۘ\n" +
//            "۫۬۠\n" +
//            "ۥۙۘۘ\n" +
//            "ۦۛۚ\n" +
//            "ۥۗۖۘ\n" +
//            "ۘ۬ۤ\n" +
//            "ۘۡۖ\n" +
//            "ۖۘۨ\n" +
//            "ۖ۬ۜۘ\n" +
//            "ۨۡۖۘ\n" +
//            "ۖۙ۠\n" +
//            "ۚۢۢ\n" +
//            "۠۠ۨ\n" +
//            "ۜۡۨ\n" +
//            "۬ۤۚ\n" +
//            "ۘۨۦۘ\n" +
//            "ۨ۠ۘ\n" +
//            "ۥ۬ۨۘ\n" +
//            "۫ۧۡ\n" +
//            "ۗۗ۠\n" +
//            "ۢۘ۫\n" +
//            "۬ۦ\n" +
//            "ۙۦۖۘ\n" +
//            "ۡۡۡۘ\n" +
//            "۟۠ۖۘ\n" +
//            "ۗۛ۟\n" +
//            "ۚۥۦ\n" +
//            "ۘۚۢ\n" +
//            "۫۫ۖ\n" +
//            "۬ۗۨ\n" +
//            "۬ۡۢ\n" +
//            "ۥۖۖۘ\n" +
//            "۬ۢۙ\n" +
//            "ۢۗۦۘ\n" +
//            "ۢۤۡۘ\n" +
//            "ۥۘۡۘ\n" +
//            "ۖ۠ۛ\n" +
//            "۟ۗۘۘ\n" +
//            "ۚۧۤ\n" +
//            "ۗۥۨ\n" +
//            "ۜۢۖ\n" +
//            "ۤۖۘۘ\n" +
//            "ۦۤۥ\n" +
//            "ۦۜۥۘ\n" +
//            "ۦۚۙ\n" +
//            "ۤۗۜ\n" +
//            "۠ۧۨ\n" +
//            "ۢۡۡۘ\n" +
//            "ۢ۟ۦۘ\n" +
//            "ۢۧ۬\n" +
//            "ۥۚۥۘ\n" +
//            "ۧۨ۬\n" +
//            "ۗۤۤ\n" +
//            "ۚۤۡۘ\n" +
//            "ۥ۫ۙ\n" +
//            "ۥ۟ۡۘ\n" +
//            "ۗۥۢ\n" +
//            "۬ۚۖۘ\n" +
//            "ۡۗۨۘ\n" +
//            "ۙۢۖۘ\n" +
//            "۟ۤ۫\n" +
//            "ۡۦۤ\n" +
//            "ۧۗۦۘ\n" +
//            "ۦ۟ۥ\n" +
//            "ۚۤۛ\n" +
//            "ۧ۟۟\n" +
//            "ۢۜۡ\n" +
//            "۠ۖۢ\n" +
//            "ۚۨۖۘ\n" +
//            "ۗۨۥ\n" +
//            "۟ۛۘ\n" +
//            "ۘۗ۠\n" +
//            "۟ۨۘ\n" +
//            "ۛۘۛ\n" +
//            "ۛۨ۬\n" +
//            "ۢۧۦ\n" +
//            "ۛۡ۫\n" +
//            "ۙۜۨۘ\n" +
//            "ۢۦۡۘ\n" +
//            "ۥۖۨ\n" +
//            "ۤۖۗ\n" +
//            "ۧۙۨ\n" +
//            "ۛۘۗ\n" +
//            "ۤۘۥ\n" +
//            "ۜۜۗ\n" +
//            "ۖۨۚ\n" +
//            "۬۬ۡ\n" +
//            "۫ۜ۬\n" +
//            "ۨۘۦ\n" +
//            "ۘۗۜ\n" +
//            "ۗ۬ۥ\n" +
//            "ۢۥۛ\n" +
//            "ۜۥۨ\n" +
//            "۬ۨۤ\n" +
//            "ۨۜۥ\n" +
//            "۠ۖۖۘ\n" +
//            "ۗۛۧ\n" +
//            "ۢۚۤ\n" +
//            "ۙۧۖۘ\n" +
//            "ۗ۠ۦۘ\n" +
//            "ۘۚ۟\n" +
//            "۟ۦۨ\n" +
//            "ۥۚۖ\n" +
//            "ۧ۬ۦۘ\n" +
//            "ۦۛ۟\n" +
//            "۟ۘۡ\n" +
//            "۫ۦۡ\n" +
//            "ۥۛۦۘ\n" +
//            "۟۟ۥ\n" +
//            "ۖۜۖۘ\n" +
//            "۫ۜۖۘ\n" +
//            "۟۠ۘ\n" +
//            "ۗۤۚ\n" +
//            "ۖ۠ۖۘ\n" +
//            "ۤۧۜۘ\n" +
//            "ۙۥۙ\n" +
//            "ۖۨ۬\n" +
//            "ۡۡۗ\n" +
//            "ۢۜۡۘ\n" +
//            "ۚۨۦۘ\n" +
//            "ۖۥۡ\n" +
//            "ۦۛۛ\n" +
//            "۟۟۠\n" +
//            "ۘۢ۟\n" +
//            "ۚۛۛ\n" +
//            "ۖۤۘ\n" +
//            "ۛۘ۬\n" +
//            "ۧ۬ۜ\n" +
//            "ۛۜ\n" +
//            "ۛۤۙ\n" +
//            "ۚۛۚ\n" +
//            "ۘ۠ۥ\n" +
//            "ۛۦۧۘ\n" +
//            "ۢۤۗ\n" +
//            "۟ۜۙ\n" +
//            "ۛۢ۬\n" +
//            "ۡۧۨۘ\n" +
//            "ۗۢۜ\n" +
//            "ۖ۬ۙ\n" +
//            "ۘۡۜ\n" +
//            "ۧۤۘۘ\n" +
//            "۠ۢۥۘ\n" +
//            "۫ۘ\n" +
//            "ۛۘۥ\n" +
//            "۠ۧۖ\n" +
//            "ۜۜ۠\n" +
//            "ۛۤ۫\n" +
//            "ۦۢۤ\n" +
//            "۬ۚۡ\n" +
//            "ۢۛ\n" +
//            "ۧۤۖۘ\n" +
//            "ۚۤ\n" +
//            "ۘۨۦ\n" +
//            "ۢۙۜ\n" +
//            "ۧۘۡ\n" +
//            "۬ۨۧ\n" +
//            "ۚۢۧ\n" +
//            "ۖۗۜۘ\n" +
//            "ۛ۠۠\n" +
//            "ۖۙۤ\n" +
//            "ۥۢۜ\n" +
//            "۫ۜۥ\n" +
//            "ۢۧ\n" +
//            "ۖ۠۠\n" +
//            "ۛۡۡۘ\n" +
//            "ۛۙۦۘ\n" +
//            "ۚۥۘ\n" +
//            "ۨۤ\n" +
//            "ۙۡۨۘ\n" +
//            "۟ۢۛ\n" +
//            "ۚۧۢ\n" +
//            "۠ۦۖ\n" +
//            "ۖۖۖ\n" +
//            "۟ۛۧ\n" +
//            "۠ۙۡۘ\n" +
//            "ۙۨۘ\n" +
//            "ۛ۫ۨ\n" +
//            "ۦ۫۫\n" +
//            "۟۬ۥ\n" +
//            "ۧۗۡۘ\n" +
//            "ۤ۬۫\n" +
//            "ۚ۬ۖ\n" +
//            "۫ۧۜۘ\n" +
//            "ۥۚۡ\n" +
//            "۫۟ۚ\n" +
//            "ۡۘۖۘ\n" +
//            "ۥۚۨۘ\n" +
//            "ۗۥ۟\n" +
//            "ۥۧۢ\n" +
//            "ۤۢۥ\n" +
//            "ۦۘ۫\n" +
//            "ۙۜۛ\n" +
//            "ۧۥۢ\n" +
//            "ۦۡۡۘ\n" +
//            "ۙۘۦ\n" +
//            "ۗۛۨ\n" +
//            "ۚۡۜ\n" +
//            "ۛۖۚ\n" +
//            "ۤۜ۬\n" +
//            "ۢ۠ۨۘ\n" +
//            "ۖ۫\n" +
//            "ۡۚۦ\n" +
//            "ۖ۬ۧ\n" +
//            "ۜۦۖ\n" +
//            "ۘۙ۟\n" +
//            "ۛۗۤ\n" +
//            "ۛۤۛ\n" +
//            "ۦۧۚ\n" +
//            "ۧ۟ۨ\n" +
//            "۫ۛۜ\n" +
//            "ۨۦۥۘ\n" +
//            "ۜ۫۠\n" +
//            "ۨۚۦ\n" +
//            "ۗۥ\n" +
//            "ۨۙۢ\n" +
//            "ۗۛۡ\n" +
//            "ۢ۬\n" +
//            "ۚۛۢ\n" +
//            "ۧ۫۫\n" +
//            "ۖ۠ۗ\n" +
//            "ۨ۟ۙ\n" +
//            "ۚۖۤ\n" +
//            "ۛۦ۬\n" +
//            "۠ۘۡۘ\n" +
//            "ۗۚۛ\n" +
//            "ۚۙۢ\n" +
//            "۟ۡۡ\n" +
//            "۟ۤۖۘ\n" +
//            "ۥۨۤ\n" +
//            "ۗۘۘۘ\n" +
//            "ۨۥ۫\n" +
//            "ۨ۟ۖۘ\n" +
//            "ۥۡ۫\n" +
//            "ۛۗۖ\n" +
//            "ۥۢۖ\n" +
//            "۟ۦۦۘ\n" +
//            "ۘ۟ۜ\n" +
//            "ۙۦۛ\n" +
//            "ۥۜۛ\n" +
//            "۟ۖۘ\n" +
//            "ۧۦۦ\n" +
//            "ۨۡۨ\n" +
//            "۠ۨۙ\n" +
//            "ۦۖۡۘ\n" +
//            "ۢ۟۟\n" +
//            "ۜۢۗ\n" +
//            "ۡۙ۠\n" +
//            "ۨۖۡ\n" +
//            "ۥۢۖۘ\n" +
//            "ۜۙۢ\n" +
//            "ۚۦۦ\n" +
//            "ۗ۟ۤ\n" +
//            "۟۟ۦ\n" +
//            "ۥۨ۫\n" +
//            "ۚۨ\n" +
//            "ۡ۫ۜۘ\n" +
//            "ۧۤۨ\n" +
//            "ۙۥۨۘ\n" +
//            "۠ۛۦۘ\n" +
//            "۫ۤۡۘ\n" +
//            "ۖۥۢ\n" +
//            "ۖ۟ۥ\n" +
//            "۬ۛۧ\n" +
//            "ۖۜۘ\n" +
//            "ۦۛۧ\n" +
//            "ۧۨۖ\n" +
//            "۬۫ۘ\n" +
//            "ۢۛۥ\n" +
//            "۬۬ۗ\n" +
//            "ۨۧۜۘ\n" +
//            "ۜۨ۠\n" +
//            "ۤ۟ۙ\n" +
//            "ۤۘۖ\n" +
//            "ۢۦ۠\n" +
//            "۫ۘۥ\n" +
//            "۟ۧۡۘ\n" +
//            "ۥۥۡ\n" +
//            "ۤۥۛ\n" +
//            "۠ۧ۠\n" +
//            "ۧۗۜ\n" +
//            "۠ۤۡ\n" +
//            "ۚۘ۠\n" +
//            "ۜ۟\n" +
//            "ۖۦۡۘ\n" +
//            "ۗۢۛ\n" +
//            "۠ۢۗ\n" +
//            "ۜۜۧ\n" +
//            "۬۫ۘۘ\n" +
//            "ۧ۟ۦۘ\n" +
//            "ۨۡ۬\n" +
//            "ۗ۠ۚ\n" +
//            "ۥ۠۟\n" +
//            "ۧ۠ۥ\n" +
//            "ۦۖۨ\n" +
//            "ۘ۟ۤ\n" +
//            "۬ۚۚ\n" +
//            "ۧۖۥۘ\n" +
//            "ۜۛ\n" +
//            "ۜۢۥ\n" +
//            "ۚۚۜۘ\n" +
//            "ۢ۬ۜ\n" +
//            "۫۫ۤ\n" +
//            "ۗ۟ۚ\n" +
//            "۟ۦۥ\n" +
//            "ۘۜۥ\n" +
//            "۫ۧۙ\n" +
//            "۠ۦۙ\n" +
//            "ۢۦۗ\n" +
//            "ۘۘۧ\n" +
//            "ۜ۫ۛ\n" +
//            "ۨ۬ۗ\n" +
//            "ۗۘۙ\n" +
//            "ۛۘۖۘ\n" +
//            "۠ۖ۫\n" +
//            "ۥۤۥ\n" +
//            "ۤۖۧۘ\n" +
//            "ۥۛۥۘ\n" +
//            "ۗ۬ۡۘ\n" +
//            "ۘ۟ۦۘ\n" +
//            "ۥۨۛ\n" +
//            "ۤۛۦ\n" +
//            "ۙۦۡۘ\n" +
//            "۠ۡ۫\n" +
//            "ۘۧۜ\n" +
//            "ۘ۫ۜ\n" +
//            "ۥۡ\n" +
//            "ۜۗۢ\n" +
//            "ۦۖۧ\n" +
//            "ۡۙ۬\n" +
//            "ۧۧۥ\n" +
//            "ۛۚ۠\n" +
//            "۠۫ۜ\n" +
//            "ۖۤۜۘ\n" +
//            "ۜۗۥ\n" +
//            "ۤۥۘۘ\n" +
//            "ۜۧۨ\n" +
//            "ۘۨۡۘ\n" +
//            "ۧۙۛ\n" +
//            "۟ۗۛ\n" +
//            "۟ۡ۫\n" +
//            "ۚۦۗ\n" +
//            "ۤۦۦۘ\n" +
//            "ۜۤ۟\n" +
//            "۫ۦۜۘ\n" +
//            "ۦ۟ۧ\n" +
//            "ۖۖۦۘ\n" +
//            "ۛۛۨۘ\n" +
//            "ۧۢۨ\n" +
//            "ۙ۟ۨ\n" +
//            "ۦۗۦۘ\n" +
//            "۠ۚۧ\n" +
//            "ۧۢۦۘ\n" +
//            "ۨۡۜ\n" +
//            "ۥۘ۬\n" +
//            "ۢۡۙ\n" +
//            "ۧ۠ۦ\n" +
//            "ۡۜۜۘ\n" +
//            "ۘ۟۟\n" +
//            "۠ۦۗ\n" +
//            "ۤۧ۟\n" +
//            "ۦۚۦۘ\n" +
//            "ۢۖۥ\n" +
//            "ۜۖۢ\n" +
//            "ۨۥۛ\n" +
//            "ۙ۟ۥ\n" +
//            "ۦۦۡۘ\n" +
//            "۫ۧۜ\n" +
//            "۫ۛۛ\n" +
//            "ۨ۠ۜ\n" +
//            "ۢۡۢ\n" +
//            "ۚۥۦۘ\n" +
//            "ۙۧۖ\n" +
//            "ۢۖ۟\n" +
//            "ۤۜۤ\n" +
//            "ۧ۟ۤ\n" +
//            "ۜۡۘۘ\n" +
//            "ۘۦ۟\n" +
//            "ۦۚۡ\n" +
//            "ۚۤۘۘ\n" +
//            "ۜۧۦ\n" +
//            "ۤۥ۠\n" +
//            "ۘۛ\n" +
//            "ۚۡ۬\n" +
//            "ۨۜ۫\n" +
//            "۬۠ۖۘ\n" +
//            "ۤ۟ۚ\n" +
//            "ۘۥۘ\n" +
//            "ۨۛۥ\n" +
//            "۠ۖۜ\n" +
//            "۠ۘ\n" +
//            "ۗۧۚ\n" +
//            "ۚ۠ۡۘ\n" +
//            "۠ۚۖۘ\n" +
//            "ۙۖۥ\n" +
//            "ۡۖۨ\n" +
//            "ۚۛۨ\n" +
//            "ۚۖۗ\n" +
//            "ۜۢۦۘ\n" +
//            "ۛۖۗ\n" +
//            "ۢ۠ۧ\n" +
//            "ۘۖۥۘ\n" +
//            "۟ۛ۠\n" +
//            "ۚۚۢ\n" +
//            "ۚۛ۫\n" +
//            "ۙۦۦ\n" +
//            "ۜ۫ۚ\n" +
//            "۫۠ۤ\n" +
//            "۠ۦۖۘ\n" +
//            "ۨۙۚ\n" +
//            "ۥۨۡۘ\n" +
//            "۠۟ۘ\n" +
//            "ۡۧ۫\n" +
//            "ۨۜۖ\n" +
//            "ۦ۠ۦ\n" +
//            "ۤۦۛ\n" +
//            "۟ۖ۬\n" +
//            "ۘۧۛ\n" +
//            "ۚۧۘۘ\n" +
//            "ۡۘۘ\n" +
//            "ۥۗۘ\n" +
//            "ۡۛۚ\n" +
//            "ۨۗۦۘ\n" +
//            "ۖۗۨۘ\n" +
//            "۟ۨۥۘ\n" +
//            "ۨۗۖ\n" +
//            "ۖۧ۬\n" +
//            "۠ۢ۟\n" +
//            "ۜۢۧ\n" +
//            "ۢۙۥۘ\n" +
//            "ۥۗۡ\n" +
//            "۟ۨۤ\n" +
//            "ۡۤ\n" +
//            "ۙۙۢ\n" +
//            "۫ۚۖ\n" +
//            "ۜ۬۬\n" +
//            "ۗۙۘۘ\n" +
//            "ۘۦۢ\n" +
//            "ۜ۠ۖۘ\n" +
//            "ۘۡۘ\n" +
//            "ۖۖۨۘ\n" +
//            "ۗۜۖ\n" +
//            "ۜۧ۬\n" +
//            "۟۫ۜۘ\n" +
//            "ۦۚۜ\n" +
//            "ۤ۫۠\n" +
//            "ۤ۠ۖ\n" +
//            "ۖ۠۫\n" +
//            "ۥۙۨ\n" +
//            "ۢۙۥ\n" +
//            "ۦۗۨۘ\n" +
//            "ۢۦۜ\n" +
//            "ۘۨۛ\n" +
//            "ۨۜۧۘ\n" +
//            "ۢۡۘۘ\n" +
//            "ۚۜۚ\n" +
//            "ۛۙۘۘ\n" +
//            "ۗۖۧۘ\n" +
//            "ۦۖ۟\n" +
//            "ۙ۟ۦۘ\n" +
//            "ۡۜۥۘ\n" +
//            "ۦۦۗ\n" +
//            "ۗۙۘ\n" +
//            "ۡ۟ۦۘ\n" +
//            "ۦۜۦ\n" +
//            "ۤۤۨ\n" +
//            "ۛ۬۠\n" +
//            "ۥۛۡۘ\n" +
//            "ۜ۠ۗ\n" +
//            "۟ۛۗ\n" +
//            "ۥۚ۟\n" +
//            "ۧۢ۠\n" +
//            "ۘ۟ۨ\n" +
//            "ۥۙۨۘ\n" +
//            "ۖۨۗ\n" +
//            "ۡۘۚ\n" +
//            "ۜۛۚ\n" +
//            "۠ۢۨۘ\n" +
//            "۫۠ۥ\n" +
//            "ۛۘۦ\n" +
//            "ۜۤۜ\n" +
//            "ۢۧۥ\n" +
//            "۫ۖ۠\n" +
//            "۫ۨۥ\n" +
//            "ۥ۫ۚ\n" +
//            "ۦۡ۟\n" +
//            "ۦۚۧ\n" +
//            "ۥ۟ۨۘ\n" +
//            "۬ۚۥ\n" +
//            "ۦۚ۠\n" +
//            "۟ۤۥ\n" +
//            "ۖۖۚ\n" +
//            "ۗۨۤ\n" +
//            "ۦۥۘۘ\n" +
//            "ۦۗۤ\n" +
//            "ۨ۠ۦۘ\n" +
//            "ۧۧ۟\n" +
//            "ۤ۟ۦۘ\n" +
//            "۫ۙۨ\n" +
//            "ۥ۠ۥ\n" +
//            "ۛۜۛ\n" +
//            "ۜۜۜ\n" +
//            "۬ۤۘۘ\n" +
//            "ۡۚۖۘ\n" +
//            "ۗۧۛ\n" +
//            "ۨۤۥۘ\n" +
//            "ۦ۠ۥ\n" +
//            "ۘۚۗ\n" +
//            "ۛۘۢ\n" +
//            "ۗۜۨ\n" +
//            "ۘ۠۫\n" +
//            "ۛۨۗ\n" +
//            "ۖۥۚ\n" +
//            "ۤۗۚ\n" +
//            "ۗ۬ۘۘ\n" +
//            "۬ۚۗ\n" +
//            "ۢ۫ۦ\n" +
//            "ۙۤۗ\n" +
//            "ۖۥۜ\n" +
//            "ۢۨۨ\n" +
//            "۬۟ۥۘ\n" +
//            "ۡ۬ۜ\n" +
//            "۬۟ۡ\n" +
//            "ۧ۠۠\n" +
//            "ۧۧۗ\n" +
//            "ۚۗۙ\n" +
//            "ۙ۫\n" +
//            "ۙۦۤ\n" +
//            "۠ۧۙ\n" +
//            "ۨ۟ۨ\n" +
//            "ۚۙۖۘ\n" +
//            "ۘۗۤ\n" +
//            "ۙۘۖ\n" +
//            "ۛۖ۫\n" +
//            "ۢۢۨ\n" +
//            "ۗ۬۟\n" +
//            "ۛۢۗ\n" +
//            "ۦۤۜۘ\n" +
//            "۫ۡۚ\n" +
//            "۬ۢۚ\n" +
//            "ۙۗۚ\n" +
//            "ۙۦۧۘ\n" +
//            "ۡۥۢ\n" +
//            "ۛۧۤ\n" +
//            "ۚۥۧ\n" +
//            "ۜۡۧۘ\n" +
//            "ۙۡۨ\n" +
//            "۠ۛ۟\n" +
//            "ۤ۟ۥ\n" +
//            "ۛۗۖۘ\n" +
//            "ۦۦۜۘ\n" +
//            "ۜ۠ۡ\n" +
//            "۫ۖ۬\n" +
//            "ۛۛ۬\n" +
//            "ۛ۬ۘۘ\n" +
//            "۫ۗ\n" +
//            "۠ۧۜۘ\n" +
//            "۟۬ۨۘ\n" +
//            "ۖۡۘ\n" +
//            "ۨۜۤ\n" +
//            "ۨۚۡ\n" +
//            "ۤۙۛ\n" +
//            "ۙۜۗ\n" +
//            "ۖۧۜۘ\n" +
//            "۫۬ۥۘ\n" +
//            "ۗۦۥۘ\n" +
//            "ۗ۫ۢ\n" +
//            "ۚۧۦ\n" +
//            "۫ۘ۬\n" +
//            "ۙ۫ۨ\n" +
//            "۟۬ۥۘ\n" +
//            "ۤۥۡۘ\n" +
//            "۟ۜۥ\n" +
//            "ۖۛ۫\n" +
//            "ۧ۟ۙ\n" +
//            "ۡۤۤ\n" +
//            "ۚ۬ۦۘ\n" +
//            "۟ۜۚ\n" +
//            "ۧۙۡۘ\n" +
//            "۟ۖ۫\n" +
//            "ۚۚۘ\n" +
//            "ۥۜۢ\n" +
//            "ۖۥۘۘ\n" +
//            "۬ۤۜ\n" +
//            "ۥۡۛ\n" +
//            "ۡۜۖ\n" +
//            "ۥۡۘۘ\n" +
//            "ۖۥ۬\n" +
//            "ۡۥۘ\n" +
//            "ۢ۬ۛ\n" +
//            "ۗ۬ۡ\n" +
//            "۬ۖۥ\n" +
//            "۬ۖۛ\n" +
//            "ۥ۟ۘۘ\n" +
//            "ۛ۬ۡۘ\n" +
//            "ۗۜۤ\n" +
//            "۫ۚۧ\n" +
//            "ۗۖۡۘ\n" +
//            "ۜۧۨۘ\n" +
//            "ۦۛۥۘ\n" +
//            "ۖ۫ۥۘ\n" +
//            "۫ۜ۟\n" +
//            "ۦۦۖۘ\n" +
//            "ۡۨۥۘ\n" +
//            "۫ۢ۬\n" +
//            "ۥۗۦۘ\n" +
//            "ۙۥۥۘ\n" +
//            "۫ۢ۟\n" +
//            "۫ۛ۬\n" +
//            "۠ۤۛ\n" +
//            "ۤۜۦ\n" +
//            "ۖ۬۟\n" +
//            "ۜۤ\n" +
//            "ۙۤۙ\n" +
//            "ۗۢ۫\n" +
//            "۟ۛۖۘ\n" +
//            "ۚ۫ۘۘ\n" +
//            "۠ۗۗ\n" +
//            "۫۫ۧ\n" +
//            "۠ۦۢ\n" +
//            "۟ۤۘۘ\n" +
//            "ۘۙۛ\n" +
//            "ۘۜۤ\n" +
//            "ۘۙۡۘ\n" +
//            "ۡۜۚ\n" +
//            "ۙ۫۠\n" +
//            "ۙۥۧۘ\n" +
//            "۠ۡۜۘ\n" +
//            "ۡۜۖۘ\n" +
//            "ۨۘ۟\n" +
//            "ۧۛۨۘ\n" +
//            "ۦۤۤ\n" +
//            "ۜۢۨۘ\n" +
//            "ۢۗۘۘ\n" +
//            "ۗۖۨۘ\n" +
//            "ۘۖۦ\n" +
//            "ۛۗۛ\n" +
//            "ۛ۟ۦ\n" +
//            "ۙۛۡۘ\n" +
//            "۠ۥۛ\n" +
//            "۫ۜۡ\n" +
//            "۠ۛۨ\n" +
//            "ۢۜۙ\n" +
//            "ۘ۟ۘ\n" +
//            "ۜ۫ۙ\n" +
//            "ۗ۟ۖ\n" +
//            "۬ۙ۫\n" +
//            "ۙۘۨۘ\n" +
//            "ۛۡۦ\n" +
//            "۟ۨ۠\n" +
//            "ۗۘ۠\n" +
//            "ۜ۟ۦ\n" +
//            "۫۠ۧ\n" +
//            "ۖۡۜۘ\n" +
//            "ۨ۫ۨ\n" +
//            "ۚۢۚ\n" +
//            "ۥ۫ۨۘ\n" +
//            "ۗ۠ۙ\n" +
//            "ۤۙۨ\n" +
//            "ۡ۬ۨۘ\n" +
//            "ۜۘۖۘ\n" +
//            "ۥ۬ۗ\n" +
//            "ۜۚۦ\n" +
//            "ۜۚۨۘ\n" +
//            "ۢۚۚ\n" +
//            "ۢۘ۟\n" +
//            "ۤۧۢ\n" +
//            "۠۟ۤ\n" +
//            "ۖ۟ۜۘ\n" +
//            "ۢۘۨۘ\n" +
//            "۠ۗۨ\n" +
//            "۫ۤۨ\n" +
//            "۫ۗۛ\n" +
//            "۠ۢۧ\n" +
//            "ۦۗۗ\n" +
//            "ۥۚۛ\n" +
//            "ۚ۠ۜۘ\n" +
//            "ۨ۬ۘۘ\n" +
//            "ۨۨۦۘ\n" +
//            "ۥۨۘ\n" +
//            "ۘ۠ۨ\n" +
//            "ۦۚ۟\n" +
//            "۫۬۬\n" +
//            "۠ۘۖۘ\n" +
//            "ۧۖۥ\n" +
//            "۠ۜ\n" +
//            "۟ۙ\n" +
//            "ۨۖۛ\n" +
//            "ۗ۠ۧ\n" +
//            "۟ۚۜ\n" +
//            "۠۠ۖۘ\n" +
//            "۟ۥۥ\n" +
//            "۟۬ۨ\n" +
//            "۫ۤ۠\n" +
//            "ۘۥ۬\n" +
//            "ۚۡۤ\n" +
//            "ۡۗۛ\n" +
//            "ۙۡۘۘ\n" +
//            "ۨۦۘ\n" +
//            "۬۬ۚ\n" +
//            "۫ۦۦ\n" +
//            "ۘۧۡ\n" +
//            "ۘ۠ۙ\n" +
//            "۬ۤ۫\n" +
//            "ۙۛۥۘ\n" +
//            "ۘۗ۬\n" +
//            "ۛ۫ۚ\n" +
//            "ۦۤۦۘ\n" +
//            "ۧۖ۠\n" +
//            "۟ۤۨ\n" +
//            "۫ۡۙ\n" +
//            "ۦۢ۬\n" +
//            "ۖۧۤ\n" +
//            "ۨۨۜۘ\n" +
//            "۬ۨۛ\n" +
//            "ۦۖۡ\n" +
//            "ۗۖۨ\n" +
//            "ۧۗۚ\n" +
//            "۟ۜ\n" +
//            "۫ۥۗ\n" +
//            "ۘ\n" +
//            "ۙ۠ۨ\n" +
//            "ۨۙۜ\n" +
//            "۠ۜۖ\n" +
//            "ۗۢۦ\n" +
//            "ۡۥۦۘ\n" +
//            "ۛۗۥ\n" +
//            "۬۠ۤ\n" +
//            "ۙۨۤ\n" +
//            "ۗۗۥ\n" +
//            "ۥۘۗ\n" +
//            "ۥۛۗ\n" +
//            "ۨۡ۠\n" +
//            "ۗ۫ۙ\n" +
//            "ۦۨۖۘ\n" +
//            "ۡۙۨ\n" +
//            "۠ۜۢ\n" +
//            "۟ۡ۠\n" +
//            "۠ۘۖ\n" +
//            "ۙ۠ۦ\n" +
//            "ۤۤۢ\n" +
//            "ۦۘۖۘ\n" +
//            "ۜۚ۟\n" +
//            "ۨۨۡۘ\n" +
//            "ۨۥۡۘ\n" +
//            "۟ۤ۠\n" +
//            "ۗ۬ۖۘ\n" +
//            "ۛ۬ۘ\n" +
//            "ۙ۬\n" +
//            "۫ۗۦ\n" +
//            "ۚۤ۟\n" +
//            "ۚۖۨ\n" +
//            "۫ۜ۠\n" +
//            "ۧۜ\n" +
//            "ۦۢۘ\n" +
//            "۬۠ۜۘ\n" +
//            "ۨۘۜۘ\n" +
//            "ۥۤۜ\n" +
//            "ۨۦۙ\n" +
//            "ۡۜۤ\n" +
//            "۠ۚۤ\n" +
//            "ۗۨۘ\n" +
//            "ۗۗۘۘ\n" +
//            "ۦۙۘ\n" +
//            "ۥۥۧ\n" +
//            "ۚۦ\n" +
//            "ۚۜۖۘ\n" +
//            "ۢۢۦ\n" +
//            "ۨ۫ۡۘ\n" +
//            "۬ۖۧۘ\n" +
//            "ۗۜۜ\n" +
//            "۬۟ۦۘ\n" +
//            "۠ۨ۫\n" +
//            "ۙۢ\n" +
//            "ۦۢۨۘ\n" +
//            "ۦۛۦ\n" +
//            "ۧۖۨ\n" +
//            "ۦۗ۠\n" +
//            "ۘ۟ۨۘ\n" +
//            "ۧۦۖ\n" +
//            "ۙۥۢ\n" +
//            "ۖۦ\n" +
//            "ۙۗ۟\n" +
//            "ۜ۠ۖ\n" +
//            "ۨۧۤ\n" +
//            "ۙۡۧ\n" +
//            "ۦۘۗ\n" +
//            "ۙۛۖۘ\n" +
//            "ۗۧ\n" +
//            "۠ۘ۬\n" +
//            "ۤ۬ۡ\n" +
//            "ۨ۫۬\n" +
//            "ۨ۫ۙ\n" +
//            "ۛۖۜ\n" +
//            "ۨۚۡۘ\n" +
//            "ۤۚ۫\n" +
//            "ۧۦۦۘ\n" +
//            "۫ۨۙ\n" +
//            "ۘۙۙ\n" +
//            "۫\n" +
//            "ۜۜۖ\n" +
//            "ۘۢۜ\n" +
//            "ۗ۠ۘ\n" +
//            "۫ۜۢ\n" +
//            "۫ۘۜۘ\n" +
//            "۬ۤۤ\n" +
//            "ۘۦۚ\n" +
//            "ۛۗ۬\n" +
//            "۫۬ۘۘ\n" +
//            "۟ۡ\n" +
//            "ۧ۫ۙ\n" +
//            "ۘۘ۬\n" +
//            "ۤۖۨۘ\n" +
//            "ۨۚۖ\n" +
//            "ۘ۫۬\n" +
//            "۠ۧۦۘ\n" +
//            "ۗۢۦۘ\n" +
//            "ۤۖۦ\n" +
//            "ۘۦۛ\n" +
//            "ۜۥۜ\n" +
//            "ۧ۠ۧ\n" +
//            "ۖۗۘۘ\n" +
//            "ۚۥۙ\n" +
//            "ۥ۫ۤ\n" +
//            "ۥ۠ۢ\n" +
//            "ۥۢۤ\n" +
//            "ۤۗۛ\n" +
//            "۬ۡۧ\n" +
//            "ۦۥۜۘ\n" +
//            "ۧۡۦۘ\n" +
//            "ۤۤۨۘ\n" +
//            "۫ۖۜۘ\n" +
//            "ۘۤ\n" +
//            "ۤۦۥۘ\n" +
//            "ۚ۬۬\n" +
//            "ۦۜۧۘ\n" +
//            "ۡۥۗ\n" +
//            "ۜۗ۠\n" +
//            "ۘۨ۟\n" +
//            "ۦ۟ۖۘ\n" +
//            "ۢ۟۬\n" +
//            "ۗۗۛ\n" +
//            "۟ۢۦ\n" +
//            "ۨۖ۫\n" +
//            "ۖۖۗ\n" +
//            "ۨۘۜ\n" +
//            "ۥۨۜۘ\n" +
//            "ۚۜۜ\n" +
//            "۬ۙۥ\n" +
//            "ۜۙۘۘ\n" +
//            "ۗ۬ۖ\n" +
//            "ۖۚۛ\n" +
//            "ۡ۬ۥ\n" +
//            "ۨ۠۬\n" +
//            "۫ۡۘ\n" +
//            "۟ۚۦۘ\n" +
//            "ۜۢ۬\n" +
//            "۫ۦۨ\n" +
//            "ۚۦۖۘ\n" +
//            "۟۟ۙ\n" +
//            "ۗۨۙ\n" +
//            "ۘۘۡۘ\n" +
//            "ۢۤۨ\n" +
//            "ۡ۬ۚ\n" +
//            "ۡۜ۬\n" +
//            "۠ۧۦ\n" +
//            "ۙ۫ۚ\n" +
//            "ۨ۫ۥ\n" +
//            "ۘۢ۬\n" +
//            "۠ۧۡ\n" +
//            "ۦ۠ۦۘ\n" +
//            "ۜۘۗ\n" +
//            "ۛۡۘ\n" +
//            "ۛۤۜ\n" +
//            "ۡۡ۠\n" +
//            "ۡۤۛ\n" +
//            "ۢۤۡ\n" +
//            "ۦۧۗ\n" +
//            "۬ۙۜ\n" +
//            "ۧۧۜۘ\n" +
//            "ۙۤۚ\n" +
//            "ۜ۟ۤ\n" +
//            "ۜ۫ۤ\n" +
//            "ۦۥۨ\n" +
//            "ۢۘۧۘ\n" +
//            "ۧۥۨ\n" +
//            "ۡۗۘ\n" +
//            "ۘۧۚ\n" +
//            "۬ۢۡ\n" +
//            "ۦۙۖ\n" +
//            "ۧۢ\n" +
//            "۫ۢۡۘ\n" +
//            "ۘۨۗ\n" +
//            "ۤۚۙ\n" +
//            "ۢۧ۠\n" +
//            "۫ۤۚ\n" +
//            "ۖ۫ۘۘ\n" +
//            "۠۬ۛ\n" +
//            "۠ۨ۠\n" +
//            "ۙ۬ۡ\n" +
//            "ۤۡۘ\n" +
//            "ۡۚ۫\n" +
//            "ۚ۟ۧ\n" +
//            "ۛۘۘۘ\n" +
//            "ۦۧ۠\n" +
//            "۬ۢ\n" +
//            "ۦۢۗ\n" +
//            "ۛۛۡۘ\n" +
//            "ۘۜ\n" +
//            "ۖۥۖۘ\n" +
//            "ۦ۟۠\n" +
//            "ۢۜۖۘ\n" +
//            "۟۠ۦ\n" +
//            "ۡۛۨ\n" +
//            "ۛۥۜۘ\n" +
//            "۫ۤۧ\n" +
//            "۠ۨۜۘ\n" +
//            "۫ۘۗ\n" +
//            "ۘ۫ۡ\n" +
//            "ۚۧۨۘ\n" +
//            "ۢۧۗ\n" +
//            "ۛۙ۫\n" +
//            "ۖۧۛ\n" +
//            "ۦۗۘ\n" +
//            "ۢۗۨۘ\n" +
//            "ۦۚۥۘ\n" +
//            "ۥۤۢ\n" +
//            "ۗ۬ۙ\n" +
//            "ۤ۟ۜ\n" +
//            "ۦۨۖ\n" +
//            "ۖۘۚ\n" +
//            "ۦۢ۫\n" +
//            "ۡۗۡ\n" +
//            "ۧۥۦۘ\n" +
//            "ۙۢۦۘ\n" +
//            "ۙۤۦ\n" +
//            "ۚۘۘۘ\n" +
//            "ۗۗۜ\n" +
//            "ۜۚۘ\n" +
//            "ۧۨ\n" +
//            "ۡۦ۫\n" +
//            "ۧۗۛ\n" +
//            "ۧ۠ۙ\n" +
//            "ۖۥۛ\n" +
//            "ۛ۬\n" +
//            "ۤۨۨۘ\n" +
//            "ۙۙۗ\n" +
//            "ۘۥۨۘ\n" +
//            "ۛۨۘ\n" +
//            "ۜۗۡ\n" +
//            "ۧ۟ۖ\n" +
//            "ۤۘۡ\n" +
//            "۫ۨۘۘ\n" +
//            "ۤۤ۟\n" +
//            "ۚۚۜ\n" +
//            "ۜۙ\n" +
//            "ۖۙۖ\n" +
//            "ۘۚۥ\n" +
//            "ۘۚۡۘ\n" +
//            "ۢ۠ۜ\n" +
//            "ۥۚۧ\n" +
//            "ۚ۫ۚ\n" +
//            "ۧۡ۠\n" +
//            "ۜۜۥۘ\n" +
//            "۠ۤۜ\n" +
//            "ۚۙۥ\n" +
//            "ۚۘۢ\n" +
//            "ۜۖ۠\n" +
//            "۫۬ۘ\n" +
//            "۫ۙۖۘ\n" +
//            "ۤۢ۠\n" +
//            "ۡۦۘۘ\n" +
//            "ۗۥۛ\n" +
//            "ۧۗۥ\n" +
//            "ۖۗۦ\n" +
//            "۬ۘۘ\n" +
//            "ۛۡۦۘ\n" +
//            "۟ۧۡ\n" +
//            "۠۫ۙ\n" +
//            "۬ۥۥ\n" +
//            "ۚ۬۟\n" +
//            "ۢۙۜۘ\n" +
//            "۠۟ۜۘ\n" +
//            "ۙۘۘۘ\n" +
//            "۫ۛۦ\n" +
//            "ۦۥ\n" +
//            "ۦۤۢ\n" +
//            "ۥۤ۠\n" +
//            "ۢۧۧ\n" +
//            "ۖۚ\n" +
//            "ۖۙۙ\n" +
//            "ۢۛۖۘ\n" +
//            "ۙ۬ۥ\n" +
//            "۟ۡۜۘ\n" +
//            "ۢۖۘ\n" +
//            "ۢ۟۠\n" +
//            "۟۠ۡ\n" +
//            "ۜ۬ۡ\n" +
//            "ۘۢۥ\n" +
//            "ۘ۫ۖۘ\n" +
//            "ۧۥ۬\n" +
//            "ۧ۠ۨ\n" +
//            "۫۟۫\n" +
//            "ۦۘۡ\n" +
//            "۠ۤۖ\n" +
//            "ۨۛۢ\n" +
//            "ۦۖۨۘ\n" +
//            "ۜۘۘ\n" +
//            "ۧۗۙ\n" +
//            "ۧۦۜۘ\n" +
//            "ۢۖۤ\n" +
//            "ۡ۫ۚ\n" +
//            "۠ۥۥۘ\n" +
//            "۬ۦ۟\n" +
//            "ۢۢۖ\n" +
//            "ۖۙۘۘ\n" +
//            "ۤۛۢ\n" +
//            "ۚۗ۫\n" +
//            "ۢۜۥۘ\n" +
//            "ۘ۠۠\n" +
//            "ۧۙۚ\n" +
//            "ۗۜ۠\n" +
//            "۠ۥۜۘ\n" +
//            "۫۟ۨۘ\n" +
//            "ۘ۬ۜۘ\n" +
//            "ۛۜۨ\n" +
//            "۟ۥۨۘ\n" +
//            "ۗۚۖۘ\n" +
//            "ۚۜۦۘ\n" +
//            "ۜۚ\n" +
//            "ۛۜۚ\n" +
//            "۟ۤۦ\n" +
//            "ۡۧۖ\n" +
//            "ۗۥۥۘ\n" +
//            "ۡۜ۫\n" +
//            "ۦ۫\n" +
//            "۠۬ۖ\n" +
//            "ۧۦۜ\n" +
//            "ۗۦۘۘ\n" +
//            "ۨۗۡ\n" +
//            "۬ۜۜۘ\n" +
//            "ۡۜۙ\n" +
//            "۬۬ۙ\n" +
//            "ۢۙ\n" +
//            "ۛۚۡ\n" +
//            "۟ۖۖ\n" +
//            "ۧۗۤ\n" +
//            "ۢ۫ۖۘ\n" +
//            "ۢ۬ۢ\n" +
//            "ۨۧۢ\n" +
//            "ۨۖۚ\n" +
//            "۠ۥۖۘ\n" +
//            "ۦۖۖ\n" +
//            "۠ۨۖ\n" +
//            "ۙۦۡ\n" +
//            "ۘۖۜ\n" +
//            "ۢۜۜ\n" +
//            "ۤ۠ۜۘ\n" +
//            "ۢ۠ۡ\n" +
//            "ۦۦۙ\n" +
//            "ۡۨۧۘ\n" +
//            "ۜۘۘۘ\n" +
//            "۟ۛۚ\n" +
//            "ۥۦۧ\n" +
//            "ۡۘۖ\n" +
//            "ۜۛۤ\n" +
//            "ۤ۫ۦ\n" +
//            "۬ۤۥۘ\n" +
//            "ۙۙۥ\n" +
//            "ۙۖۦۘ\n" +
//            "ۡۥۘۘ\n" +
//            "ۧۤۥۘ\n" +
//            "ۖۦۜۘ\n" +
//            "۠ۜۥ\n" +
//            "ۛ۠ۡۘ\n" +
//            "ۖۤۢ\n" +
//            "۫ۙ\n" +
//            "ۥۤ۬\n" +
//            "۫۫ۚ\n" +
//            "ۢۢ۟\n" +
//            "ۨۤۢ\n" +
//            "ۜۘۡۘ\n" +
//            "ۚۘۗ\n" +
//            "ۙ۠ۜ\n" +
//            "ۤ۫ۤ\n" +
//            "ۜۚۧ\n" +
//            "ۦۘۘ\n" +
//            "ۡ۠۫\n" +
//            "ۖۨۨ\n" +
//            "ۗۖۗ\n" +
//            "ۙۚۥ\n" +
//            "ۨۘۧ\n" +
//            "۫ۤۤ\n" +
//            "ۢ۠ۙ\n" +
//            "ۢ۠ۤ\n" +
//            "۬ۥۚ\n" +
//            "ۛۗۘ\n" +
//            "ۙۢۡ\n" +
//            "۠ۚۢ\n" +
//            "ۥۗۚ\n" +
//            "ۨۦۘۘ\n" +
//            "ۜ۫ۦ\n" +
//            "ۧۖ۟\n" +
//            "ۥۦۖ\n" +
//            "ۡۦۚ\n" +
//            "۬ۨۖ\n" +
//            "ۛۤۡۘ\n" +
//            "ۗ۬\n" +
//            "ۧۥۚ\n" +
//            "۫ۜۚ\n" +
//            "ۥۜۜ\n" +
//            "ۖۚۚ\n" +
//            "ۖۥۨۘ\n" +
//            "ۗۖۘ\n" +
//            "ۙۙۜ\n" +
//            "ۛ۫ۨۘ\n" +
//            "ۢۧۨۘ\n" +
//            "ۧۡۨۘ\n" +
//            "ۜ۫ۨۘ\n" +
//            "ۡۘۜ\n" +
//            "ۛۜۥ\n" +
//            "ۚۚۖ\n" +
//            "ۦۘۡۘ\n" +
//            "۠۫ۦۘ\n" +
//            "ۢ۠۠\n" +
//            "ۙۢ۫\n" +
//            "۬ۤ\n" +
//            "ۜۙ۫\n" +
//            "ۥۧۨ\n" +
//            "ۤۤۜۘ\n" +
//            "ۖ۫ۡۘ\n" +
//            "ۜۘۢ\n" +
//            "ۨ۬\n" +
//            "ۚ۬ۦ\n" +
//            "ۤۧۘ\n" +
//            "ۡۢۛ\n" +
//            "ۖۦۚ\n" +
//            "ۖۦۨ\n" +
//            "۬ۥ\n" +
//            "ۢۧ۟\n" +
//            "ۦ۟ۗ\n" +
//            "ۚ۟۟\n" +
//            "ۜۨۡۘ\n" +
//            "ۗ۫ۧ\n" +
//            "ۡۦۖ\n" +
//            "ۛۖۜۘ\n" +
//            "۬ۢۥۘ\n" +
//            "۬ۚۘۘ\n" +
//            "ۘ۟ۡ\n" +
//            "۬ۜۡۘ\n" +
//            "ۚۙۦۘ\n" +
//            "۠ۤۥ\n" +
//            "ۗۗۦۘ\n" +
//            "ۗۢۡۘ\n" +
//            "۬ۚۤ\n" +
//            "ۧ۟ۚ\n" +
//            "ۡۢۤ\n" +
//            "ۛۡۖ\n" +
//            "ۦ۫ۥ\n" +
//            "ۙۤۛ\n" +
//            "ۧۦ\n" +
//            "ۚۦۚ\n" +
//            "ۦۜ۬\n" +
//            "ۗ۫ۜ\n" +
//            "۠۫ۖ\n" +
//            "ۛۦۥۘ\n" +
//            "ۡۚۛ\n" +
//            "ۚۦۨ\n" +
//            "۬ۛ۟\n" +
//            "۬ۦۤ\n" +
//            "ۘۛۗ\n" +
//            "ۨۥۧۘ\n" +
//            "۬ۡۛ\n" +
//            "ۖۧۧ\n" +
//            "ۧۨ۟\n" +
//            "ۢۢۦۘ\n" +
//            "ۛۗ۫\n" +
//            "ۛۙۘ\n" +
//            "ۢۤۢ\n" +
//            "ۗۘۜۘ\n" +
//            "۠ۗۦۘ\n" +
//            "۫ۚۜۘ\n" +
//            "ۜۡ۬\n" +
//            "۠ۡۧ\n" +
//            "ۨۜۨۘ\n" +
//            "۫ۙۜ\n" +
//            "ۗۖۢ\n" +
//            "ۘۘۗ\n" +
//            "ۜۙ۠\n" +
//            "ۡۧۨ\n" +
//            "۠ۨۢ\n" +
//            "ۖۦۗ\n" +
//            "ۜۧ۠\n" +
//            "۬ۛۡۘ\n" +
//            "ۦۧۘ\n" +
//            "۬۠ۦ\n" +
//            "۠۠ۥۘ\n" +
//            "ۘۥۦ\n" +
//            "ۛۥۥۘ\n" +
//            "ۚۚۥ\n" +
//            "ۥۧ۬\n" +
//            "ۥۛ۟\n" +
//            "ۨۥۧ\n" +
//            "ۨۧ۬\n" +
//            "۠ۖۡۘ\n" +
//            "ۗۙ۠\n" +
//            "ۨۙۡ\n" +
//            "۟ۚۙ\n" +
//            "ۡ۫ۖ\n" +
//            "ۖۧۖ\n" +
//            "ۙۨۧ\n" +
//            "ۗۧۜۘ\n" +
//            "ۘۗۗ\n" +
//            "ۢ۬ۨۘ\n" +
//            "۟ۙۦۘ\n" +
//            "ۗۨۨۘ\n" +
//            "ۡ۟ۘ\n" +
//            "۟ۢۜ\n" +
//            "ۨۛۥۘ\n" +
//            "ۜ۠ۥ\n" +
//            "ۥۢۦۘ\n" +
//            "ۙۘ۬\n" +
//            "ۖۨۤ\n" +
//            "۟ۤۢ\n" +
//            "ۙ۫ۖۘ\n" +
//            "ۘۜۦۘ\n" +
//            "ۗ۬ۦ\n" +
//            "۬ۦۢ\n" +
//            "ۧۘ۬\n" +
//            "۠۟ۥۘ\n" +
//            "ۤۗۙ\n" +
//            "ۧۖۦۘ\n" +
//            "ۢۙۚ\n" +
//            "۠ۢۜۘ\n" +
//            "ۖۘۜۘ\n" +
//            "ۖۤۨ\n" +
//            "۬۫ۜۘ\n" +
//            "ۥ۠ۤ\n" +
//            "ۙۗۡۘ\n" +
//            "ۙۗۡ\n" +
//            "ۨ۬ۢ\n" +
//            "ۛۥۥ\n" +
//            "ۨۜ\n" +
//            "ۙۥ۟\n" +
//            "ۤۤ۬\n" +
//            "ۛۢۨ\n" +
//            "۫۠ۦۘ\n" +
//            "ۙۚۦۘ\n" +
//            "ۤۧۛ\n" +
//            "ۢۦۖ\n" +
//            "ۜۡ۫\n" +
//            "ۚۘۜۘ\n" +
//            "ۘۛۜۘ\n" +
//            "۠ۛۡ\n" +
//            "ۙۜۜ\n" +
//            "ۦۗ۫\n" +
//            "۠ۧۥۘ\n" +
//            "ۗۡۗ\n" +
//            "۠ۡۢ\n" +
//            "ۡۡۦۘ\n" +
//            "۫ۖ\n" +
//            "ۗۨۜۘ\n" +
//            "ۡۢ\n" +
//            "ۗۛۛ\n" +
//            "ۧۡۜ\n" +
//            "ۦۗۢ\n" +
//            "ۛ۠۟\n" +
//            "ۦۗ\n" +
//            "ۡۚۡۘ\n" +
//            "ۦۤۘ\n" +
//            "ۗ۫ۗ\n" +
//            "ۛۜۙ\n" +
//            "۫ۢۢ\n" +
//            "ۦۛۖۘ\n" +
//            "ۤۧۜ\n" +
//            "ۙۢ۬\n" +
//            "ۗۚۤ\n" +
//            "۫ۧۦ\n" +
//            "ۘۜۧ\n" +
//            "ۡۨۦۘ\n" +
//            "ۙ۠ۙ\n" +
//            "ۚۜۜۘ\n" +
//            "ۖۢ۟\n" +
//            "ۖۗ۫\n" +
//            "ۡۧۖۘ\n" +
//            "ۜۦۛ\n" +
//            "ۡ۠ۨۘ\n" +
//            "ۧۗۢ\n" +
//            "ۦۦۚ\n" +
//            "ۙۗۘ\n" +
//            "ۜۦۘ\n" +
//            "ۤۥ۟\n" +
//            "ۦۡۡ\n" +
//            "ۗ۫ۚ\n" +
//            "ۨۛۜ\n" +
//            "ۡۖۜۘ\n" +
//            "ۖۢۧ\n" +
//            "ۘ۬۫\n" +
//            "۬ۨۘ\n" +
//            "۫۬ۖۘ\n" +
//            "ۨۨ۠\n" +
//            "ۨۛۚ\n" +
//            "ۤۡ۬\n" +
//            "۬ۘۛ\n" +
//            "ۢ۫ۙ\n" +
//            "۠۬ۜۘ\n" +
//            "ۥۙۢ\n" +
//            "۫ۚۤ\n" +
//            "ۜۥۖۘ\n" +
//            "ۡۗۖ\n" +
//            "ۧۤ\n" +
//            "ۘۜۜۘ\n" +
//            "۟ۘۥۘ\n" +
//            "ۛ۟ۨۘ\n" +
//            "ۦ۫ۨۘ\n" +
//            "ۦۘۛ\n" +
//            "ۖۡۜ\n" +
//            "ۙ۟۫\n" +
//            "۫ۘۥۘ\n" +
//            "ۘۙۜۘ\n" +
//            "ۖۦۜ\n" +
//            "ۚۗۛ\n" +
//            "۬ۦۦ\n" +
//            "۠ۢۥ\n" +
//            "ۧ۠ۗ\n" +
//            "ۙۥۥ\n" +
//            "ۙ۠ۖ\n" +
//            "ۚ۟ۚ\n" +
//            "ۖۚۨۘ\n" +
//            "ۧۤۗ\n" +
//            "ۤۦۘۘ\n" +
//            "ۤ۟ۛ\n" +
//            "ۤۘۤ\n" +
//            "ۢۜۦ\n" +
//            "ۧۧۢ\n" +
//            "ۚۚ۬\n" +
//            "ۡۜۧ\n" +
//            "۫ۦ۫\n" +
//            "۬۠ۡ\n" +
//            "ۗۖ۬\n" +
//            "ۗۘۧۘ\n" +
//            "ۡۢۨ\n" +
//            "۫۟ۤ\n" +
//            "۫ۙۧ\n" +
//            "ۘۘۤ\n" +
//            "ۤ۬ۧ\n" +
//            "۠ۗۥ\n" +
//            "۟ۚۖ\n" +
//            "ۘۡ۬\n" +
//            "ۥۦ۠\n" +
//            "ۧ۬ۢ\n" +
//            "ۛۧۖ\n" +
//            "۬ۧۜ\n" +
//            "ۥۖ۬\n" +
//            "ۨۛۤ\n" +
//            "ۛۘۤ\n" +
//            "ۨ۟ۖ\n" +
//            "ۡۙۦۘ\n" +
//            "۬ۥۜ\n" +
//            "ۥۙۚ\n" +
//            "ۖۡۧۘ\n" +
//            "ۨۥۘۘ\n" +
//            "ۨۚۥۘ\n" +
//            "ۘۧ\n" +
//            "۫۫ۦۘ\n" +
//            "۬ۖۖۘ\n" +
//            "ۖۡۦ\n" +
//            "۬ۢۥ\n" +
//            "۠ۛۙ\n" +
//            "ۖ۟ۨ\n" +
//            "۟ۛۦ\n" +
//            "۬ۘۧ\n" +
//            "۫ۚ۫\n" +
//            "ۥ۬ۚ\n" +
//            "ۡۜۧۘ\n" +
//            "ۦۡۥۘ\n" +
//            "۟ۡۢ\n" +
//            "ۦ۫ۧ\n" +
//            "ۛۘۡ\n" +
//            "ۦۖۘ\n" +
//            "ۘ۠ۦۘ\n" +
//            "ۙ۠۟\n" +
//            "ۗۧۜ\n" +
//            "ۥ۠ۚ\n" +
//            "ۥۧۧ\n" +
//            "ۗۜ۟\n" +
//            "ۦ۠ۛ\n" +
//            "ۥۦۚ\n" +
//            "۟ۘۗ\n" +
//            "۟ۛۡۘ\n" +
//            "ۨ۬ۨۘ\n" +
//            "ۥۛۙ\n" +
//            "ۛۤۖۘ\n" +
//            "ۜ۠ۘ\n" +
//            "ۗۖ۠\n" +
//            "۬ۤۘ\n" +
//            "۫ۤۗ\n" +
//            "ۘ۟ۥۘ\n" +
//            "ۗۖۖ\n" +
//            "۬ۘۢ\n" +
//            "۫۟ۧ\n" +
//            "ۛۢ۟\n" +
//            "ۖۧۖۘ\n" +
//            "ۛۙۡۘ\n" +
//            "ۧ۬۠\n" +
//            "ۧۛۙ\n" +
//            "ۜۚ۠\n" +
//            "ۧۚۡۘ\n" +
//            "ۘۖ۠\n" +
//            "۫ۙۛ\n" +
//            "ۡ۬۫\n" +
//            "ۥۜۘ\n" +
//            "ۚۛ۠\n" +
//            "ۤۢۦۘ\n" +
//            "۠ۨۨ\n" +
//            "۠ۡۛ\n" +
//            "ۛۢۜ\n" +
//            "ۦۡۛ\n" +
//            "ۧۧ\n" +
//            "۫ۧ۟\n" +
//            "ۚ۫ۢ\n" +
//            "ۛۗۨۘ\n" +
//            "ۡ۟ۢ\n" +
//            "ۜۛۜۘ\n" +
//            "۠۟ۦ\n" +
//            "۟ۨۨ\n" +
//            "ۡ۟ۜۘ\n" +
//            "۬۫۠\n" +
//            "ۧۡ۟\n" +
//            "ۜۙۤ\n" +
//            "ۚۡۖۘ\n" +
//            "۠ۖۧ\n" +
//            "۫۠ۜ\n" +
//            "ۛۚۨۘ\n" +
//            "ۡۘۧ\n" +
//            "ۡۧۗ\n" +
//            "۬ۢۨۘ\n" +
//            "ۖۢۨۘ\n" +
//            "ۦ۫ۖ\n" +
//            "ۛۥۜ\n" +
//            "ۘۖۦۘ\n" +
//            "ۚۧ۫\n" +
//            "۠ۘ۫\n" +
//            "ۚۧۜ\n" +
//            "۬ۤۖۘ\n" +
//            "ۗۨۡ\n" +
//            "ۛۛۧ\n" +
//            "ۜۚۤ\n" +
//            "ۗ۠ۡۘ\n" +
//            "۫ۗ۠\n" +
//            "ۗۦۙ\n" +
//            "۟ۙۥ\n" +
//            "ۙۘ۟\n" +
//            "ۛۡۢ\n" +
//            "ۨۘ۬\n" +
//            "ۗ۟ۗ\n" +
//            "ۜ۬ۜ\n" +
//            "۬ۧۡۘ\n" +
//            "ۥ۫ۡ\n" +
//            "ۤۛۡ\n" +
//            "ۘۡ\n" +
//            "۬ۢۧ\n" +
//            "ۜ۬ۖۘ\n" +
//            "۟ۖۡ\n" +
//            "۟ۥۡ\n" +
//            "ۛۥۦۘ\n" +
//            "۟ۛۨ\n" +
//            "ۢ۟ۨۘ\n" +
//            "۟ۢۖ\n" +
//            "۫ۛۖۘ\n" +
//            "ۡۖۜ\n" +
//            "ۚۗ۟\n" +
//            "ۥ۟\n" +
//            "ۤۡۨ\n" +
//            "ۖۡۗ\n" +
//            "ۛ۫۠\n" +
//            "۠ۘۘ\n" +
//            "ۚۛ۬\n" +
//            "ۘ۬ۥ\n" +
//            "ۧۢۘۘ\n" +
//            "O\n" +
//            "۟ۢۚ\n" +
//            "ۙۛۘ\n" +
//            "۠ۜۛ\n" +
//            "ۜۥۚ\n" +
//            "ۡ۬ۛ\n" +
//            "۟ۨۛ\n" +
//            "ۛۢۨۘ\n" +
//            "۫ۘۨۘ\n" +
//            "ۗۦۜ\n" +
//            "ۦ۟\n" +
//            "ۛۜۦ\n" +
//            "ۗ۠ۗ\n" +
//            "ۥۙ۬\n" +
//            "ۢۥۨ\n" +
//            "۬ۡۘ\n" +
//            "ۤ۫ۚ\n" +
//            "ۤۛۖۘ\n" +
//            "ۛۤ۠\n" +
//            "ۥۥ۟\n" +
//            "ۛۤۘۘ\n" +
//            "ۗ۬ۚ\n" +
//            "ۥۚۤ\n" +
//            "ۖۡۥ\n" +
//            "۬۬ۨ\n" +
//            "ۘۢۖۘ\n" +
//            "ۦ۬ۧ\n" +
//            "ۙۜۦۘ\n" +
//            "ۘۖۨۘ\n" +
//            "۫ۨۘ\n" +
//            "ۦۨۛ\n" +
//            "ۤۜۢ\n" +
//            "۫ۗۨۘ\n" +
//            "ۚۖ۠\n" +
//            "ۙۦ۠\n" +
//            "ۘۖۘۘ\n" +
//            "ۥۚۢ\n" +
//            "۫ۖۡۘ\n" +
//            "ۥ۠ۡۘ\n" +
//            "ۤۚۦ\n" +
//            "ۘۦۨ\n" +
//            "ۚۘۥۘ\n" +
//            "۠ۙۗ\n" +
//            "ۘۛ۫\n" +
//            "ۘۘۘ\n" +
//            "ۦۧۢ\n" +
//            "۫ۖۦ\n" +
//            "۬ۙ۠\n" +
//            "۫ۢۖۘ\n" +
//            "ۦۡ۫\n" +
//            "ۥۖۙ\n" +
//            "ۧ۠ۚ\n" +
//            "۠۬ۖۘ\n" +
//            "ۚۜۗ\n" +
//            "ۨۥۡ\n" +
//            "ۧ۠ۨۘ\n" +
//            "ۜۦۜ\n" +
//            "ۘۥۧ\n" +
//            "ۖ۬ۤ\n" +
//            "ۚۛۜ\n" +
//            "۫ۧۗ\n" +
//            "۠ۥۨ\n" +
//            "ۚۗۦۘ\n" +
//            "ۢۛۨ\n" +
//            "۬ۗۡ\n" +
//            "ۧۦۘۘ\n" +
//            "ۨۢۘۘ\n" +
//            "ۜۢۖۘ\n" +
//            "۫ۡۡۘ\n" +
//            "ۥۨ۠\n" +
//            "ۧۘ۠\n" +
//            "ۧۙۘ\n" +
//            "ۙۧۧ\n" +
//            "۟۟ۧ\n" +
//            "ۛۨۜۘ\n" +
//            "ۘۘۥۘ\n" +
//            "ۤۧۤ\n" +
//            "۠ۤۚ\n" +
//            "ۘ۬ۥۘ\n" +
//            "ۘۡۛ\n" +
//            "ۨۥۖۘ\n" +
//            "ۙۜ۠\n" +
//            "۬ۨۦۘ\n" +
//            "ۢۜۘ\n" +
//            "ۡۜۘۘ\n" +
//            "ۤۦۦ\n" +
//            "ۤۗۥۘ\n" +
//            "ۧ۫ۜ\n" +
//            "ۢ۟\n" +
//            "ۘۨ\n" +
//            "ۤۦ\n" +
//            "ۤ۬ۘ\n" +
//            "ۧ۬۫\n" +
//            "ۙۖۡ\n" +
//            "ۚۨۖ\n" +
//            "۟ۙۜ\n" +
//            "ۢۚۜ\n" +
//            "ۢۤۖۘ\n" +
//            "۫ۥ۟\n" +
//            "ۥ۫ۘۘ\n" +
//            "ۙ۬ۖ\n" +
//            "۬ۛۢ\n" +
//            "ۛ۟ۙ\n" +
//            "ۨۥ۠\n" +
//            "۬۟ۗ\n" +
//            "ۥۜۧ\n" +
//            "ۜۘۥۘ\n" +
//            "ۜ۬ۧ\n" +
//            "ۚۜ۠\n" +
//            "۟ۡۦ\n" +
//            "ۜۥۧۘ\n" +
//            "۠۟ۙ\n" +
//            "۟ۖۧ\n" +
//            "ۜۨۧ\n" +
//            "۟۫ۖۘ\n" +
//            "۟ۗۗ\n" +
//            "ۗۧۦ\n" +
//            "ۡۨۘۘ\n" +
//            "ۧۥۦ\n" +
//            "ۙ۬ۖۘ\n" +
//            "ۙۦ۫\n" +
//            "ۙ۠۠\n" +
//            "ۚۚۗ\n" +
//            "ۤۥۨۘ\n" +
//            "ۗۢۤ\n" +
//            "ۤۘ۟\n" +
//            "ۙۗۥ\n" +
//            "ۚۡۖ\n" +
//            "ۤۚۨۘ\n" +
//            "۠ۜۦۘ\n" +
//            "ۜۧۤ\n" +
//            "ۥۖۜۘ\n" +
//            "ۨۥ۬\n" +
//            "ۤۡۢ\n" +
//            "ۛۙ۟\n" +
//            "ۗۘۖۘ\n" +
//            "ۦۜۜ\n" +
//            "ۢۛ۠\n" +
//            "ۥۜۦ\n" +
//            "ۡۤۡۘ\n" +
//            "ۨۦۛ\n" +
//            "ۦۙۙ\n" +
//            "ۧۥۨۘ\n" +
//            "ۡۙۘۘ\n" +
//            "ۗۡ۟\n" +
//            "ۜۨۥ\n" +
//            "ۖ۟ۦۘ\n" +
//            "ۛ۬ۗ\n" +
//            "ۜۖۜ\n" +
//            "ۨۥ\n" +
//            "ۛۡ۬\n" +
//            "۟ۜۦ\n" +
//            "ۛۥۚ\n" +
//            "ۚۜۥۘ\n" +
//            "ۢ۟ۨ\n" +
//            "ۤۥۗ\n" +
//            "۠ۙۛ\n" +
//            "ۤۚۧ\n" +
//            "ۘ۬ۡۘ\n" +
//            "ۦۘۚ\n" +
//            "ۤ۠ۗ\n" +
//            "۫ۗۚ\n" +
//            "ۧۚۘۘ\n" +
//            "۠۟۫\n" +
//            "ۧۜۥ\n" +
//            "ۙۗۦ\n" +
//            "ۜۡۨۘ\n" +
//            "ۤۡۨۘ\n" +
//            "ۚ۫۟\n" +
//            "۟ۧ۬\n" +
//            "۬ۚۦۘ\n" +
//            "ۧۜۜ\n" +
//            "۫ۖۧ\n" +
//            "۬ۛۦ\n" +
//            "ۖ۠ۧ\n" +
//            "ۛ۫ۘۘ\n" +
//            "ۧۙۦ\n" +
//            "ۘۡۗ\n" +
//            "ۡۤ۟\n" +
//            "ۢۛۜۘ\n" +
//            "۠ۡۖۘ\n" +
//            "۠۟۟\n" +
//            "ۖۜۨۘ\n" +
//            "۫ۨۥۘ\n" +
//            "ۤۢۜ\n" +
//            "ۧۘۢ\n" +
//            "ۥۨۖۘ\n" +
//            "ۥ۬ۢ\n" +
//            "ۡۗۤ\n" +
//            "ۨۛۧ\n" +
//            "ۡۢۨۘ\n" +
//            "۬ۜۤ\n" +
//            "ۢۤۘۘ\n" +
//            "ۨۥۜ\n" +
//            "ۘۨۧۘ\n" +
//            "ۚۖۥ\n" +
//            "ۢ۠ۖۘ\n" +
//            "۟ۘۦۘ\n" +
//            "ۙۜۢ\n" +
//            "۠ۙۧ\n" +
//            "ۢۘۜ\n" +
//            "۫ۥۥ\n" +
//            "۫۠ۖ\n" +
//            "ۢ۫\n" +
//            "ۗۧۖ\n" +
//            "۫۬ۜ\n" +
//            "ۘۤۧ\n" +
//            "ۗۦۗ\n" +
//            "ۛۜۦۘ\n" +
//            "۟ۢۨ\n" +
//            "۟۬ۡۘ\n" +
//            "ۨۢۗ\n" +
//            "ۢۤۦۘ\n" +
//            "ۖ۠۬\n" +
//            "ۦۜۛ\n" +
//            "ۜۥۦ\n" +
//            "ۖۡ۠\n" +
//            "ۨۢ۟\n" +
//            "ۢۦ۫\n" +
//            "۫ۘ۟\n" +
//            "ۛ۠ۖۘ\n" +
//            "ۧۢ۫\n" +
//            "ۡۧۘۘ\n" +
//            "ۘۙۦ\n" +
//            "ۘۧۥ\n" +
//            "۟ۧۘۘ\n" +
//            "ۨۖۥ\n" +
//            "۟۟ۡ\n" +
//            "ۢۢ۠\n" +
//            "ۘۛۦ\n" +
//            "ۨۧۦۘ\n" +
//            "ۨۜۜ\n" +
//            "ۘۘ۟\n" +
//            "ۚۗۘۘ\n" +
//            "ۚ۫ۦۘ\n" +
//            "۬ۚۙ\n" +
//            "ۧ۟۠\n" +
//            "ۨ۬ۡۘ\n" +
//            "۠ۘۨۘ\n" +
//            "ۢۦۙ\n" +
//            "ۤۙۖۘ\n" +
//            "ۤۜۡۘ\n" +
//            "ۦۢ۟\n" +
//            "۫ۜۜ\n" +
//            "ۖ۫ۧ\n" +
//            "ۘۢۨ\n" +
//            "ۖ۬ۥۘ\n" +
//            "ۧۙۤ\n" +
//            "ۨۚۥ\n" +
//            "ۗۢۢ\n" +
//            "ۦ۠ۡۘ\n" +
//            "ۥۜ\n" +
//            "ۥۚۖۘ\n" +
//            "۟ۦۧۘ\n" +
//            "ۧۚۜۘ\n" +
//            "ۗۙۥ\n" +
//            "ۦۜۙ\n" +
//            "ۗۛۤ\n" +
//            "ۡۚۢ\n" +
//            "۬ۥۘ\n" +
//            "ۙۦۢ\n" +
//            "ۛۥۤ\n" +
//            "ۙۨۧۘ\n" +
//            "ۚ۠ۘ\n" +
//            "۟ۡۙ\n" +
//            "ۨۧۥ\n" +
//            "ۡ۠ۦ\n" +
//            "۬ۗۜۘ\n" +
//            "ۢ۫۟\n" +
//            "ۗۢۙ\n" +
//            "ۖۥ۟\n" +
//            "۬ۘۤ\n" +
//            "ۛۧۥۘ\n" +
//            "۟ۨۧۘ\n" +
//            "ۧۡۜۘ\n" +
//            "ۨۚ\n" +
//            "ۚۖۘ\n" +
//            "ۛ۟\n" +
//            "۬ۢۨ\n" +
//            "۬ۖ۬\n" +
//            "ۡ\n" +
//            "ۘۢۥۘ\n" +
//            "۬ۧۥۘ\n" +
//            "ۢ۠ۦ\n" +
//            "ۡۧ\n" +
//            "ۘۢۙ\n" +
//            "ۜ۠۫\n" +
//            "ۦۛۜۘ\n" +
//            "ۘۨۥۘ\n" +
//            "ۘۙۢ\n" +
//            "ۨ۬۫\n" +
//            "ۧ۫ۡۘ\n" +
//            "ۧ۬ۡۘ\n" +
//            "ۚۤۖۘ\n" +
//            "ۦۨۨ\n" +
//            "ۘۤۗ\n" +
//            "۫ۚۜ\n" +
//            "ۗۚۨ\n" +
//            "ۤ۬ۙ\n" +
//            "ۖۢۡۘ\n" +
//            "۟ۜ۫\n" +
//            "ۖ۟ۜ\n" +
//            "ۥ۟۬\n" +
//            "ۧۛۡ\n" +
//            "ۗۗۜۘ\n" +
//            "۟ۗۨۘ\n" +
//            "ۦۚۥ\n" +
//            "ۚۙۧ\n" +
//            "ۙۨۜۘ\n" +
//            "ۖ۫ۡ\n" +
//            "ۨۢۦ\n" +
//            "۬ۜۥ\n" +
//            "ۥۤۖ\n" +
//            "ۙۘۢ\n" +
//            "ۜۤ۫\n" +
//            "۫ۘۛ\n" +
//            "ۤۡۚ\n" +
//            "ۙۡۥۘ\n" +
//            "ۨ۟ۧ\n" +
//            "ۦۢۙ\n" +
//            "ۡۚ۬\n" +
//            "ۘۗۧ\n" +
//            "ۡۤۥۘ\n" +
//            "ۤۨۙ\n" +
//            "۟ۖۦ\n" +
//            "ۥۤۚ\n" +
//            "ۜۦۦ\n" +
//            "ۙۚۤ\n" +
//            "۫۬ۧ\n" +
//            "ۛۨۖۘ\n" +
//            "ۥۛ۬\n" +
//            "ۖۧ۟\n" +
//            "ۜۙۜ\n" +
//            "ۥ۫۫\n" +
//            "ۛۥ۠\n" +
//            "ۡۛۥ\n" +
//            "ۨۛۦۘ\n" +
//            "ۚۜۡۘ\n" +
//            "۫ۙ۬\n" +
//            "ۤ۬ۖۘ\n" +
//            "۠ۗۡۘ\n" +
//            "ۦۛ۬\n" +
//            "ۦۨ۟\n" +
//            "ۖۚۘ\n" +
//            "ۙ۟ۙ\n" +
//            "ۘ۫ۤ\n" +
//            "ۥۛۢ\n" +
//            "ۖۢۨ\n" +
//            "ۥ۬ۥ\n" +
//            "۠ۚۖ\n" +
//            "ۡۖ۬\n" +
//            "ۘۜۨۘ\n" +
//            "ۛۦ۟\n" +
//            "ۢۜۨ\n" +
//            "۟ۛۜۘ\n" +
//            "ۘۡۨۘ\n" +
//            "ۛۚ۬\n" +
//            "ۡۗۥۘ\n" +
//            "ۘۡۦ\n" +
//            "ۧۢۜۘ\n" +
//            "ۛ۫\n" +
//            "ۥ۬ۨ\n" +
//            "ۤۖۖۘ\n" +
//            "ۧۛۢ\n" +
//            "ۦۗۛ\n" +
//            "ۡۙۥۘ\n" +
//            "ۚۥ۠\n" +
//            "ۚۜ۫\n" +
//            "۟۫ۙ\n" +
//            "۫ۢ۫\n" +
//            "ۜۨۨ\n" +
//            "ۥۙۡۘ\n" +
//            "۫ۖ۟\n" +
//            "ۤۢۜۘ\n" +
//            "۬ۤۨۘ\n" +
//            "ۡۙۖۘ\n" +
//            "ۧۛۥۘ\n" +
//            "ۨ۬ۜ\n" +
//            "ۨۦۚ\n" +
//            "ۙۢۢ\n" +
//            "ۧۡۘ\n" +
//            "ۨۙۜۘ\n" +
//            "ۚۙۦ\n" +
//            "ۢۥۖۘ\n" +
//            "ۨۦۧ\n" +
//            "ۡۤۧ\n" +
//            "ۢۦ۟\n" +
//            "۬ۧۧ\n" +
//            "ۘۙۦۘ\n" +
//            "ۖۢۖ\n" +
//            "ۜۦۤ\n" +
//            "ۗ۟ۨ\n" +
//            "۬ۘۡۘ\n" +
//            "ۥۜۥۘ\n" +
//            "ۦۚۜۘ\n" +
//            "ۥۧۤ\n" +
//            "۬ۘۨۘ\n" +
//            "ۛۢ۠\n" +
//            "۟ۙۢ\n" +
//            "۫ۛۜۘ\n" +
//            "ۧ۟ۜ\n" +
//            "ۧۚۦۘ\n" +
//            "۫ۤۘ\n" +
//            "۠ۙۖۘ\n" +
//            "ۜۧ۟\n" +
//            "ۛۧۢ\n" +
//            "ۙۜۧۘ\n" +
//            "ۥۤۜۘ\n" +
//            "۫ۛۘۘ\n" +
//            "ۚۥۥ\n" +
//            "ۚ۫ۤ\n" +
//            "ۢ۟ۚ\n" +
//            "ۦ۟ۤ\n" +
//            "ۗۙۤ\n" +
//            "ۡۦۜۘ\n" +
//            "۫ۘۙ\n" +
//            "۫۫ۗ\n" +
//            "ۦۖ۬\n" +
//            "ۘۦۘۘ\n" +
//            "۟۫ۘ\n" +
//            "ۡۧۥ\n" +
//            "ۚۜۨ\n" +
//            "ۦ۬ۡ\n" +
//            "ۛۢۢ\n" +
//            "۬ۘۘۘ\n" +
//            "ۡۧۜۘ\n" +
//            "ۗۗۡ\n" +
//            "ۗ۠ۤ\n" +
//            "ۗۖۜ\n" +
//            "۫ۖۥ\n" +
//            "ۤ۟ۖۘ\n" +
//            "ۚۧۧ\n" +
//            "ۤۜۧۘ\n" +
//            "ۜۤۨ\n" +
//            "ۙۚۡۘ\n" +
//            "ۘۖۡۘ\n" +
//            "ۧۡۥ\n" +
//            "ۥۨۧ\n" +
//            "ۚۧۖۘ\n" +
//            "ۦ۬ۦ\n" +
//            "ۨۨۗ\n" +
//            "۟۠ۛ\n" +
//            "ۥۦۢ\n" +
//            "ۦۢۛ\n" +
//            "ۙۦ۟\n" +
//            "ۢۚۗ\n" +
//            "ۜۨ۟\n" +
//            "۬۠ۧ\n" +
//            "ۥۙۦ\n" +
//            "ۦۨۘ\n" +
//            "۫۟ۦۘ\n" +
//            "۫ۚۨ\n" +
//            "ۖ۠ۚ\n" +
//            "ۗۦ۠\n" +
//            "۠۠ۧ\n" +
//            "ۘۖۖۘ\n" +
//            "ۛۧۡۘ\n" +
//            "ۥ۬۫\n" +
//            "ۤ۠ۙ\n" +
//            "۟ۦۚ\n" +
//            "ۖۖۦ\n" +
//            "ۗ۟ۦ\n" +
//            "ۧۗ۬\n" +
//            "ۚۗۦ\n" +
//            "۫ۡۜۘ\n" +
//            "۬ۙۤ\n" +
//            "ۜۙۛ\n" +
//            "۫ۧۧ\n" +
//            "ۦۖۛ\n" +
//            "۫ۘۧ\n" +
//            "ۥۚۘۘ\n" +
//            "ۖۛ۠\n" +
//            "۬ۦۘ\n" +
//            "ۦ۬۟\n" +
//            "ۖ۠ۡۘ\n" +
//            "ۛۚۢ\n" +
//            "ۖۘۘ\n" +
//            "ۥۗۜ\n" +
//            "ۖۚ۟\n" +
//            "ۙۢۡۘ\n" +
//            "ۥۦۛ\n" +
//            "ۗۡ۬\n" +
//            "ۡۨۧ\n" +
//            "ۜۢۥۘ\n" +
//            "۫ۖۦۘ\n" +
//            "ۦ۠ۜۘ\n" +
//            "ۜۡۦ\n" +
//            "۟۫ۦ\n" +
//            "ۛ۟ۡ\n" +
//            "۫ۡ۠\n" +
//            "۫ۗ۫\n" +
//            "۫۠ۚ\n" +
//            "۬ۡ۟\n" +
//            "ۛ۫ۥ\n" +
//            "ۢۘۖۘ\n" +
//            "۠ۚۜۘ\n" +
//            "ۤۤۘ\n" +
//            "ۡۗۦ\n" +
//            "ۛۗۜۘ\n" +
//            "ۙۥۖ\n" +
//            "ۧ۬ۨ\n" +
//            "ۖۜ۬\n" +
//            "ۜۘۧۘ\n" +
//            "ۜۛۦۘ\n" +
//            "ۖۚۖ\n" +
//            "ۧۧۖۘ\n" +
//            "۠ۢۜ\n" +
//            "۠ۚۚ\n" +
//            "ۥۘۚ\n" +
//            "ۡۜۗ\n" +
//            "۟۠ۥ\n" +
//            "۬ۧ۫\n" +
//            "۫۬ۦ\n" +
//            "ۨۙ۟\n" +
//            "ۡۖۧ\n" +
//            "۠ۚۗ\n" +
//            "ۧۢۤ\n" +
//            "۠ۖۨ\n" +
//            "ۨ۬ۦۘ\n" +
//            "ۜۦ۟\n" +
//            "ۢۗۗ\n" +
//            "ۡۥۜ\n" +
//            "۬ۚۖ\n" +
//            "۬ۚۜۘ\n" +
//            "ۦۦۤ\n" +
//            "۠ۜۙ\n" +
//            "ۖۗ۬\n" +
//            "۠ۗۦ\n" +
//            "ۤۤ۫\n" +
//            "ۧۗۗ\n" +
//            "ۥۘۜۘ\n" +
//            "ۦۡۥ\n" +
//            "ۢۗۧ\n" +
//            "ۥۘ\n" +
//            "ۡۜۡ\n" +
//            "ۦۥۡۘ\n" +
//            "ۙۚۥۘ\n" +
//            "۠۟ۡ\n" +
//            "ۜۢ۟\n" +
//            "ۘۖ\n" +
//            "ۥۥۦۘ\n" +
//            "ۢۦ۬\n" +
//            "۟ۡۘ\n" +
//            "ۢۨۧۘ\n" +
//            "ۥۗۢ\n" +
//            "ۦۨۧ\n" +
//            "ۢۛۨۘ\n" +
//            "۟ۨۢ\n" +
//            "ۡ۬ۦ\n" +
//            "ۧۡ۫\n" +
//            "ۜۗۡۘ\n" +
//            "ۨۥۖ\n" +
//            "۫ۗۤ\n" +
//            "۠ۜۨۘ\n" +
//            "ۚ۟ۖۘ\n" +
//            "۟ۛ۬\n" +
//            "ۚ۬ۥۘ\n" +
//            "۬ۛ۬\n" +
//            "۠ۥۘۘ\n" +
//            "ۥۘۖ\n" +
//            "ۜۘ۫\n" +
//            "۬۫ۥ\n" +
//            "ۦ۠۟\n" +
//            "ۙۡۢ\n" +
//            "ۙۖۦ\n" +
//            "ۚۡۨ\n" +
//            "۟ۧۖ\n" +
//            "۠ۖۙ\n" +
//            "ۗ۫۬\n" +
//            "ۘۜۙ\n" +
//            "۫ۛۡۘ\n" +
//            "ۧۛ۫\n" +
//            "۟ۖۥۘ\n" +
//            "ۜۤ۠\n" +
//            "ۥ۫۬\n" +
//            "ۨۤۚ\n" +
//            "۫۬ۗ\n" +
//            "ۙۦ\n" +
//            "ۛ۫ۢ\n" +
//            "۬ۗۘۘ\n" +
//            "ۢۥۤ\n" +
//            "ۨ۫ۨۘ\n" +
//            "ۖۙۧ\n" +
//            "ۥۢ۬\n" +
//            "۟۬ۛ\n" +
//            "ۨۥۗ\n" +
//            "۟ۧ۟\n" +
//            "۠ۘۦۘ\n" +
//            "ۦۦ۠\n" +
//            "۬ۗۦۘ\n" +
//            "ۡۡ۟\n" +
//            "۫ۤۘۘ\n" +
//            "۠ۚۜ\n" +
//            "ۘۙۥۘ\n" +
//            "ۗۚ۫\n" +
//            "۟ۨۡۘ\n" +
//            "ۥۥۖۘ\n" +
//            "ۘۡۥۘ\n" +
//            "۠ۜ۫\n" +
//            "ۡ۫ۡ\n" +
//            "ۢۨ\n" +
//            "ۛۛۛ\n" +
//            "۟ۡۘۘ\n" +
//            "ۗۤۥ\n" +
//            "۠ۗ\n" +
//            "ۤۖ۟\n" +
//            "۟ۢ۠\n" +
//            "ۦۦۥۘ\n" +
//            "ۤۘ۫\n" +
//            "ۖۛۥ\n" +
//            "ۨۡۧۘ\n" +
//            "ۛۥۨۘ\n" +
//            "ۨۙۡۘ\n" +
//            "ۥۛۧ\n" +
//            "ۘۚۙ\n" +
//            "۠ۥۦ\n" +
//            "۠\n" +
//            "ۢۡۥۘ\n" +
//            "۫ۙۙ\n" +
//            "۬ۘۡ\n" +
//            "ۦ۠ۚ\n" +
//            "ۗ۟ۡ\n" +
//            "ۙۗۨۘ\n" +
//            "ۖۧۜ\n" +
//            "ۥۨۙ\n" +
//            "ۤۤۛ\n" +
//            "ۨۧۨ\n" +
//            "ۛۛ۟\n" +
//            "ۢۨۙ\n" +
//            "ۦۢۢ\n" +
//            "ۤۘۢ\n" +
//            "۠ۛۥۘ\n" +
//            "۠۬ۥ\n" +
//            "ۢۤۛ\n" +
//            "ۤۥۥ\n" +
//            "۠۫ۥۘ\n" +
//            "۬۠ۙ\n" +
//            "۟۫ۡۘ\n" +
//            "ۖۤۙ\n" +
//            "ۛۡۥ\n" +
//            "ۦ۬ۘ\n" +
//            "ۤۜۥ\n" +
//            "ۨۙۘ\n" +
//            "ۚ۬ۜۘ\n" +
//            "ۦۥۛ\n" +
//            "ۨۗ۬\n" +
//            "ۚ۠ۥ\n" +
//            "ۥۡۗ\n" +
//            "ۡۡۜ\n" +
//            "۫ۤۡ\n" +
//            "ۗ۟ۡۘ\n" +
//            "ۨۖۖۘ\n" +
//            "ۤۤۧ\n" +
//            "ۖۦۧۘ\n" +
//            "ۥ۬ۥۘ\n" +
//            "ۧۚ۠\n" +
//            "ۜۡۖۘ\n" +
//            "ۤۛ۫\n" +
//            "ۦۘۧۘ\n" +
//            "ۢ۠ۛ\n" +
//            "ۗۢۥۘ\n" +
//            "ۤۘۥۘ\n" +
//            "ۦۢۘۘ\n" +
//            "ۙۧۨۘ\n" +
//            "ۜۜۨۘ\n" +
//            "ۧۘۦۘ\n" +
//            "ۖۖۙ\n" +
//            "ۜ۠ۦ\n" +
//            "ۘۥ۫\n" +
//            "ۥۥۨ\n" +
//            "ۚۖۖ\n" +
//            "۫۠۫\n" +
//            "ۨۦۢ\n" +
//            "۠۬ۢ\n" +
//            "ۛۦۢ\n" +
//            "ۙۛۥ\n" +
//            "ۡۚۥۘ\n" +
//            "۫ۚۡ\n" +
//            "۠ۦ۟\n" +
//            "ۘ۟ۖۘ\n" +
//            "ۥۥۧۘ\n" +
//            "۠ۢۡ\n" +
//            "ۧ۫۬\n" +
//            "ۙ۟ۚ\n" +
//            "ۢۚۨۘ\n" +
//            "۠۟ۡۘ\n" +
//            "۫ۥۢ\n" +
//            "۬ۧ۬\n" +
//            "ۚ۬ۖۘ\n" +
//            "ۛۖ۟\n" +
//            "ۘۤۦۘ\n" +
//            "ۛ۟ۜۘ\n" +
//            "ۗ۬۬\n" +
//            "ۜۘۧ\n" +
//            "ۧۘۥۘ\n" +
//            "۬ۢۤ\n" +
//            "ۜۚۘۘ\n" +
//            "۬ۛۗ\n" +
//            "ۡۖۧۘ\n" +
//            "ۜۦۥ\n" +
//            "۠ۗۤ\n" +
//            "ۦۚۘۘ\n" +
//            "۬ۦ۠\n" +
//            "۫ۨۧ\n" +
//            "۠ۘۜۘ\n" +
//            "۫ۚۢ\n" +
//            "ۖۨ\n" +
//            "۫ۦۙ\n" +
//            "۠ۙۥ\n" +
//            "ۙۤ۠\n" +
//            "ۜۛۨ\n" +
//            "ۡ۫ۖۘ\n" +
//            "ۡۘ۟\n" +
//            "۟۟ۨ\n" +
//            "ۘۚ۫\n" +
//            "ۡۙۗ\n" +
//            "ۨۙۨ\n" +
//            "ۤ۟ۤ\n" +
//            "ۜۤۜۘ\n" +
//            "ۖۢۘ\n" +
//            "ۙۗ۫\n" +
//            "ۜۖۖ\n" +
//            "۟ۘ۫\n" +
//            "ۚۖۦۘ\n" +
//            "ۢۖۨۘ\n" +
//            "۬ۘ۬\n" +
//            "ۦۤ\n" +
//            "ۚۛۧ\n" +
//            "ۚ۠ۢ\n" +
//            "۬ۧۜۘ\n" +
//            "ۥ۫۟\n" +
//            "ۙۨ۫\n" +
//            "ۗۢۜۘ\n" +
//            "۟۫ۜ\n" +
//            "ۡۡۦ\n" +
//            "ۦۨ\n" +
//            "۬۬ۥۘ\n" +
//            "ۨۡ۫\n" +
//            "ۙۨۛ\n" +
//            "۟۫ۢ\n" +
//            "ۖۙۨۘ\n" +
//            "ۛ۟ۘ\n" +
//            "ۙۥۘ\n" +
//            "ۨۗۡۘ\n" +
//            "ۗۘ۫\n" +
//            "ۢۙۦ\n" +
//            "ۧۚۦ\n" +
//            "۠ۛۛ\n" +
//            "ۧۙۖ\n" +
//            "ۖۢۦۘ\n" +
//            "ۖ۫۬\n" +
//            "ۚ۫ۗ\n" +
//            "ۦۗۥۘ\n" +
//            "ۡ۬ۡۘ\n" +
//            "۬ۧ۠\n" +
//            "ۜۡۤ\n" +
//            "ۡۗ\n" +
//            "ۙۗۜ\n" +
//            "ۤۚ۬\n" +
//            "ۘۥ۟\n" +
//            "ۜۦۦۘ\n" +
//            "ۗۘۧ\n" +
//            "۟ۨ۬\n" +
//            "ۨ۬ۖ\n" +
//            "ۨۛۦ\n" +
//            "ۙۦۨۘ\n" +
//            "ۥ۠ۗ\n" +
//            "ۘۦۘ\n" +
//            "ۙ۟ۗ\n" +
//            "ۡۧ۟\n" +
//            "ۦۗۜ\n" +
//            "ۦ۫ۡۘ\n" +
//            "ۘۛۡ\n" +
//            "ۦۡۧۘ\n" +
//            "۬۟ۡۘ\n" +
//            "ۘۚۤ\n" +
//            "ۤۙ۫\n" +
//            "ۦۥۨۘ\n" +
//            "۠ۡۘ\n" +
//            "ۦۛۨ\n" +
//            "ۥ۫۠\n" +
//            "۟ۨۥ\n" +
//            "ۖۨۧ\n" +
//            "ۗۢۨ\n" +
//            "ۖۦ۫\n" +
//            "ۥۢۚ\n" +
//            "ۜۧۖ\n" +
//            "۠ۡۗ\n" +
//            "ۥ۟ۙ\n" +
//            "ۗۜۦ\n" +
//            "۠ۥۥ\n" +
//            "ۜۦ\n" +
//            "۠۠ۜۘ\n" +
//            "ۡۘۡ\n" +
//            "ۖ۟ۤ\n" +
//            "۟ۥۚ\n" +
//            "ۡۛۥۘ\n" +
//            "ۙۦۚ\n" +
//            "ۥۦۘ\n" +
//            "۠ۗۨۘ\n" +
//            "ۥۨ\n" +
//            "ۖۡۡۘ\n" +
//            "ۖۙۖۘ\n" +
//            "ۙۨۡۘ\n" +
//            "ۨۦۦ\n" +
//            "ۡۜۜ\n" +
//            "ۙۚۨ\n" +
//            "ۗۙۧ\n" +
//            "ۨۧۘ\n" +
//            "ۢۢۥۘ\n" +
//            "ۦۢۜ\n" +
//            "ۚۚۡۘ\n" +
//            "ۥۙ۠\n" +
//            "ۖۖ۠\n" +
//            "ۙۗۤ\n" +
//            "۟ۘ۠\n" +
//            "ۥۥ\n" +
//            "ۨۨ\n" +
//            "ۦۧۦۘ\n" +
//            "ۥۡۤ\n" +
//            "ۖ۬ۛ\n" +
//            "۠۬ۧ\n" +
//            "ۖۦۖ\n" +
//            "ۥۜ۬\n" +
//            "ۧۤۧ\n" +
//            "ۥۙۗ\n" +
//            "ۢۖ۫\n" +
//            "ۙ۟۠\n" +
//            "ۘۨۨ\n" +
//            "۠ۘۢ\n" +
//            "۬ۙۖ\n" +
//            "ۖۜۧ\n" +
//            "۫ۢۥ\n" +
//            "ۢۘۦۘ\n" +
//            "ۢۤۚ\n" +
//            "ۙۡۜ\n" +
//            "ۙ۠ۦۘ\n" +
//            "ۚۡ\n" +
//            "ۢۙۖۘ\n" +
//            "ۥۥۨۘ\n" +
//            "ۖ۫ۘ\n" +
//            "۟ۚ۬\n" +
//            "ۚ۫ۖ\n" +
//            "۬ۖ۟\n" +
//            "ۚ۬ۜ\n" +
//            "۬۠ۢ\n" +
//            "ۨ۟۬\n" +
//            "۟۠ۜ\n" +
//            "۫۫ۥۘ\n" +
//            "ۨۡۥۘ\n" +
//            "ۙۘۦۘ\n" +
//            "۟ۜۖ\n" +
//            "۟ۡۤ\n" +
//            "ۤۤۘۘ\n" +
//            "ۜ۫\n" +
//            "ۗۡۢ\n" +
//            "۫۬۫\n" +
//            "ۦۤۧ\n" +
//            "ۙۤۜۘ\n" +
//            "ۤ۫ۨۘ\n" +
//            "ۘۛۚ\n" +
//            "۬ۧۤ\n" +
//            "ۚۤۦۘ\n" +
//            "ۜۨۨۘ\n" +
//            "ۥ۟ۥ\n" +
//            "۫۟۬\n" +
//            "۬ۘۖ\n" +
//            "ۧۧۚ\n" +
//            "ۖۘ۫\n" +
//            "ۛۘ۫\n" +
//            "ۖ۫ۢ\n" +
//            "ۨۢۖ\n" +
//            "ۙۘۚ\n" +
//            "ۢۗۥ\n" +
//            "ۜۘۨۘ\n" +
//            "ۖۤۧ\n" +
//            "ۧۜۚ\n" +
//            "۬۟ۛ\n" +
//            "ۧ۟۫\n" +
//            "ۨ۫۠\n" +
//            "ۥ۟۠\n" +
//            "۟ۚ۫\n" +
//            "ۨۖۧۘ\n" +
//            "ۛۤۗ\n" +
//            "۟۟ۖ\n" +
//            "۫ۨۛ\n" +
//            "ۖ۫ۤ\n" +
//            "ۚ۠ۖ\n" +
//            "ۘۘۥ\n" +
//            "ۦ۬۬\n" +
//            "ۢۘۢ\n" +
//            "ۤ\n" +
//            "۬۟ۨۘ\n" +
//            "ۦۡۦ\n" +
//            "ۚ۠ۦۘ\n" +
//            "ۚۙۤ\n" +
//            "ۡۦ\n" +
//            "۠ۢۖۘ\n" +
//            "ۦۡۖ\n" +
//            "ۙ۟۬\n" +
//            "ۧۖۢ\n" +
//            "ۥۥ۬\n" +
//            "ۧۘ۫\n" +
//            "ۖۚۜ\n" +
//            "ۨۛ۬\n" +
//            "ۜ۬ۖ\n" +
//            "ۦ۟۬\n" +
//            "ۨ۠ۖ\n" +
//            "ۨۜ۟\n" +
//            "ۧۡۘۘ\n" +
//            "۠۫ۛ\n" +
//            "ۚۘۛ\n" +
//            "۫ۜۖ\n" +
//            "ۖۢۜۘ\n" +
//            "ۦۨۦۘ\n" +
//            "ۤۤۚ\n" +
//            "ۧۡۛ\n" +
//            "ۛۨۧۘ\n" +
//            "ۖۧۢ\n" +
//            "۬ۗۢ\n" +
//            "۬ۙۨ\n" +
//            "ۦۥۙ\n" +
//            "ۦۡۨ\n" +
//            "۠۫ۡۘ\n" +
//            "ۚۗۨ\n" +
//            "۠ۦ۬\n" +
//            "ۘۗۚ\n" +
//            "ۙۛۙ\n" +
//            "۬ۖۚ\n" +
//            "۫ۨ۠\n" +
//            "ۨۚۚ\n" +
//            "ۤۦۢ\n" +
//            "ۡۜۦۘ\n" +
//            "ۦۧۖ\n" +
//            "۬ۢۘ\n" +
//            "ۡۨ۬\n" +
//            "۟۬\n" +
//            "ۤۧۙ\n" +
//            "ۧ۬ۥۘ\n" +
//            "ۥۢ۟\n" +
//            "ۜۙۡ\n" +
//            "ۢ۬ۨ\n" +
//            "ۧۢۙ\n" +
//            "۫ۗۨ\n" +
//            "ۜۤۡ\n" +
//            "ۖ۟۫\n" +
//            "ۧۦ۬\n" +
//            "ۜ۠۠\n" +
//            "ۡۦۡۘ\n" +
//            "ۚۖ۬\n" +
//            "ۧۙۜۘ\n" +
//            "ۤۜۛ\n" +
//            "۟ۜۘۘ\n" +
//            "ۤۗۡ\n" +
//            "ۛۗۨ\n" +
//            "ۨۥۦ\n" +
//            "ۤۗۨ\n" +
//            "ۛۜۢ\n" +
//            "ۥۥۥ\n" +
//            "ۥۨ۬\n" +
//            "۟ۘۢ\n" +
//            "ۜ۬ۘ\n" +
//            "ۥ۟ۜ\n" +
//            "ۦۦۨ\n" +
//            "ۨۢۥ\n" +
//            "ۘۙۥ\n" +
//            "ۥۤۘ\n" +
//            "ۧۦ۫\n" +
//            "ۗۘۥ\n" +
//            "ۙۚ\n" +
//            "ۚۚۦ\n" +
//            "ۥۧۘ\n" +
//            "ۢۤۧ\n" +
//            "ۨۗۢ\n" +
//            "ۚۗ۬\n" +
//            "ۙۘۧ\n" +
//            "۠ۖۖ\n" +
//            "ۙ۠ۢ\n" +
//            "ۜۜۘ\n" +
//            "ۨۛۖ\n" +
//            "ۧۡۧۘ\n" +
//            "ۦۧۘۘ\n" +
//            "ۡۡ۬\n" +
//            "ۙۚ۫\n" +
//            "ۡۧۛ\n" +
//            "ۗ۫۫\n" +
//            "ۡۖۚ\n" +
//            "۟ۜۧ\n" +
//            "۟ۗۢ\n" +
//            "۠ۤۢ\n" +
//            "ۦۘۜۘ\n" +
//            "ۚۦۤ\n" +
//            "ۥۚۘ\n" +
//            "ۦ۟ۦ\n" +
//            "۬ۡۗ\n" +
//            "ۗۙ۫\n" +
//            "ۖۢۥ\n" +
//            "ۚ۫ۜ\n" +
//            "ۥۦ۬\n" +
//            "ۚ۟ۖ\n" +
//            "۟ۗ۟\n" +
//            "ۛۘ\n" +
//            "۠ۧۥ\n" +
//            "ۗۙۜۘ\n" +
//            "ۧۛۘ\n" +
//            "ۗۧۡۘ\n" +
//            "ۜۖۘ\n" +
//            "ۥۡۢ\n" +
//            "ۚۜۨۘ\n" +
//            "۠ۥۗ\n" +
//            "۟ۥۜ\n" +
//            "۟ۨۦ\n" +
//            "۫۟ۢ\n" +
//            "ۡۤ۬\n" +
//            "ۡۢۘۘ\n" +
//            "ۥۜۡۘ\n" +
//            "ۖۗۖ\n" +
//            "ۗۘۖ\n" +
//            "ۨۙۥ\n" +
//            "ۚۡۦ\n" +
//            "ۢۨۦۘ\n" +
//            "ۙۨۥۘ\n" +
//            "ۚۨ۫\n" +
//            "ۢۦۥۘ\n" +
//            "ۨ۟ۘ\n" +
//            "ۛ۟ۖ\n" +
//            "ۧ۟ۗ\n" +
//            "ۙۙ۫\n" +
//            "۫۫ۨ\n" +
//            "ۜۥۘۘ\n" +
//            "ۦۘۦ\n" +
//            "ۢۚۢ\n" +
//            "ۖۥۧۘ\n" +
//            "ۦۙۧ\n" +
//            "۫۟\n" +
//            "ۙۛۜۘ\n" +
//            "۫ۚۖۘ\n" +
//            "ۙۨۨ\n" +
//            "ۜۤۚ\n" +
//            "ۜۧۚ\n" +
//            "۬ۡۦ\n" +
//            "ۘۤ۟\n" +
//            "ۗ۟ۜۘ\n" +
//            "ۡۧۢ\n" +
//            "ۦ۬\n" +
//            "۫ۨۨ\n" +
//            "ۗۦۘ\n" +
//            "۬ۨۡ\n" +
//            "ۜ۬۠\n" +
//            "۬ۗۨۘ\n" +
//            "ۘۗۨۘ\n" +
//            "ۡۢۥ\n" +
//            "۬ۗۛ\n" +
//            "ۗۚ۠\n" +
//            "ۤۘۦ\n" +
//            "۟ۢ۬\n" +
//            "ۖ۠ۤ\n" +
//            "ۢۦۧۘ\n" +
//            "ۧۗۦ\n" +
//            "ۛۦۗ\n" +
//            "ۥۖ۟\n" +
//            "۟ۚۘۘ\n" +
//            "ۖۥ۠\n" +
//            "ۜۡۜۘ\n" +
//            "۫ۦ\n" +
//            "ۛ۟ۤ\n" +
//            "ۛۨۨۘ\n" +
//            "ۨۦۜ\n" +
//            "ۤۡۜۘ\n" +
//            "ۦ۠ۘۘ\n" +
//            "ۖۘۨۘ\n" +
//            "۠۫ۗ\n" +
//            "ۧۖۜۘ\n" +
//            "ۤۗۥ\n" +
//            "ۗۧۗ\n" +
//            "۟ۚۧ\n" +
//            "ۥۖۨۘ\n" +
//            "ۘۚۧ\n" +
//            "ۤۡۧ\n" +
//            "۫۫۫\n" +
//            "ۘۢۢ\n" +
//            "ۡۥ۟\n" +
//            "ۙۢ۠\n" +
//            "۫۫ۙ\n" +
//            "ۥۦۨ\n" +
//            "ۗۗۥۘ\n" +
//            "ۡۢۧ\n" +
//            "ۙۚۗ\n" +
//            "ۜ۠ۨۘ\n" +
//            "ۛۜ۫\n" +
//            "۫۬ۦۘ\n" +
//            "ۤۗۘ\n" +
//            "۬ۛۙ\n" +
//            "۟۬ۘ\n" +
//            "ۨۘۚ\n" +
//            "ۤۗۡۘ\n" +
//            "ۧۥۧ\n" +
//            "ۧۘۗ\n" +
//            "ۡۦ۠\n" +
//            "ۘۡ۟\n" +
//            "ۦۥۜ\n" +
//            "۬ۥۖ\n" +
//            "۠ۗۘ\n" +
//            "ۚ۫ۖۘ\n" +
//            "۫۫ۛ\n" +
//            "ۛۧۛ\n" +
//            "ۢۗۢ\n" +
//            "ۧۤۦ\n" +
//            "۠ۜۜ\n" +
//            "ۙۡۛ\n" +
//            "۬ۚ۫\n" +
//            "ۧۨۘ\n" +
//            "ۦۜۡۘ\n" +
//            "۟۫۟\n" +
//            "ۡۦۗ\n" +
//            "ۖ۠ۢ\n" +
//            "ۛۛۦۘ\n" +
//            "ۨ۫ۥۘ\n" +
//            "ۦۥۖۘ\n" +
//            "ۡ۬ۧ\n" +
//            "ۗۖۜۘ\n" +
//            "ۘۖۥ\n" +
//            "ۗ۠۟\n" +
//            "۠ۛۢ\n" +
//            "۬ۥۡ\n" +
//            "ۛۨۧ\n" +
//            "ۡ۬ۙ\n" +
//            "ۧۥۡ\n" +
//            "ۧۤۨۘ\n" +
//            "ۨ۫ۖ\n" +
//            "ۜۙۥۘ\n" +
//            "ۡۡۤ\n" +
//            "۫ۙۨۘ\n" +
//            "ۧۢۡ\n" +
//            "ۗ۠ۛ\n" +
//            "ۛۥۛ\n" +
//            "۠ۛۜۘ\n" +
//            "ۘۦۗ\n" +
//            "ۥۖۗ\n" +
//            "ۚۙۨۘ\n" +
//            "ۗۚۖ\n" +
//            "۬۟ۢ\n" +
//            "ۘ۠ۥۘ\n" +
//            "۫ۡۥ\n" +
//            "ۙۙۨۘ\n" +
//            "۬ۧۖۘ\n" +
//            "ۗۥ۬\n" +
//            "ۡۨۜ\n" +
//            "۫ۥۧۘ\n" +
//            "ۚ۫ۘ\n" +
//            "ۦ۫۠\n" +
//            "ۚ۫ۙ\n" +
//            "ۗۜۚ\n" +
//            "ۥۘۥۘ\n" +
//            "۫ۧۢ\n" +
//            "ۦۤۖ\n" +
//            "ۢۨ۬\n" +
//            "۬ۧۥ\n" +
//            "۬ۦۨۘ\n" +
//            "ۚ۫ۧ\n" +
//            "ۖۤ\n" +
//            "ۚۡۚ\n" +
//            "۟ۘۥ\n" +
//            "ۚۛۡۘ\n" +
//            "ۙۙۖۘ\n" +
//            "ۢۚۛ\n" +
//            "۫ۦۛ\n" +
//            "ۥۘۛ\n" +
//            "ۗۢ\n" +
//            "ۧۗ۟\n" +
//            "ۡۛۦۘ\n" +
//            "ۧۦۤ\n" +
//            "۟ۚۡ\n" +
//            "ۤۦ۟\n" +
//            "ۙۖۨ\n" +
//            "ۤ۫۬\n" +
//            "ۖ۟۠\n" +
//            "ۨۡۙ\n" +
//            "ۗۚۥۘ\n" +
//            "ۦۗۡۘ\n" +
//            "ۜۖۜۘ\n" +
//            "ۜۛۜ\n" +
//            "ۧ۫ۖ\n" +
//            "ۦۜۤ\n" +
//            "ۛۥۡۘ\n" +
//            "۬ۖۖ\n" +
//            "ۥ۬ۤ\n" +
//            "ۙۙ۬\n" +
//            "ۘۚۖ\n" +
//            "ۗۗۙ\n" +
//            "ۜۥۨۘ\n" +
//            "ۥ۟ۚ\n" +
//            "ۥۡۦۘ\n" +
//            "ۡۛ۫\n" +
//            "ۡۡۖ\n" +
//            "ۢۖۜ\n" +
//            "ۨۥۢ\n" +
//            "ۡۥۨ\n" +
//            "ۛۦۡۘ\n" +
//            "ۤۖۘ\n" +
//            "ۦۛ\n" +
//            "۬ۨ۠\n" +
//            "۠ۥۖ\n" +
//            "۫۠ۘ\n" +
//            "ۦۢۧ\n" +
//            "ۡ۠ۥ\n" +
//            "ۦۗۘۘ\n" +
//            "ۤۥۜۘ\n" +
//            "۠۠ۖ\n" +
//            "ۗۜۥ\n" +
//            "۬۠ۗ\n" +
//            "۬ۘۦۘ\n" +
//            "۫ۢ۠\n" +
//            "ۜۨۗ\n" +
//            "ۛۦۛ\n" +
//            "۟ۤۨۘ\n" +
//            "ۧ۬ۦ\n" +
//            "ۨۥۨ\n" +
//            "ۚۢ۬\n" +
//            "ۜۛ۬\n" +
//            "۫ۘۖ\n" +
//            "۟ۨۙ\n" +
//            "ۧۘ۟\n" +
//            "ۨ۟ۡ\n" +
//            "ۛۤۦ\n" +
//            "ۛۤۧ\n" +
//            "ۨۙۧ\n" +
//            "ۚۙۘۘ\n" +
//            "ۨۙۦ\n" +
//            "ۘۛۨ\n" +
//            "ۖۖۤ\n" +
//            "ۖۧ۠\n" +
//            "ۧۨۦ\n" +
//            "ۚ۠ۡ\n" +
//            "۬ۜۥۘ\n" +
//            "ۢۢۧ\n" +
//            "۬ۛۨ\n" +
//            "ۤۢۚ\n" +
//            "ۤ۬\n" +
//            "ۛۙۖۘ\n" +
//            "ۛۖ۬\n" +
//            "ۜ۟ۨۘ\n" +
//            "ۨۨ۟\n" +
//            "ۗۙۗ\n" +
//            "ۤۨۚ\n" +
//            "۫ۛۧ\n" +
//            "۟ۘۤ\n" +
//            "ۗۡۤ\n" +
//            "۫۠ۘۘ\n" +
//            "ۥۛۦ\n" +
//            "۟۠ۘۘ\n" +
//            "ۗۛۜۘ\n" +
//            "ۘۤۖۘ\n" +
//            "ۖۧۘ\n" +
//            "ۢۧۙ\n" +
//            "ۨۙۛ\n" +
//            "ۘ۫۠\n" +
//            "۫ۥۚ\n" +
//            "ۢۡۧ\n" +
//            "ۜ۬ۘۘ\n" +
//            "ۢ۠۟\n" +
//            "ۧۜۧۘ\n" +
//            "ۘ۟ۘۘ\n" +
//            "ۡۤۙ\n" +
//            "ۧۨ۠\n" +
//            "ۖ۬ۜ\n" +
//            "ۜ۟ۡ\n" +
//            "۟۟ۜۘ\n" +
//            "ۚ۟ۗ\n" +
//            "ۖۘۖۘ\n" +
//            "ۗۚۦ\n" +
//            "ۛۦۨ\n" +
//            "ۖۛۖ\n" +
//            "ۛ۟ۚ\n" +
//            "ۘ۫ۨ\n" +
//            "۬۟۠\n" +
//            "ۛۚۦۘ\n" +
//            "۠ۚۙ\n" +
//            "ۖۘۗ\n" +
//            "۟ۖ۟\n" +
//            "ۡۚۥ\n" +
//            "۟ۨۜ\n" +
//            "ۜۨۚ\n" +
//            "ۦ۠۫\n" +
//            "ۙۦۙ\n" +
//            "۫۠۬\n" +
//            "ۜ۠ۙ\n" +
//            "۟ۜ۠\n" +
//            "۠ۤۧ\n" +
//            "ۨۖۡۘ\n" +
//            "ۖۢۢ\n" +
//            "ۘۢۦۘ\n" +
//            "ۛۜۜۘ\n" +
//            "ۗۙۖۘ\n" +
//            "۬ۙۘ\n" +
//            "ۧۜ۟\n" +
//            "۫ۧ\n" +
//            "ۙۙۤ\n" +
//            "ۡۚۘ\n" +
//            "ۧۤۙ\n" +
//            "ۥۙۜۘ\n" +
//            "ۡ۠ۥۘ\n" +
//            "ۨۥۥۘ\n" +
//            "ۧۧۛ\n" +
//            "ۡۥۡۘ\n" +
//            "ۖۘۛ\n" +
//            "۟ۨۖ\n" +
//            "ۗۢ۟\n" +
//            "ۜۖۚ\n" +
//            "ۜۗ۫\n" +
//            "ۘ۠۬\n" +
//            "ۗۧ۟\n" +
//            "ۜ۟ۖ\n" +
//            "۠ۜۦ\n" +
//            "ۛ۠ۙ\n" +
//            "۫ۤ\n" +
//            "۬ۡۖ\n" +
//            "ۗۤۡۘ\n" +
//            "ۧۡ\n" +
//            "۟۫ۡ\n" +
//            "ۛۖ۠\n" +
//            "ۜۘۡ\n" +
//            "ۨ۫ۗ\n" +
//            "ۖۡ۬\n" +
//            "ۘۗۜۘ\n" +
//            "ۢۖۘۘ\n" +
//            "ۤۧ\n" +
//            "ۚۡۘ\n" +
//            "۠ۖۥ\n" +
//            "ۜۤۖۘ\n" +
//            "ۤۚۖۘ\n" +
//            "ۢۘۦ\n" +
//            "ۨۤۡۘ\n" +
//            "ۜۚۥۘ\n" +
//            "ۨۨۙ\n" +
//            "ۗۘۨۘ\n" +
//            "ۦۙ۬\n" +
//            "ۛۗۚ\n" +
//            "۬ۜ\n" +
//            "ۛ۬ۙ\n" +
//            "۬۬ۧ\n" +
//            "ۚۢ۠\n" +
//            "ۤ۟ۦ\n" +
//            "ۚۧۙ\n" +
//            "۫ۙۖ\n" +
//            "ۤۨ\n" +
//            "ۡۢۦۘ\n" +
//            "ۤ۟ۢ\n" +
//            "ۧۖۘ\n" +
//            "ۥۤۥۘ\n" +
//            "ۚ۟ۘۘ\n" +
//            "ۤۢۙ\n" +
//            "ۨۚۜ\n" +
//            "ۙۢۜۘ\n" +
//            "۬ۖۗ\n" +
//            "ۤۥۧۘ\n" +
//            "ۥ۫ۜۘ\n" +
//            "ۤ۫ۥ\n" +
//            "ۡۛۘۘ\n" +
//            "۟۬ۙ\n" +
//            "ۦ۟۫\n" +
//            "ۤۧۥۘ\n" +
//            "ۦۖۗ\n" +
//            "۟ۘۙ\n" +
//            "ۘۛۖۘ\n" +
//            "۬ۤۡ\n" +
//            "ۗۧۤ\n" +
//            "ۧۜۖ\n" +
//            "۟ۚۤ\n" +
//            "ۨ۠۟\n" +
//            "ۡ۫ۘۘ\n" +
//            "ۧ۠۫\n" +
//            "ۡۗۡۘ\n" +
//            "۫ۤ۫\n" +
//            "۫۬ۙ\n" +
//            "ۧۚۜ\n" +
//            "ۤۜۜۘ\n" +
//            "ۨۧۥۘ\n" +
//            "ۤۡۖۘ\n" +
//            "ۢۡۖ\n" +
//            "ۧۤ۫\n" +
//            "ۛۖۖۘ\n" +
//            "۟ۜۛ\n" +
//            "۟ۖۡۘ\n" +
//            "ۧۙ۬\n" +
//            "ۤ۬ۜ\n" +
//            "ۙۢۤ\n" +
//            "ۡۖۛ\n" +
//            "ۨۗۦ\n" +
//            "ۜۜۛ\n" +
//            "ۤۛۘۘ\n" +
//            "۫ۖۤ\n" +
//            "ۖۤۛ\n" +
//            "ۢۘ\n" +
//            "ۧۢ۬\n" +
//            "۫ۥۦۘ\n" +
//            "ۗۤۘ\n" +
//            "ۛۙۧ\n" +
//            "ۗۘۤ\n" +
//            "ۨۖۦۘ\n" +
//            "۟ۘ\n" +
//            "۫۟ۙ\n" +
//            "۟ۚۚ\n" +
//            "ۙۙۘ\n" +
//            "ۥ۠ۧ\n" +
//            "ۦۘۧ\n" +
//            "ۨۚۛ\n" +
//            "ۧۘۛ\n" +
//            "ۛۨۛ\n" +
//            "۟۟ۡۘ\n" +
//            "۬۠ۚ\n" +
//            "ۘۤۛ\n" +
//            "ۗۜۢ\n" +
//            "ۥۜۜۘ\n" +
//            "ۨۖۖ\n" +
//            "ۙۧۡۘ\n" +
//            "ۨۧۚ\n" +
//            "ۜۚۜ\n" +
//            "ۧۥۜ\n" +
//            "ۡۜ\n" +
//            "۠ۧ۬\n" +
//            "ۖۥۜۘ\n" +
//            "ۜ۟۫\n" +
//            "ۥۛ۫\n" +
//            "۫ۡۧ\n" +
//            "ۖ۬۬\n" +
//            "۟ۦۡۘ\n" +
//            "۠ۡۥۘ\n" +
//            "ۘۢۤ\n" +
//            "۠ۥ۟\n" +
//            "۬ۛۡ\n" +
//            "ۘۧۨۘ\n" +
//            "ۡۚۗ\n" +
//            "ۛۡۚ\n" +
//            "ۧۘۤ\n" +
//            "ۛۡۜ\n" +
//            "ۨ۟ۦ\n" +
//            "ۤ۫ۛ\n" +
//            "۠ۤۡۘ\n" +
//            "۫ۡۦۘ\n" +
//            "ۚۢۦ\n" +
//            "۬ۨۨ\n" +
//            "ۘۗۡۘ\n" +
//            "ۖۡۙ\n" +
//            "۟ۥۘۘ\n" +
//            "ۤۘۘۘ\n" +
//            "ۖۗۦۘ\n" +
//            "۟ۜۦۘ\n" +
//            "ۦۖۜۘ\n" +
//            "ۦۚۚ\n" +
//            "ۡۥۚ\n" +
//            "ۡ۬ۨ\n" +
//            "۫ۛۤ\n" +
//            "ۧۖ\n" +
//            "ۥ۫ۥۘ\n" +
//            "ۨۛ۫\n" +
//            "ۨۘۢ\n" +
//            "ۧۧۙ\n" +
//            "ۜ۫ۦۘ\n" +
//            "ۤۨ۟\n" +
//            "۬ۦۧۘ\n" +
//            "ۨۡۡۘ\n" +
//            "ۜ۟ۜۘ\n" +
//            "۟ۤۥۘ\n" +
//            "ۙۦۜۘ\n" +
//            "ۘۥۗ\n" +
//            "ۧۚۡ\n" +
//            "ۚۨۙ\n" +
//            "۟ۗۜۘ\n" +
//            "ۨ۬ۧ\n" +
//            "۬ۚ۬\n" +
//            "ۥۘۥ\n" +
//            "ۙۤۨ\n" +
//            "ۚۛۘۘ\n" +
//            "ۘۥۦۘ\n" +
//            "ۖ۟ۘۘ\n" +
//            "۠ۗۜ\n" +
//            "ۙ۠ۘۘ\n" +
//            "۬ۤ۟\n" +
//            "ۚ۬ۘ\n" +
//            "ۖۨۦ\n" +
//            "ۛۥۢ\n" +
//            "ۥۡۘ\n" +
//            "ۧۜۦ\n" +
//            "ۡۙۖ\n" +
//            "ۗۦ\n" +
//            "۟ۡۛ\n" +
//            "ۚۢۗ\n" +
//            "۬ۤۗ\n" +
//            "ۙۤۘۘ\n" +
//            "ۖۢۗ\n" +
//            "ۚۚۚ\n" +
//            "ۢۙۙ\n" +
//            "ۘ۬ۡ\n" +
//            "ۧۡۤ\n" +
//            "ۘۦۜ\n" +
//            "ۖ۟۟\n" +
//            "ۡ۫ۙ\n" +
//            "ۚ۬ۡۘ\n" +
//            "ۨۘۖۘ\n" +
//            "۠۫ۨ\n" +
//            "ۢۗۖۘ\n" +
//            "ۙ۠ۜۘ\n" +
//            "ۤ۫ۖۘ\n" +
//            "ۖۙۢ\n" +
//            "ۦ۬ۖۘ\n" +
//            "ۧۙۘۘ\n" +
//            "ۖۡۨۘ\n" +
//            "۫۫۠\n" +
//            "ۤۖ\n" +
//            "ۤۥۖ\n" +
//            "ۤۤ\n" +
//            "ۨۢۘ\n" +
//            "ۤ۠ۨ\n" +
//            "۟ۧ\n" +
//            "ۧۧ۬\n" +
//            "ۡۚۚ\n" +
//            "ۨ۬۠\n" +
//            "ۧۢۚ\n" +
//            "۫۬ۜۘ\n" +
//            "۬ۡۨ\n" +
//            "ۜۛ۠\n" +
//            "ۨۤ۬\n" +
//            "ۜۥۢ\n" +
//            "ۢۜ۫\n" +
//            "ۖۛۦ\n" +
//            "۠ۛ۬\n" +
//            "ۜ۬۟\n" +
//            "ۛ۫ۡ\n" +
//            "ۨۦۖ\n" +
//            "ۤۚۘۘ\n" +
//            "ۡۙ۟\n" +
//            "۠ۦۘۘ\n" +
//            "ۤ۠ۚ\n" +
//            "ۦۙۢ\n" +
//            "ۡ۟ۡ\n" +
//            "ۦ۠ۜ\n" +
//            "ۥۢۗ\n" +
//            "ۥۗۛ\n" +
//            "ۘۦۦ\n" +
//            "ۨ۠ۡ\n" +
//            "ۙۗ۬\n" +
//            "ۚۥۡ\n" +
//            "ۤ۬ۚ\n" +
//            "۬ۨۙ\n" +
//            "۠ۜۧ\n" +
//            "ۜۙۡۘ\n" +
//            "۟ۧۘ\n" +
//            "ۜ۬ۥۘ\n" +
//            "ۗۤۙ\n" +
//            "ۦۨۥۘ\n" +
//            "ۚۡۥۘ\n" +
//            "ۢۨۘۘ\n" +
//            "ۛۜ۟\n" +
//            "۠ۦۜ\n" +
//            "ۢ۫ۤ\n" +
//            "ۖۢۜ\n" +
//            "ۖۖۘۘ\n" +
//            "ۧۤۛ\n" +
//            "ۢۛۦ\n" +
//            "ۧۙۢ\n" +
//            "۫ۘۚ\n" +
//            "ۖۙۚ\n" +
//            "ۤۖۚ\n" +
//            "ۚۘ۬\n" +
//            "ۙۥۧ\n" +
//            "ۧۘۡۘ\n" +
//            "ۨۨۘ\n" +
//            "ۜۛۖۘ\n" +
//            "۫۟ۛ\n" +
//            "ۥۖۛ\n" +
//            "ۜۥۘ\n" +
//            "۬ۙۦۘ\n" +
//            "ۢۧۘ\n" +
//            "ۗۙۨ\n" +
//            "ۜۤۛ\n" +
//            "ۨۗۚ\n" +
//            "ۤۖۥ\n" +
//            "ۧۖۘۘ\n" +
//            "۠ۡۤ\n" +
//            "۬ۛ\n" +
//            "ۜۦۙ\n" +
//            "ۥۡ۠\n" +
//            "ۚۜۘۘ\n" +
//            "ۗۡۨ\n" +
//            "ۥۢۧ\n" +
//            "ۤۚۘ\n" +
//            "ۤۤۦ\n" +
//            "ۖۤۡۘ\n" +
//            "ۢۚۦۘ\n" +
//            "۫ۨۡۘ\n" +
//            "ۥۙ\n" +
//            "ۥ۠ۡ\n" +
//            "ۘۡۡۘ\n" +
//            "ۙۜۡۘ\n" +
//            "ۘ۬\n" +
//            "ۥۜ۟\n" +
//            "۫ۗۜۘ\n" +
//            "ۢۨۚ\n" +
//            "ۖۧۦ\n" +
//            "۟ۛۜ\n" +
//            "ۖۖ۫\n" +
//            "ۦ\n" +
//            "ۤۘۡۘ\n" +
//            "ۛۡۧۘ\n" +
//            "ۢۥ\n" +
//            "ۘ۟ۚ\n" +
//            "ۥ۠ۨ\n" +
//            "ۨۨ۫\n" +
//            "ۗۖۘۘ\n" +
//            "ۙۛ۟\n" +
//            "ۖۚۡ\n" +
//            "ۜۚ۫\n" +
//            "ۤۚ۠\n" +
//            "ۙۜ۟\n" +
//            "ۢۥ۬\n" +
//            "ۧۢۜ\n" +
//            "ۦۡۘۘ\n" +
//            "ۧۦۧۘ\n" +
//            "ۢۡۧۘ\n" +
//            "ۡ۠ۛ\n" +
//            "ۤۢۘ\n" +
//            "ۛۨۖ\n" +
//            "ۢۛ۟\n" +
//            "ۖ۠ۥ\n" +
//            "ۜۜۡ\n" +
//            "ۦ۠ۘ\n" +
//            "ۤۧۧ\n" +
//            "ۦ۠۠\n" +
//            "ۘ۬۠\n" +
//            "ۗ۫ۛ\n" +
//            "ۧۨۢ\n" +
//            "ۡۢۖ\n" +
//            "ۥۥۙ\n" +
//            "۟ۢۘۘ\n" +
//            "ۧۚۙ\n" +
//            "ۛ۫ۖ\n" +
//            "ۡۙ۫\n" +
//            "ۤ۬ۥ\n" +
//            "ۗۢۘ\n" +
//            "ۦ۬ۨۘ\n" +
//            "ۡۖۡ\n" +
//            "ۙ۠ۥۘ\n" +
//            "ۙۘۗ\n" +
//            "۫ۜۘۘ\n" +
//            "۠ۜ۟\n" +
//            "ۚۢۘۘ\n" +
//            "ۨۖۙ\n" +
//            "ۥۤۗ\n" +
//            "ۤۦۘ\n" +
//            "۬۟ۚ\n" +
//            "۫ۚ\n" +
//            "ۡۛۜۘ\n" +
//            "ۧۙۧ\n" +
//            "ۛۜۖ\n" +
//            "ۚۨۘ\n" +
//            "۟ۧۤ\n" +
//            "۠ۡ۠\n" +
//            "ۥ۠ۜ\n" +
//            "۟ۚۖۘ\n" +
//            "ۧ۫ۢ\n" +
//            "ۜۗۨۘ\n" +
//            "ۙۥۛ\n" +
//            "ۥ۬ۘ\n" +
//            "ۤۗۘۘ\n" +
//            "ۥۡ۬\n" +
//            "ۦۙۛ\n" +
//            "ۧۜۜۘ\n" +
//            "ۤۤۦۘ\n" +
//            "ۦۦۖ\n" +
//            "ۨ۫ۧ\n" +
//            "ۘۛۢ\n" +
//            "ۜۛۢ\n" +
//            "ۚۙۜۘ\n" +
//            "ۡۢۡۘ\n" +
//            "ۜۛۡ\n" +
//            "ۜۚ۬\n" +
//            "ۚ۫ۛ\n" +
//            "ۤۨۛ\n" +
//            "ۢۚۨ\n" +
//            "ۗۖۙ\n" +
//            "ۚۛۥ\n" +
//            "ۨۛۛ\n" +
//            "ۥۖۢ\n" +
//            "ۚۨۥ\n" +
//            "۬ۗۥ\n" +
//            "ۢ۟ۤ\n" +
//            "ۥۧۜۘ\n" +
//            "۠ۨ۟\n" +
//            "ۜ۫ۥۘ\n" +
//            "ۘۨۘ\n" +
//            "۫ۗۘ\n" +
//            "ۖۛۖۘ\n" +
//            "۟ۗۨ\n" +
//            "ۢۙ۟\n" +
//            "۫ۘۦۘ\n" +
//            "۬ۧۗ\n" +
//            "ۗۢ۬\n" +
//            "۠ۧ\n" +
//            "ۨۜۙ\n" +
//            "۟ۡۨۘ\n" +
//            "ۡ۟۬\n" +
//            "ۨۙ۫\n" +
//            "ۥ۟ۨ\n" +
//            "ۨۘ۠\n" +
//            "ۜۢۘ\n" +
//            "ۗۗۨ\n" +
//            "۫ۡۨ\n" +
//            "ۦ۠ۖۘ\n" +
//            "ۜۧۜ\n" +
//            "ۥ۫ۥ\n" +
//            "ۛۢۛ\n" +
//            "ۖۛۛ\n" +
//            "ۦۧۥۘ\n" +
//            "ۨ۠ۜۘ\n" +
//            "ۢۚۘۘ\n" +
//            "۬ۛۦۘ\n" +
//            "۬ۗ\n" +
//            "۬۟ۙ\n" +
//            "ۙ۟ۥۘ\n" +
//            "ۖۡۥۘ\n" +
//            "ۢۙۛ\n" +
//            "ۛۨۘۘ\n" +
//            "ۖۗۡۘ\n" +
//            "ۤۤۡۘ\n" +
//            "ۜ۬ۢ\n" +
//            "ۨۙۦۘ\n" +
//            "ۥۤۙ\n" +
//            "۬ۜ۠\n" +
//            "۠ۙۖ\n" +
//            "ۙۨ۟\n" +
//            "ۘۗۖۘ\n" +
//            "ۛ۠ۘۘ\n" +
//            "ۛ۬ۜۘ\n" +
//            "ۘۖۛ\n" +
//            "ۜۚۢ\n" +
//            "ۛۤۡ\n" +
//            "۟ۥۖ\n" +
//            "ۜ۟ۘ\n" +
//            "ۖۜۡ\n" +
//            "ۖۦۖۘ\n" +
//            "۬ۗۚ\n" +
//            "۟ۘۜ\n" +
//            "ۨ۬ۜۘ\n" +
//            "ۢۚۦ\n" +
//            "۠۫ۢ\n" +
//            "۫ۛ۠\n" +
//            "۫ۚۚ\n" +
//            "ۡۜ۟\n" +
//            "ۙ۠ۡۘ\n" +
//            "۫۬۟\n" +
//            "ۦ۬ۚ\n" +
//            "۫ۖۗ\n" +
//            "۟۠ۧ\n" +
//            "ۘۘۛ\n" +
//            "ۡۧۜ\n" +
//            "ۧۦۨۘ\n" +
//            "ۧ۠\n" +
//            "ۖۤ۟\n" +
//            "ۖۧۡ\n" +
//            "۟ۘ۟\n" +
//            "ۨۗۨ\n" +
//            "ۥۧ۫\n" +
//            "ۡ۫ۨ\n" +
//            "ۤۜۚ\n" +
//            "ۜۜ۫\n" +
//            "ۥۦ۟\n" +
//            "ۤۨ۬\n" +
//            "ۧۤۜۘ\n" +
//            "ۦۨۜۘ\n" +
//            "ۢ۫ۜۘ\n" +
//            "ۗۨۚ\n" +
//            "ۛ۬ۨۘ\n" +
//            "ۗۡۧ\n" +
//            "ۤۙۢ\n" +
//            "ۤۨۧ\n" +
//            "ۥۢۙ\n" +
//            "۟ۗۡ\n" +
//            "۫ۦۖ\n" +
//            "ۤۛۚ\n" +
//            "ۥۛۤ\n" +
//            "ۖۚۜۘ\n" +
//            "ۡۦۥ\n" +
//            "ۡۡۚ\n" +
//            "ۙ۟ۦ\n" +
//            "ۘۦۖ\n" +
//            "ۥۥۜ\n" +
//            "ۘۜۖۘ\n" +
//            "ۜۤۦۘ\n" +
//            "ۥۨ۟\n" +
//            "ۤ۟ۡ\n" +
//            "ۘ۠ۨۘ\n" +
//            "۫ۘۘۘ\n" +
//            "ۘۘ\n" +
//            "ۤۘۜ\n" +
//            "۠۬۬\n" +
//            "۬ۥۥۘ\n" +
//            "۬ۛۛ\n" +
//            "ۗۚۧ\n" +
//            "ۨۦ۬\n" +
//            "ۧۘۜۘ\n" +
//            "ۤۖ۫\n" +
//            "ۗۤ۫\n" +
//            "ۛۤۚ\n" +
//            "ۖ۠ۡ\n" +
//            "ۜۜۧۘ\n" +
//            "ۤۗۤ\n" +
//            "ۤۛ۠\n" +
//            "ۢۤ۫\n" +
//            "ۖۥۖ\n" +
//            "۬ۡۜۘ\n" +
//            "۫ۦ۬\n" +
//            "ۡ۟ۧ\n" +
//            "ۘ۟۬\n" +
//            "۟۬ۧ\n" +
//            "ۜۗۦۘ\n" +
//            "ۚۗۡۘ\n" +
//            "ۧۨۨ\n" +
//            "ۙۙۧ\n" +
//            "ۧ۠۟\n" +
//            "ۛۖۧۘ\n" +
//            "ۖۖۥ\n" +
//            "۟۟ۤ\n" +
//            "ۨ۟ۗ\n" +
//            "ۧۖۡۘ\n" +
//            "ۚۘۦۘ\n" +
//            "ۙۥۜۘ\n" +
//            "ۙۧ\n" +
//            "ۨۦۜۘ\n" +
//            "۠ۨۗ\n" +
//            "ۗۢۧ\n" +
//            "۬ۥۡۘ\n" +
//            "ۙۖۥۘ\n" +
//            "ۙۜۡ\n" +
//            "ۤۙۘۘ\n" +
//            "۟ۚۥۘ\n" +
//            "ۧۥۥۘ\n" +
//            "۬ۛۤ\n" +
//            "ۧۡۥۘ\n" +
//            "ۘۥۨ\n" +
//            "ۖۦۙ\n" +
//            "ۦۧۡۘ\n" +
//            "ۘ۫ۡۘ\n" +
//            "ۚۢۛ\n" +
//            "ۛۤۜۘ\n" +
//            "ۨۗۖۘ\n" +
//            "ۘۗۛ\n" +
//            "ۘ۬ۛ\n" +
//            "ۜۦ۬\n" +
//            "۟ۖ\n" +
//            "۠ۛۖ\n" +
//            "ۙۡۖۘ\n" +
//            "ۤۧۦ\n" +
//            "ۚۥۗ\n" +
//            "۬۠ۜ\n" +
//            "ۡ۠ۘ\n" +
//            "ۙۖۡۘ\n" +
//            "ۖۛۨ\n" +
//            "ۨۜۡ\n" +
//            "ۥۙۥۘ\n" +
//            "ۘ۟ۛ\n" +
//            "ۨۤۦ\n" +
//            "ۖ۠ۜ\n" +
//            "ۙ۠ۥ\n" +
//            "۟ۗۦ\n" +
//            "ۧۤ۟\n" +
//            "۫ۜۜۘ\n" +
//            "ۡ۫ۗ\n" +
//            "۬ۗۙ\n" +
//            "ۜۧۘۘ\n" +
//            "ۨ۟ۘۘ\n" +
//            "۬ۛ۠\n" +
//            "ۨۖۧ\n" +
//            "۟ۧۗ\n" +
//            "ۗۧۢ\n" +
//            "۟۬ۚ\n" +
//            "ۥۗۤ\n" +
//            "ۨۡۘ\n" +
//            "ۨۦ\n" +
//            "ۗ۬ۤ\n" +
//            "ۥۘۙ\n" +
//            "ۥۚۜۘ\n" +
//            "ۦۢۦۘ\n" +
//            "ۗۘ۟\n" +
//            "ۜ۟ۜ\n" +
//            "ۡۡۛ\n" +
//            "ۤۗۧ\n" +
//            "ۛ۠ۚ\n" +
//            "ۙۨ\n" +
//            "ۤۤۤ\n" +
//            "ۤۙ۬\n" +
//            "ۧ۟ۢ\n" +
//            "ۖۦۦۘ\n" +
//            "ۥۧۘۘ\n" +
//            "ۚۗۢ\n" +
//            "ۡۥ\n" +
//            "ۛۖۡۘ\n" +
//            "ۤۢۖۘ\n" +
//            "ۢۢ\n" +
//            "ۡ۠۬\n" +
//            "ۘۧ۠\n" +
//            "۟ۧۚ\n" +
//            "ۡۗ۬\n" +
//            "ۨۧۖۘ\n" +
//            "ۡۚۜ\n" +
//            "۟۬ۘۘ\n" +
//            "ۢ۟ۡۘ\n" +
//            "۟ۘ۬\n" +
//            "ۖۜۘۘ\n" +
//            "ۡۛۖ\n" +
//            "ۥۧۦۘ\n" +
//            "ۢۖۥۘ\n" +
//            "ۨ۫ۦۘ\n" +
//            "ۡۤۖۘ\n" +
//            "ۦۦۜ\n" +
//            "ۘۨۖ\n" +
//            "ۦ۫۟\n" +
//            "ۛۚۜۘ\n" +
//            "ۦ۬۠\n" +
//            "ۗۨۧۘ\n" +
//            "ۛۢۜۘ\n" +
//            "ۙۢۜ\n" +
//            "ۜ۟ۧ\n" +
//            "ۙ۟ۧ\n" +
//            "ۘۧۗ\n" +
//            "ۖۥۧ\n" +
//            "ۙۚۦ\n" +
//            "ۘۤۥۘ\n" +
//            "ۤ۠ۘۘ\n" +
//            "ۙ۫۟\n" +
//            "ۜۚۡ\n" +
//            "ۦۜ۠\n" +
//            "ۧۙۜ\n" +
//            "ۥۙۦۘ\n" +
//            "ۗۛۥۘ\n" +
//            "ۚۢۨۘ\n" +
//            "۟۫ۧ\n" +
//            "۫ۧۨ\n" +
//            "ۥۛۜۘ\n" +
//            "ۢۚ\n" +
//            "ۧ۠ۡۘ\n" +
//            "ۧۜۛ\n" +
//            "ۡۢۖۘ\n" +
//            "۬ۖۡ\n" +
//            "ۗۧۦۘ\n" +
//            "ۚ۠ۚ\n" +
//            "۬ۖ۫\n" +
//            "ۜۤۨۘ\n" +
//            "ۛ۟ۘۘ\n" +
//            "۠ۗۖۘ\n" +
//            "ۨۘۙ\n" +
//            "ۨ۬ۛ\n" +
//            "ۧۖۗ\n" +
//            "ۖۨۖۘ\n" +
//            "ۢۜۗ\n" +
//            "ۡۘۡۘ\n" +
//            "ۥۡۜۘ\n" +
//            "ۥ۫ۧ\n" +
//            "ۢۤۜ\n" +
//            "۬ۥۨ\n" +
//            "ۡۖۤ\n" +
//            "ۘ۟ۧ\n" +
//            "ۨۥ۟\n" +
//            "ۘۙۚ\n" +
//            "ۥۨۦۘ\n" +
//            "ۤۛۤ\n" +
//            "ۘ۬ۢ\n" +
//            "ۤۜ۟\n" +
//            "۫ۗۦۘ\n" +
//            "ۙۦۖ\n" +
//            "ۤ۫ۜۘ\n" +
//            "ۚۗۘ\n" +
//            "ۨۚۨ\n" +
//            "ۥ۟ۦۘ\n" +
//            "۫۬ۡۘ\n" +
//            "ۜۦۚ\n" +
//            "ۖۖۧۘ\n" +
//            "ۛۗۢ\n" +
//            "ۛۚۖ\n" +
//            "ۚ۠ۦ\n" +
//            "۟ۤۡ\n" +
//            "ۜۘ\n" +
//            "ۤۢۥۘ\n" +
//            "۫ۗ۟\n" +
//            "ۖ۟ۨۘ\n" +
//            "ۦۨۧۘ\n" +
//            "۠ۢۛ\n" +
//            "۟ۡۚ\n" +
//            "ۢۜۘۘ\n" +
//            "ۗۜۥۘ\n" +
//            "ۛۢۥ\n" +
//            "ۧۤۘ\n" +
//            "۬ۨۜۘ\n" +
//            "ۦ۫ۛ\n" +
//            "ۙۛۨ\n" +
//            "ۜۨۡ\n" +
//            "ۘ۬ۘ\n" +
//            "ۜۙۨ\n" +
//            "۫ۜۘ\n" +
//            "ۗۡۜۘ\n" +
//            "۬ۧۨۘ\n" +
//            "ۖۨۨۘ\n" +
//            "ۥۡ۟\n" +
//            "ۜۗۙ\n" +
//            "ۧ۫ۘ\n" +
//            "ۜۡۖ\n" +
//            "ۡۘۜۘ\n" +
//            "ۖ۫ۙ\n" +
//            "۬ۧۘۘ\n" +
//            "۫ۗۖۘ\n" +
//            "۟ۡۜ\n" +
//            "ۚۦۥۘ\n" +
//            "ۢۚ۠\n" +
//            "ۧ۠ۜۘ\n" +
//            "ۘۤۡ\n" +
//            "ۨۘۥ\n" +
//            "۟۫ۥۘ\n" +
//            "ۖۤ۠\n" +
//            "ۤۦۖۘ\n" +
//            "۠۠۠\n" +
//            "ۜۗۜ\n" +
//            "ۡۖۡۘ\n" +
//            "۬۫ۧ\n" +
//            "ۡۖۦ\n" +
//            "ۗۜ\n" +
//            "ۧۦۗ\n" +
//            "ۨۗۧ\n" +
//            "ۚۤۜ\n" +
//            "ۤۛۦۘ\n" +
//            "ۧۘۥ\n" +
//            "ۖۦ۟\n" +
//            "ۚۙۨ\n" +
//            "ۘۤۚ\n" +
//            "ۛۡ۠\n" +
//            "ۢۥۥ\n" +
//            "ۤۦۖ\n" +
//            "۬۟ۦ\n" +
//            "ۚۚ۠\n" +
//            "۟ۙۛ\n" +
//            "ۚ۬\n" +
//            "ۜۦ۫\n" +
//            "۠۬۫\n" +
//            "ۗ۟۫\n" +
//            "ۤۚۥ\n" +
//            "ۦۨۗ\n" +
//            "ۚ۫۠\n" +
//            "ۛۨ۟\n" +
//            "ۢۛۡۘ\n" +
//            "ۗۤ۬\n" +
//            "ۡۛ۬\n" +
//            "۬۠ۨ\n" +
//            "ۘۜۜ\n" +
//            "ۨۧۦ\n" +
//            "ۨۥۤ\n" +
//            "ۧۧۦ\n" +
//            "ۚۧ۠\n" +
//            "ۧۚ۬\n" +
//            "ۗۘۡۘ\n" +
//            "۫ۗۘۘ\n" +
//            "ۡۛۡۘ\n" +
//            "ۢ۫ۥۘ\n" +
//            "ۜۚۥ\n" +
//            "ۘ۫۫\n" +
//            "ۗ۬ۜۘ\n" +
//            "ۛۜۧۘ\n" +
//            "ۨ۫۫\n" +
//            "ۧۛۚ\n" +
//            "ۙ۬ۨۘ\n" +
//            "ۜۖۥ\n" +
//            "۫ۢۜ\n" +
//            "۬ۘۧۘ\n" +
//            "ۤۖۥۘ\n" +
//            "۠ۥۡ\n" +
//            "ۢۥۚ\n" +
//            "ۤۖۜۘ\n" +
//            "۫ۚۗ\n" +
//            "ۖۢۥۘ\n" +
//            "ۚۨۛ\n" +
//            "۟۬۟\n" +
//            "ۦۥۚ\n" +
//            "ۙۡۗ\n" +
//            "ۦۤۚ\n" +
//            "ۤۨۦ\n" +
//            "ۥۢۡ\n" +
//            "۫۠۠\n" +
//            "ۢ۠ۚ\n" +
//            "ۗۙۖ\n" +
//            "۠ۢ\n" +
//            "ۢ۟ۛ\n" +
//            "ۘۚۜۘ\n" +
//            "ۛۜۧ\n" +
//            "ۥۢۨۘ\n" +
//            "ۘۜۨ\n" +
//            "ۥۚۜ\n" +
//            "۠ۚۡ\n" +
//            "ۚۢۖ\n" +
//            "ۜۛ۫\n" +
//            "ۙۘۘ\n" +
//            "ۚۛۖ\n" +
//            "۟ۘۧۘ\n" +
//            "ۧ۬ۧ\n" +
//            "ۧۡۖۘ\n" +
//            "ۤ۠ۦ\n" +
//            "ۢۗ۫\n" +
//            "۫ۜۤ\n" +
//            "۠ۨۥ\n" +
//            "ۡ۠ۜ\n" +
//            "ۤۘۜۘ\n" +
//            "ۥ۠۬\n" +
//            "ۛۚۙ\n" +
//            "ۤۜۗ\n" +
//            "ۦۦۧۘ\n" +
//            "ۗۛۨۘ\n" +
//            "ۛۗۙ\n" +
//            "ۦۗۚ\n" +
//            "ۘۚۦۘ\n" +
//            "ۦۦ۬\n" +
//            "ۦۦ۫\n" +
//            "ۗۦۧ\n" +
//            "ۢ۟۫\n" +
//            "۫ۖ۫\n" +
//            "ۙ۬ۥۘ\n" +
//            "ۚۨۨ\n" +
//            "ۤ۬ۖ\n" +
//            "ۙۧۨ\n" +
//            "ۙ۫ۧ\n" +
//            "ۢۡۨ\n" +
//            "ۜ۟ۙ\n" +
//            "۬ۤ۠\n" +
//            "ۜۨۦ\n" +
//            "ۡ۠ۖۘ\n" +
//            "۬۫۫\n" +
//            "ۢۙ۠\n" +
//            "ۙ۟ۘۘ\n" +
//            "ۚ۫۬\n" +
//            "ۖۜۖ\n" +
//            "ۢۖۡۘ\n" +
//            "ۦۖۙ\n" +
//            "ۛۦۘ\n" +
//            "ۤۨۘۘ\n" +
//            "۟ۦ۟\n" +
//            "ۤۜۜ\n" +
//            "ۨۗۜ\n" +
//            "ۧ۠ۖ\n" +
//            "ۢۗۜۘ\n" +
//            "۫ۤۜ\n" +
//            "۬۬ۡۘ\n" +
//            "۠ۗۚ\n" +
//            "ۡ۫ۧ\n" +
//            "۬ۖۨ\n" +
//            "۠ۘۥۘ\n" +
//            "۟۫ۘۘ\n" +
//            "ۗ۟ۜ\n" +
//            "ۧۛۗ\n" +
//            "ۢۚۡۘ\n" +
//            "۬۬ۦ\n" +
//            "ۧ۟ۡۘ\n" +
//            "ۗۦۦۘ\n" +
//            "ۙۙۥۘ\n" +
//            "ۙۙۖ\n" +
//            "ۢ۟ۧ\n" +
//            "ۢۘۜۘ\n" +
//            "ۧ۬ۡ\n" +
//            "ۜۘ۬\n" +
//            "ۖۘۜ\n" +
//            "۠۫ۡ\n" +
//            "۬ۗۤ\n" +
//            "۠ۘۘۘ\n" +
//            "ۥۜۡ\n" +
//            "ۧۤۢ\n" +
//            "ۨۨۚ\n" +
//            "۫ۥۖ\n" +
//            "ۗۙ\n" +
//            "ۚ۫ۡۘ\n" +
//            "۫ۖۘ\n" +
//            "ۨۡۤ\n" +
//            "ۢ۟ۜۘ\n" +
//            "ۧۨۤ\n" +
//            "ۜۖ۬\n" +
//            "ۙۨۗ\n" +
//            "ۥۘۨۘ\n" +
//            "۬۟ۘۘ\n" +
//            "ۘۗۖ\n" +
//            "ۢ۠۫\n" +
//            "ۖۛۘۘ\n" +
//            "۫ۙۥۘ\n" +
//            "ۛ۬۫\n" +
//            "ۛۨۢ\n" +
//            "ۜۦۡ\n" +
//            "۠ۡۙ\n" +
//            "ۧۤۥ\n" +
//            "ۧۖۤ\n" +
//            "ۚۢۜ\n" +
//            "ۙۡ۟\n" +
//            "ۛۢۦۘ\n" +
//            "۟ۤ۬\n" +
//            "ۦ۫ۖۘ\n" +
//            "۠۫ۦ\n" +
//            "ۖ۟ۡ\n" +
//            "ۖ۠\n" +
//            "ۨۢ\n" +
//            "ۡۙۘ\n" +
//            "۠ۥۘ\n" +
//            "ۦۛ۫\n" +
//            "ۘ۫ۙ\n" +
//            "ۖۜۧۘ\n" +
//            "ۚ۬۠\n" +
//            "ۨۧۘۘ\n" +
//            "ۚۦۧۘ\n" +
//            "ۡ۫\n" +
//            "ۦ۫ۜ\n" +
//            "ۖ۟ۧ\n" +
//            "ۢۡۖۘ\n" +
//            "ۥ۬\n" +
//            "ۨ۠ۖۘ\n" +
//            "ۨ۟۟\n" +
//            "ۙۢۖ\n" +
//            "ۖۢۤ\n" +
//            "ۜۢۨ\n" +
//            "ۢۦۦ\n" +
//            "۫ۤۥ\n" +
//            "ۛۤۥ\n" +
//            "ۧۜۦۘ\n" +
//            "ۧۗ۠\n" +
//            "۟ۖۧۘ\n" +
//            "ۧۨۥۘ\n" +
//            "ۘ۟ۥ\n" +
//            "ۢۢۙ\n" +
//            "ۜۧۢ\n" +
//            "ۨۖ۟\n" +
//            "ۧۙۦۘ\n" +
//            "۠ۚۥ\n" +
//            "ۤۖۦۘ\n" +
//            "۫ۧۘۘ\n" +
//            "۬ۚۡۘ\n" +
//            "ۦۚۖ\n" +
//            "ۗۨۧ\n" +
//            "۬۠۟\n" +
//            "ۨۗۜۘ\n" +
//            "ۗۤۘۘ\n" +
//            "۟ۨ۫\n" +
//            "ۥ۠ۘۘ\n" +
//            "ۙۗۖ\n" +
//            "ۦ۠ۧ\n" +
//            "۬ۜۜ\n" +
//            "ۧۛۖۘ\n" +
//            "۟ۜ۟\n" +
//            "ۥۤۦۘ\n" +
//            "ۘۥۤ\n" +
//            "۫ۙۡۘ\n" +
//            "۟ۜۧۘ\n" +
//            "ۧ۫ۨۘ\n" +
//            "ۢۘ۠\n" +
//            "ۖۨ۠\n" +
//            "۫۟ۘۘ\n" +
//            "ۜۛۖ\n" +
//            "۠ۖۤ\n" +
//            "۠۫\n" +
//            "ۖۖۡ\n" +
//            "ۙۧۤ\n" +
//            "ۥۛ۠\n" +
//            "ۢۛۦۘ\n" +
//            "۠ۘ۠\n" +
//            "ۗۛ۠\n" +
//            "ۦۡ۠\n" +
//            "ۗۛۡۘ\n" +
//            "۬ۧۢ\n" +
//            "ۧۧۧ\n" +
//            "ۨۨۧۘ\n" +
//            "ۙۜ۬\n" +
//            "ۘۨۧ\n" +
//            "۠ۙ۟\n" +
//            "۠ۤ۠\n" +
//            "ۘۤۙ\n" +
//            "ۖۨۜ\n" +
//            "ۛ۟۬\n" +
//            "۟۠ۥۘ\n" +
//            "۠ۘۤ\n" +
//            "ۗۢۖ\n" +
//            "ۤۘۗ\n" +
//            "ۗۚ\n" +
//            "ۖۡۤ\n" +
//            "ۥۡۖ\n" +
//            "ۜۜ۬\n" +
//            "ۗۛ۬\n" +
//            "ۜۛۙ\n" +
//            "ۥۛۨۘ\n" +
//            "ۦۜ۫\n" +
//            "ۤ۠ۡ\n" +
//            "ۨۖۗ\n" +
//            "۫ۜۧ\n" +
//            "ۘۦ۠\n" +
//            "ۗۧۘ\n" +
//            "۫ۥۡ\n" +
//            "ۘ۬۟\n" +
//            "ۛۤۦۘ\n" +
//            "۟ۗۤ\n" +
//            "ۤ۫ۧ\n" +
//            "ۡۗۜ\n" +
//            "ۧۥۘ\n" +
//            "ۚۤۙ\n" +
//            "ۚۚۙ\n" +
//            "۬۬۬\n" +
//            "ۘۡۖۘ\n" +
//            "۬ۜۡ\n" +
//            "ۨۗۛ\n" +
//            "۫ۖۨۘ\n" +
//            "۫ۖۨ\n" +
//            "ۥۤ۟\n" +
//            "ۛۖۡ\n" +
//            "ۜۖۥۘ\n" +
//            "۫ۥۜۘ\n" +
//            "ۗۚۦۘ\n" +
//            "ۗۡۛ\n" +
//            "ۚۛۥۘ\n" +
//            "ۥۖۡۘ\n" +
//            "ۨۙۤ\n" +
//            "ۥۜۙ\n" +
//            "ۗ۟ۢ\n" +
//            "ۤ۠ۧ\n" +
//            "ۡ۟ۥۘ\n" +
//            "ۦ۟ۘۘ\n" +
//            "ۧ۟ۘ\n" +
//            "ۛۧۦ\n" +
//            "۠ۦۛ\n" +
//            "ۘۜۗ\n" +
//            "ۖۡۖ\n" +
//            "ۖۗۚ\n" +
//            "ۖ۫ۚ\n" +
//            "ۜۤۢ\n" +
//            "ۖۚۡۘ\n" +
//            "ۦۜۚ\n" +
//            "ۧ۬ۥ\n" +
//            "ۨۨۨۘ\n" +
//            "ۚۗۚ\n" +
//            "ۢۧۢ\n" +
//            "ۧۚۚ\n" +
//            "ۢۘۤ\n" +
//            "ۧۗ۫\n" +
//            "ۗۡۨۘ\n" +
//            "ۚۨۜۘ\n" +
//            "۠ۗ۫\n" +
//            "ۢۦۨۘ\n" +
//            "ۚۘۡ\n" +
//            "ۚ۬ۛ\n" +
//            "ۡۢ۟\n" +
//            "۬۠ۖ\n" +
//            "۬ۙۨۘ\n" +
//            "ۦۤۖۘ\n" +
//            "ۜ۫ۡ\n" +
//            "۫ۡۡ\n" +
//            "ۗۚۜۘ\n" +
//            "ۜۥۡ\n" +
//            "ۥۘۢ\n" +
//            "ۙۛ۬\n" +
//            "ۛۥ۟\n" +
//            "ۜ۠ۚ\n" +
//            "ۘ۫ۢ\n" +
//            "ۙ۬ۙ\n" +
//            "ۖۨ۟\n" +
//            "۠ۙۦ\n" +
//            "ۜۜۥ\n" +
//            "ۛۡۖۘ\n" +
//            "۠۫ۧ\n" +
//            "ۜ۫ۜ\n" +
//            "ۨۡۨۘ\n" +
//            "۟ۦ\n" +
//            "ۘۗۥ\n" +
//            "ۜۡۦۘ\n" +
//            "ۛۗۡۘ\n" +
//            "ۤۖۡۘ\n" +
//            "ۚۦۖ\n" +
//            "ۛۚۜ\n" +
//            "ۛ۟۠\n" +
//            "ۜۗۦ\n" +
//            "ۢۦۢ\n" +
//            "۫ۢ\n" +
//            "ۡۗۦۘ\n" +
//            "۬ۦۜۘ\n" +
//            "۫ۜۨ\n" +
//            "ۧۛۦ\n" +
//            "ۦۘۢ\n" +
//            "ۜۥۤ\n" +
//            "ۤۗۖۘ\n" +
//            "ۛ۫ۦ\n" +
//            "ۨۢۚ\n" +
//            "ۙۜۦ\n" +
//            "ۢ۫۬\n" +
//            "ۡۧۡ\n" +
//            "ۨۡۚ\n" +
//            "ۦۛۘ\n" +
//            "ۘ۠ۘ\n" +
//            "۫۠ۖۘ\n" +
//            "۟ۧۧ\n" +
//            "ۥۚۙ\n" +
//            "ۚۙ۠\n" +
//            "۠ۨۜ\n" +
//            "ۡ۠ۙ\n" +
//            "ۜۜۙ\n" +
//            "۫ۘۦ\n" +
//            "ۢۨۜۘ\n" +
//            "ۦۤۗ\n" +
//            "ۢ۟ۖۘ\n" +
//            "ۘۢۚ\n" +
//            "ۖۧۥۘ\n" +
//            "۠ۗۘۘ\n" +
//            "ۧ۬ۜۘ\n" +
//            "ۙۘۛ\n" +
//            "ۗۛۢ\n" +
//            "ۦۙۜ\n" +
//            "ۚۜۥ\n" +
//            "۠ۤۦۘ\n" +
//            "ۗۗۧ\n" +
//            "ۚۙۖ\n" +
//            "۫۟ۘ\n" +
//            "۟ۦۢ\n" +
//            "ۤ۫ۥۘ\n" +
//            "۬ۗۥۘ\n" +
//            "ۘ۠ۧ\n" +
//            "ۢۥۢ\n" +
//            "ۖۜۙ\n" +
//            "ۖۤۥ\n" +
//            "ۗۥۥ\n" +
//            "ۚۢۘ\n" +
//            "۠ۘۥ\n" +
//            "ۥۖۦۘ\n" +
//            "ۢۥۧۘ\n" +
//            "ۙۚۨۘ\n" +
//            "ۥۧ۟\n" +
//            "ۜ۠ۥۘ\n" +
//            "ۤۤۙ\n" +
//            "ۤۛۨ\n" +
//            "ۗ۫ۡ\n" +
//            "ۘ۬ۨ\n" +
//            "ۗ۫۟\n" +
//            "ۦۡۖۘ\n" +
//            "ۘۦ۫\n" +
//            "ۜۘۚ\n" +
//            "ۡ۟۠\n" +
//            "۫ۛ۫\n" +
//            "ۜۧۛ\n" +
//            "ۢۛۘ\n" +
//            "۫ۡۗ\n" +
//            "ۙۤۥۘ\n" +
//            "ۤ۠ۥۘ\n" +
//            "ۘۦ۬\n" +
//            "ۛۛ۠\n" +
//            "ۜ۟ۘۘ\n" +
//            "۟ۜۨۘ\n" +
//            "ۛۚ۫\n" +
//            "۬ۙۖۘ\n" +
//            "ۥ۫\n" +
//            "ۛۙۙ\n" +
//            "ۛ۠ۘ\n" +
//            "ۤۗۨۘ\n" +
//            "ۥ۬ۘۘ\n" +
//            "ۗۦۛ\n" +
//            "ۢۧۛ\n" +
//            "ۖۨۦۘ\n" +
//            "ۛ۬ۤ\n" +
//            "ۤۚۡۘ\n" +
//            "۫ۜۦ\n" +
//            "ۙ۬ۗ\n" +
//            "۫ۡۨۘ\n" +
//            "۫ۙۢ\n" +
//            "ۘۙۜ\n" +
//            "ۧۚۤ\n" +
//            "ۡۚ۠\n" +
//            "ۘۡۜۘ\n" +
//            "ۢۖۨ\n" +
//            "ۗ۠ۦ\n" +
//            "ۥۛۘ\n" +
//            "ۘۗۨ\n" +
//            "ۖۚ۠\n" +
//            "ۢۦۥ\n" +
//            "ۤۜ۠\n" +
//            "۟ۥۖۘ\n" +
//            "ۢۥۡ\n" +
//            "ۗۙۥۘ\n" +
//            "۠۬ۗ\n" +
//            "ۜۧۜۘ\n" +
//            "ۖ۟ۥۘ\n" +
//            "ۜۜۨ\n" +
//            "ۥ۬۠\n" +
//            "ۘۧ۫\n" +
//            "ۨۤۨۘ\n" +
//            "ۤۤۥ\n" +
//            "۟۠ۗ\n" +
//            "ۘۦۙ\n" +
//            "ۦۤۡ\n" +
//            "ۨ\n" +
//            "ۖۨۘۘ\n" +
//            "ۥۚۨ\n" +
//            "ۧۡۦ\n" +
//            "ۙۙۦۘ\n" +
//            "۬۟ۤ\n" +
//            "ۥۦۡ\n" +
//            "ۗۖۦ\n" +
//            "ۙ۬ۜۘ\n" +
//            "ۨۙۖۘ\n" +
//            "ۨۡۦۘ\n" +
//            "ۨۡۡ\n" +
//            "ۖۡۧ\n" +
//            "ۧۦۡ\n" +
//            "۬ۙۙ\n" +
//            "ۖۜۜ\n" +
//            "ۘۥ\n" +
//            "ۗۜۛ\n" +
//            "ۛۡۥۘ\n" +
//            "ۖۛۤ\n" +
//            "۟۟ۘۘ\n" +
//            "ۢۗۜ\n" +
//            "ۖۢۡ\n" +
//            "ۖ۫۟\n" +
//            "۫ۦۧۘ\n" +
//            "ۦۙۡۘ\n" +
//            "۠ۧ۫\n" +
//            "ۚ۠۬\n" +
//            "ۗۛ۫\n" +
//            "ۚۧۦۘ\n" +
//            "ۦۛۥ\n" +
//            "ۨ۬۬\n" +
//            "ۚۡۗ\n" +
//            "ۗۨۜ\n" +
//            "ۢۛۛ\n" +
//            "۬ۙۡۘ\n" +
//            "ۜ۠\n" +
//            "ۨۧۡ\n" +
//            "ۦۗۦ\n" +
//            "ۡۡۧ\n" +
//            "ۧ۟ۖۘ\n" +
//            "۫۠\n" +
//            "ۘۡۘۘ\n" +
//            "ۗۚۡ\n" +
//            "۠ۦۡۘ\n" +
//            "ۡۛۛ\n" +
//            "۬ۤۡۘ\n" +
//            "۬ۦۥ\n" +
//            "ۢۙۘ\n" +
//            "ۨۧۜ\n" +
//            "ۚ۠ۗ\n" +
//            "ۛۙۨۘ\n" +
//            "ۗۥۡ\n" +
//            "ۙۢۥۘ\n" +
//            "۠ۤۙ\n" +
//            "ۤۦۙ\n" +
//            "ۡۛ\n" +
//            "ۙ۫ۛ\n" +
//            "ۛۛۢ\n" +
//            "ۤۘۧۘ\n" +
//            "۠۬ۚ\n" +
//            "ۨۦۤ\n" +
//            "ۙ۬۟\n" +
//            "ۢۙۨ\n" +
//            "ۖۥ\n" +
//            "ۗۙۦۘ\n" +
//            "ۤۗۢ\n" +
//            "ۨ۟ۥ\n" +
//            "ۥۧۥۘ\n" +
//            "ۚۥۖۘ\n" +
//            "ۦۘۙ\n" +
//            "ۜۖۖۘ\n" +
//            "ۘۤۡۘ\n" +
//            "ۖۢۛ\n" +
//            "ۛۢۤ\n" +
//            "ۛۨ\n" +
//            "ۙۛۗ\n" +
//            "ۡ۠۟\n" +
//            "ۨۤۘۘ\n" +
//            "ۡۙۤ\n" +
//            "ۧۨۗ\n" +
//            "ۡ۠ۢ\n" +
//            "۬ۢۦۘ\n" +
//            "ۚۧۘ\n" +
//            "ۛ۠ۦ\n" +
//            "۟ۙۡۘ\n" +
//            "ۡ۬ۖ\n" +
//            "ۗۖۥ\n" +
//            "۟ۜۤ\n" +
//            "ۙۧۦۘ\n" +
//            "ۛۜۡ\n" +
//            "ۗۥ۠\n" +
//            "۟ۦ۫\n" +
//            "ۢۢۜ\n" +
//            "ۢۜۤ\n" +
//            "ۥۘۦۘ\n" +
//            "ۚۖۢ\n" +
//            "ۤ۫ۜ\n" +
//            "ۡ۬۟\n" +
//            "ۗۨ۫\n" +
//            "ۡۥۧۘ\n" +
//            "۫ۜۨۘ\n" +
//            "ۢۥۥۘ\n" +
//            "ۜۨ۫\n" +
//            "ۢۖۦۘ\n" +
//            "۫۬ۨ\n" +
//            "ۙۙۨ\n" +
//            "۬ۜۗ\n" +
//            "ۙۢۗ\n" +
//            "ۛ۬ۥۘ\n" +
//            "ۤ۫ۦۘ\n" +
//            "ۜ۫ۖ\n" +
//            "ۢۚ۫\n" +
//            "۫ۗۢ\n" +
//            "ۦۢۖ\n" +
//            "ۡۖ۠\n" +
//            "ۦۤ۠\n" +
//            "ۛۜۗ\n" +
//            "ۦۛ۠\n" +
//            "ۤۖۧ\n" +
//            "۬ۛ۫\n" +
//            "ۧۢۖ\n" +
//            "۠ۛ۫\n" +
//            "ۛۧۘ\n" +
//            "ۗ۬ۥۘ\n" +
//            "ۚۘۚ\n" +
//            "۟ۙۗ\n" +
//            "ۙۗۜۘ\n" +
//            "ۨۙۘۘ\n" +
//            "ۢۡ۟\n" +
//            "ۘ۟ۡۘ\n" +
//            "ۥۘۤ\n" +
//            "ۧۙۖۘ\n" +
//            "ۙۜۘۘ\n" +
//            "ۢۗۚ\n" +
//            "ۨۧۗ\n" +
//            "ۙۧۘ\n" +
//            "۠۠ۤ\n" +
//            "ۤۤ۠\n" +
//            "۟ۙۘ\n" +
//            "۫ۛۡ\n" +
//            "ۗ۠ۥۘ\n" +
//            "ۚۖۨۘ\n" +
//            "ۦۥ۫\n" +
//            "ۛۙۖ\n" +
//            "ۘۤۨۘ\n" +
//            "ۙۧۙ\n" +
//            "۬ۘۗ\n" +
//            "ۧۛ\n" +
//            "ۛۧ\n" +
//            "ۡ۫ۢ\n" +
//            "۠ۡ۬\n" +
//            "۫ۥۛ\n" +
//            "ۨۗۘۘ\n" +
//            "ۘۤۜ\n" +
//            "۠ۙۥۘ\n" +
//            "ۖۘۙ\n" +
//            "ۜۧۥۘ\n" +
//            "۟۫ۗ\n" +
//            "۟۟ۚ\n" +
//            "ۘۨۡ\n" +
//            "ۜۤۘۘ\n" +
//            "۠ۛۥ\n" +
//            "ۘ۬ۚ\n" +
//            "ۢۗۤ\n" +
//            "ۦۗۥ\n" +
//            "۠ۡۦۘ\n" +
//            "ۦۨ۬\n" +
//            "ۛۨۥ\n" +
//            "ۜۤۘ\n" +
//            "ۥۛۖ\n" +
//            "ۚۘۡۘ\n" +
//            "۫۠ۡۘ\n" +
//            "ۛ۬ۡ\n" +
//            "۠۫ۘۘ\n" +
//            "ۧۦۚ\n" +
//            "ۙۤۥ\n" +
//            "ۦۡۙ\n" +
//            "۬ۧۦۘ\n" +
//            "ۥ۟ۗ\n" +
//            "ۙۚ۬\n" +
//            "۟ۛ۫\n" +
//            "ۜۙۖۘ\n" +
//            "ۤۗۦ\n" +
//            "ۗۥۤ\n" +
//            "ۢۤۜۘ\n" +
//            "۬ۙۜۘ\n" +
//            "ۡۛۧ\n" +
//            "ۙۖۧ\n" +
//            "۬۫ۖۘ\n" +
//            "۠ۧۗ\n" +
//            "ۦۖۘۘ\n" +
//            "ۥۨۨ\n" +
//            "ۗ۠ۡ\n" +
//            "ۡۢ۬\n" +
//            "ۙۤۦۘ\n" +
//            "ۦ۟ۚ\n" +
//            "ۨۜۡۘ\n" +
//            "ۖۜۢ\n" +
//            "ۚۢۖۘ\n" +
//            "۬ۢۖۘ\n" +
//            "ۛۡۨۘ\n" +
//            "۠ۤۤ\n" +
//            "ۘ۬ۦ\n" +
//            "ۗۜ۫\n" +
//            "ۧ۠ۘ\n" +
//            "۫ۚۦۘ\n" +
//            "ۗۨۥۘ\n" +
//            "ۖۗۡ\n" +
//            "ۖۧۨۘ\n" +
//            "ۢ۠۬\n" +
//            "ۦۡۧ\n" +
//            "ۨۦۦۘ\n" +
//            "۬ۤۖ\n" +
//            "ۡۘ۬\n" +
//            "۟۟ۗ\n" +
//            "ۥۙۛ\n" +
//            "ۘۨ۠\n" +
//            "۟ۖۜۘ\n" +
//            "ۨۨۖ\n" +
//            "۫ۚۘ\n" +
//            "ۥۤ\n" +
//            "۟ۨۨۘ\n" +
//            "ۜۜۦ\n" +
//            "ۦۜۦۘ\n" +
//            "۟ۚۨۘ\n" +
//            "ۡۚۧ\n" +
//            "ۥۘ۟\n" +
//            "۟ۖۚ\n" +
//            "ۦۥۘ\n" +
//            "ۗۤۨۘ\n" +
//            "ۙۛۘۘ\n" +
//            "ۚۨ۟\n" +
//            "ۘۧۖ\n" +
//            "۬ۗۘ\n" +
//            "۫ۚۥۘ\n" +
//            "ۘۗ۟\n" +
//            "۬ۡۤ\n" +
//            "ۥ۟۟\n" +
//            "۫ۚۛ\n" +
//            "ۗۤۖۘ\n" +
//            "۫ۦۧ\n" +
//            "۠ۗۢ\n" +
//            "ۥ۫ۗ\n" +
//            "۟۬۠\n" +
//            "ۙۘۥ\n" +
//            "ۨۦ۟\n" +
//            "ۖۘۧۘ\n" +
//            "ۥۗۘۘ\n" +
//            "ۛۚۗ\n" +
//            "ۜۢۡ\n" +
//            "ۜ۬ۗ\n" +
//            "ۥۥۚ\n" +
//            "۬۠ۘ\n" +
//            "ۛ۫ۥۘ\n" +
//            "ۗۧۧ\n" +
//            "ۧ۠ۦۘ\n" +
//            "۠ۛۦ\n" +
//            "ۦۛۜ\n" +
//            "ۚۢۙ\n" +
//            "ۛۡۗ\n" +
//            "۫ۧۨۘ\n" +
//            "ۡ۫۬\n" +
//            "ۛۥۘۘ\n" +
//            "ۡ۠ۨ\n" +
//            "ۡ۬ۘۘ\n" +
//            "ۚۖۡۘ\n" +
//            "ۧۚۘ\n" +
//            "۠۫ۖۘ\n" +
//            "ۙ۠۬\n" +
//            "ۤۚ\n" +
//            "ۙۖۚ\n" +
//            "۠ۨ۬\n" +
//            "ۦۥۤ\n" +
//            "ۛۛۖ\n" +
//            "ۡۘۧۘ\n" +
//            "ۨۛۨۘ\n" +
//            "۠ۗۖ\n" +
//            "ۤۢۢ\n" +
//            "ۡۤ۫\n" +
//            "ۨۥۥ\n" +
//            "ۢ۠ۖ\n" +
//            "ۗۦۥ\n" +
//            "ۜۤۧ\n" +
//            "۫ۜۡۘ\n" +
//            "۠ۧۛ\n" +
//            "۟ۛۖ\n" +
//            "ۘۜ۟\n" +
//            "۫ۗۡ\n" +
//            "۟ۧۨۘ\n" +
//            "ۡۥۙ\n" +
//            "۬ۙۛ\n" +
//            "ۛ۠ۜ\n" +
//            "ۤۦ۠\n" +
//            "ۖ۬ۖۘ\n" +
//            "ۗۦۢ\n" +
//            "ۚۚ۟\n" +
//            "ۤۛۗ\n" +
//            "۟ۡۨ\n" +
//            "ۛۛۖۘ\n" +
//            "ۢ۬ۜۘ\n" +
//            "ۜۙۘ\n" +
//            "ۚۛۙ\n" +
//            "ۢۥۖ\n" +
//            "ۡۖۢ\n" +
//            "ۢۖۗ\n" +
//            "ۛۛۗ\n" +
//            "۟۬ۜ\n" +
//            "ۛۨۥۘ\n" +
//            "ۚۚ۫\n" +
//            "ۙۜۖۘ\n" +
//            "ۨ۫۟\n" +
//            "ۙۖۜۘ\n" +
//            "ۗۖۤ\n" +
//            "۬ۥۦ\n" +
//            "ۡۙۡ\n" +
//            "۠ۢ۫\n" +
//            "ۜۗۧ\n" +
//            "ۡ۠ۚ\n" +
//            "ۡ۬ۤ\n" +
//            "ۜ۬ۨ\n" +
//            "ۡۙۨۘ\n" +
//            "ۢۘۡ\n" +
//            "۫ۡۧۘ\n" +
//            "ۡۙۙ\n" +
//            "ۢۨۦ\n" +
//            "۟۟ۥۘ\n" +
//            "ۧۗۨ\n" +
//            "ۜۦۜۘ\n" +
//            "ۤۨۖۘ\n" +
//            "ۜ۬ۥ\n" +
//            "ۚۖ۫\n" +
//            "ۖ۫۠\n" +
//            "ۜۧۡ\n" +
//            "ۜۘۤ\n" +
//            "ۥ۟ۖۘ\n" +
//            "۠۬۟\n" +
//            "ۦۛۤ\n" +
//            "ۖ۠ۖ\n" +
//            "ۦۥۗ\n" +
//            "ۚۘۖ\n" +
//            "۫ۢۨۘ\n" +
//            "ۨۡۖ\n" +
//            "ۥۗۥ\n" +
//            "ۘۚۘۘ\n" +
//            "ۤۡۘۘ\n" +
//            "۟ۛ\n" +
//            "۟ۥۢ\n" +
//            "ۤ۫ۘ\n" +
//            "ۗ۫ۡۘ\n" +
//            "ۥۛۨ\n" +
//            "ۘۗ\n" +
//            "ۘۙۧ\n" +
//            "۟ۜ۬\n" +
//            "۟ۗۙ\n" +
//            "ۛۖ\n" +
//            "۟۫۫\n" +
//            "ۢۤۘ\n" +
//            "۠ۜۡۘ\n" +
//            "ۚۨ۠\n" +
//            "ۗۗ۫\n" +
//            "ۛ۫ۖۘ\n" +
//            "۠ۜۤ\n" +
//            "۬ۛۥۘ\n" +
//            "ۙ\n" +
//            "ۛۧۜۘ\n" +
//            "ۡۦۙ\n" +
//            "۟ۡۖۘ\n" +
//            "ۨۨ۬\n" +
//            "۟ۧ۫\n" +
//            "۫ۥۖۘ\n" +
//            "۫ۢۙ\n" +
//            "ۨۖ\n" +
//            "ۢۨ۟\n" +
//            "ۢ۠ۢ\n" +
//            "۬ۦۛ\n" +
//            "ۙۗۦۘ\n" +
//            "ۡ۟ۜ\n" +
//            "ۗۖ۟\n" +
//            "ۧۜۘۘ\n" +
//            "۠۬ۡۘ\n" +
//            "ۚۨۦ\n" +
//            "ۙۧۜ\n" +
//            "۠ۛ۠\n" +
//            "۠۠\n" +
//            "۟ۥ۬\n" +
//            "۟ۡۥ\n" +
//            "ۛ۬ۦۘ\n" +
//            "ۥۜ۫\n" +
//            "ۛۖۦۘ\n" +
//            "۟ۨۜۘ\n" +
//            "ۥۢ۫\n" +
//            "ۘۥۚ\n" +
//            "ۛۡۜۘ\n" +
//            "ۘۡۤ\n" +
//            "۬ۙۘۘ\n" +
//            "ۜۡ۟\n" +
//            "ۗۘۥۘ\n" +
//            "ۧ۬ۛ\n" +
//            "ۧۚۗ\n" +
//            "ۥۥۡۘ\n" +
//            "۫ۡ۟\n" +
//            "ۘۙ۠\n" +
//            "۟ۘۖۘ\n" +
//            "ۤۥۚ\n" +
//            "۠ۢۘ\n" +
//            "ۖۗۤ\n" +
//            "ۗۤۥۘ\n" +
//            "ۥۜۘۘ\n" +
//            "ۘۛۦۘ\n" +
//            "ۘۢۦ\n" +
//            "ۛ۫ۡۘ\n" +
//            "ۛۢۧ\n" +
//            "ۗ۫ۦ\n" +
//            "۬ۜ۟\n" +
//            "ۤۢ\n" +
//            "ۤۢۦ\n" +
//            "۟ۥ\n" +
//            "۠ۚۦ\n" +
//            "ۦ۠ۥۘ\n" +
//            "ۚ۫ۨ\n" +
//            "ۗ۫ۨۘ\n" +
//            "ۢۡۚ\n" +
//            "ۙ۫ۖ\n" +
//            "ۦۨۦ\n" +
//            "ۨۜۘۘ\n" +
//            "ۚۛۦ\n" +
//            "ۘۡۢ\n" +
//            "۫ۢۦ\n" +
//            "ۡ۬ۘ\n" +
//            "ۤۡ۟\n" +
//            "ۤ۬ۡۘ\n" +
//            "ۛۚ۟\n" +
//            "ۦ۠ۙ\n" +
//            "ۘ۫ۚ\n" +
//            "ۚۨۘۘ\n" +
//            "ۚ\n" +
//            "ۥۖ۫\n" +
//            "ۜۛۛ\n" +
//            "ۗۡۥ\n" +
//            "ۥ۬ۡۘ\n" +
//            "ۤ۠ۖۘ\n" +
//            "ۛۧ۫\n" +
//            "ۥۘۦ\n" +
//            "۬ۖۥۘ\n" +
//            "ۤۜۧ\n" +
//            "ۢۨۧ\n" +
//            "ۖۜۜۘ\n" +
//            "ۙۦ۬\n" +
//            "ۗ۠۠\n" +
//            "ۢ۫۠\n" +
//            "ۦۙۡ\n" +
//            "۫۟ۗ\n" +
//            "ۥۖۥ\n" +
//            "۟۠ۜۘ\n" +
//            "۟۠ۨ\n" +
//            "ۡ۫۠\n" +
//            "۫ۥ۫\n" +
//            "ۨۚۦۘ\n" +
//            "ۚۨۜ\n" +
//            "ۦۨ۫\n" +
//            "ۧۧۦۘ\n" +
//            "ۥۦۥۘ\n" +
//            "ۢۨۨۘ\n" +
//            "ۦۚۡۘ\n" +
//            "ۡۡ\n" +
//            "ۗۡۦۘ\n" +
//            "ۧۖ۫\n" +
//            "ۖۤۤ\n" +
//            "ۗۘۡ\n" +
//            "ۙۛۧ\n" +
//            "ۡۚۦۘ\n" +
//            "ۤ۟۫\n" +
//            "ۜۨۢ\n" +
//            "ۙ۬ۜ\n" +
//            "ۜ۫ۧ\n" +
//            "ۘۖۜۘ\n" +
//            "ۗۨۦ\n" +
//            "۫ۡۦ\n" +
//            "۬ۤۜۘ\n" +
//            "ۚۧ۟\n" +
//            "ۡۖۖۘ\n" +
//            "۟ۛۙ\n" +
//            "ۨۚۜۘ\n" +
//            "ۜۘۙ\n" +
//            "۬ۧۙ\n" +
//            "ۙۤۢ\n" +
//            "ۙ۠ۧ\n" +
//            "ۛۖۛ\n" +
//            "ۖۛۧ\n" +
//            "ۡۢ۫\n" +
//            "ۡۥۥۘ\n" +
//            "ۜۨۜ\n" +
//            "ۜۛۘ\n" +
//            "ۨۗۤ\n" +
//            "ۘ۫\n" +
//            "ۡۘۗ\n" +
//            "ۦۡۨۘ\n" +
//            "ۧ۬ۘۘ\n" +
//            "ۘۚۘ\n" +
//            "ۡۦۨ\n" +
//            "ۘۢۖ\n" +
//            "ۚۧۜۘ\n" +
//            "ۘ۠ۢ\n" +
//            "ۢۨۘ\n" +
//            "ۢۤۥ\n" +
//            "ۘۡۨ\n" +
//            "ۛۗ\n" +
//            "ۜۙۦ\n" +
//            "۠ۚۥۘ\n" +
//            "ۤۤۡ\n" +
//            "ۙۘ\n" +
//            "ۚۦ۟\n" +
//            "ۗۘۜ\n" +
//            "ۢۙۧ\n" +
//            "ۧۥۛ\n" +
//            "ۧۜۤ\n" +
//            "ۘۖۖ\n" +
//            "ۧۚۢ\n" +
//            "ۥۡۡ\n" +
//            "ۜۖۧۘ\n" +
//            "ۜ۬ۙ\n" +
//            "ۛۦۨۘ\n" +
//            "ۖ۟ۙ\n" +
//            "۟ۥۘ\n" +
//            "ۡ۟ۤ\n" +
//            "ۨۘۨۘ\n" +
//            "ۦ۬ۗ\n" +
//            "ۡ۬ۜۘ\n" +
//            "۠ۥۢ\n" +
//            "۟ۢۗ\n" +
//            "۫ۧۛ\n" +
//            "ۧۖۖ\n" +
//            "ۦۖۜ\n" +
//            "ۘۖ۫\n" +
//            "۬۟۫\n" +
//            "ۚۦ۬\n" +
//            "ۛۘۨ\n" +
//            "ۖ۫ۦۘ\n" +
//            "ۨۘۡۘ\n" +
//            "ۛ۫ۜۘ\n" +
//            "ۨۚۘۘ\n" +
//            "ۛۚ\n" +
//            "ۗ۟ۛ\n" +
//            "ۤۨۨ\n" +
//            "ۡۖۗ\n" +
//            "ۥ۫ۜ\n" +
//            "ۖ۬ۨۘ\n" +
//            "ۖۗۜ\n" +
//            "ۗۢۨۘ\n" +
//            "ۖۦۛ\n" +
//            "ۦ۫ۘ\n" +
//            "۟۫ۨۘ\n" +
//            "ۡۨ۫\n" +
//            "۠۠ۜ\n" +
//            "ۡۡۢ\n" +
//            "۫۟ۦ\n" +
//            "۠ۢ۠\n" +
//            "۬ۧ\n" +
//            "۟ۗۦۘ\n" +
//            "ۗۡۖ\n" +
//            "ۤۢۡۘ\n" +
//            "۠ۧۨۘ\n" +
//            "ۥۥۦ\n" +
//            "ۨۜۚ\n" +
//            "ۖۘۢ\n" +
//            "ۨۢ۠\n" +
//            "ۧۘۖ\n" +
//            "ۥۧ\n" +
//            "ۚۨۢ\n" +
//            "۟ۚ\n" +
//            "ۡۨۤ\n" +
//            "ۤۥۖۘ\n" +
//            "ۡۗۧ\n" +
//            "ۛ۟ۨ\n" +
//            "ۤ۠ۢ\n" +
//            "ۙ۬۫\n" +
//            "ۡ۠ۦۘ\n" +
//            "ۘۥۙ\n" +
//            "ۤۘۦۘ\n" +
//            "ۧۧۨ\n" +
//            "۬۫ۚ\n" +
//            "ۜ۟۠\n" +
//            "۬۬ۖۘ\n" +
//            "ۧۤۡ\n" +
//            "ۙۤۖۘ\n" +
//            "ۥۗۡۘ\n" +
//            "۠ۦۨ\n" +
//            "ۘۥۧۘ\n" +
//            "ۧۘۧ\n" +
//            "ۤۥۧ\n" +
//            "ۢۡۥ\n" +
//            "ۖۚۥ\n" +
//            "۫ۚ۠\n" +
//            "۟ۚ۠\n" +
//            "ۡۚ۟\n" +
//            "۫ۛۚ\n" +
//            "ۨۜۧ\n" +
//            "ۙ۫ۤ\n" +
//            "ۚۤۜۘ\n" +
//            "۫۬ۚ\n" +
//            "ۘ۠ۖ\n" +
//            "ۥ۬۟\n" +
//            "ۗۤۦۘ\n" +
//            "ۤۤۥۘ\n" +
//            "ۡ۠ۗ\n" +
//            "ۛۙ۠\n" +
//            "ۜۗۘۘ\n" +
//            "۟۬ۖ\n" +
//            "ۧۧ۫\n" +
//            "ۥۚ۫\n" +
//            "۫ۤۥۘ\n" +
//            "ۗۦۧۘ\n" +
//            "ۤۚۢ\n" +
//            "ۛ۟ۥ\n" +
//            "ۜ۠ۜۘ\n" +
//            "ۚۢ۟\n" +
//            "ۙۤ\n" +
//            "ۚۥ\n" +
//            "ۥ۟۫\n" +
//            "ۛۘۜۘ\n" +
//            "ۢۡ\n" +
//            "ۙ۫ۦۘ\n" +
//            "ۗ۟\n" +
//            "ۥۗۦ\n" +
//            "ۚۚۥۘ\n" +
//            "ۛۦۜ\n" +
//            "ۤ۟ۥۘ\n" +
//            "ۘۧ۬\n" +
//            "ۗۜۡۘ\n" +
//            "ۨۘۘۘ\n" +
//            "ۧۢۥ\n" +
//            "ۛۥۘ\n" +
//            "ۨۖۨۘ\n" +
//            "ۗۦۖ\n" +
//            "ۤۚۤ\n" +
//            "ۡۨۨ\n" +
//            "ۛ۟ۦۘ\n" +
//            "۠ۨۘ\n" +
//            "۠ۘۧۘ\n" +
//            "ۤۦۤ\n" +
//            "ۢۛۢ\n" +
//            "۬ۨۖۘ\n" +
//            "ۗ۫ۖۘ\n" +
//            "ۘ۟ۜۘ\n" +
//            "ۗۜۡ\n" +
//            "ۖۖۜۘ\n" +
//            "ۖۥۥۘ\n" +
//            "ۜ۫ۥ\n" +
//            "ۦۙۗ\n" +
//            "۟۠ۨۘ\n" +
//            "ۚۡۘۘ\n" +
//            "ۘۚ۬\n" +
//            "ۢۛۚ\n" +
//            "ۦ۬ۢ\n" +
//            "ۦۙۦ\n" +
//            "ۖۥۡۘ\n" +
//            "ۙ۟ۖ\n" +
//            "۟ۧۥۘ\n" +
//            "۠ۦۤ\n" +
//            "۬ۥ۠\n" +
//            "۟ۚۦ\n" +
//            "۠۟ۧ\n" +
//            "۠۫ۥ\n" +
//            "ۚۙ۟\n" +
//            "۬۬\n" +
//            "ۘۥۜۘ\n" +
//            "ۡ۫ۛ\n" +
//            "ۗ۠ۥ\n" +
//            "۠ۜۧۘ\n" +
//            "۟۟ۨۘ\n" +
//            "ۚۧۖ\n" +
//            "ۥۜ۠\n" +
//            "ۤۢۛ\n" +
//            "ۙۧ۫\n" +
//            "ۖۗۥۘ\n" +
//            "ۡۢۘ\n" +
//            "ۡۨۙ\n" +
//            "ۘۗ۫\n" +
//            "ۡۥۥ\n" +
//            "ۦ۟ۥۘ\n" +
//            "ۦۧۙ\n" +
//            "ۗۗ۬\n" +
//            "ۖ۬ۡۘ\n" +
//            "۟ۦ۠\n" +
//            "ۡۢۥۘ\n" +
//            "ۧۙ۫\n" +
//            "ۦۦ۟\n" +
//            "ۛۛۥۘ\n" +
//            "ۧ۬ۨۘ\n" +
//            "ۢۛۧ\n" +
//            "ۜۤۥۘ\n" +
//            "ۢۥۜۘ\n" +
//            "ۚۨۧۘ\n" +
//            "۠ۡۡۘ\n" +
//            "۬ۜ۬\n" +
//            "ۤ۬ۥۘ\n" +
//            "۬۫ۦ\n" +
//            "ۙۧۡ\n" +
//            "۫ۤۨۘ\n" +
//            "ۙۚۘ\n" +
//            "ۜ۫۟\n" +
//            "۠ۛۤ\n" +
//            "ۤۘۘ\n" +
//            "ۨۛۡ\n" +
//            "ۧۗۥۘ\n" +
//            "ۚۥۡۘ\n" +
//            "ۘۢۡ\n" +
//            "ۢۖۙ\n" +
//            "ۡ۟ۡۘ\n" +
//            "ۛ۫ۗ\n" +
//            "ۛۘۙ\n" +
//            "ۢۦۖۘ\n" +
//            "۬ۛۖ\n" +
//            "ۙۖۜ\n" +
//            "ۤۚ۟\n" +
//            "ۖۛ۟\n" +
//            "ۙۨۙ\n" +
//            "۟ۦۗ\n" +
//            "ۖۜۨ\n" +
//            "ۡۛۙ\n" +
//            "ۘۥۖۘ\n" +
//            "ۧۘۨ\n" +
//            "ۖۡۛ\n" +
//            "ۡۛۜ\n" +
//            "ۘۤۨ\n" +
//            "ۢ۟ۘ\n" +
//            "۫ۤۛ\n" +
//            "۟۫ۦۘ\n" +
//            "ۘۛۛ\n" +
//            "ۜۥۙ\n" +
//            "ۥ۟ۜۘ\n" +
//            "ۢۚۥۘ\n" +
//            "ۥۜۦۘ\n" +
//            "ۘۦۥۘ\n" +
//            "ۜۥۦۘ\n" +
//            "ۡ۠ۧ\n" +
//            "ۗ۟ۖۘ\n" +
//            "ۖۘۤ\n" +
//            "۠ۧۧ\n" +
//            "۠ۨۨۘ\n" +
//            "۠ۖ\n" +
//            "۬۟ۜ\n" +
//            "ۦۚۨ\n" +
//            "ۗ۬ۢ\n" +
//            "۫۟ۜۘ\n" +
//            "۬۬ۢ\n" +
//            "ۘۘۦ\n" +
//            "ۙ۟\n" +
//            "ۦ۟ۢ\n" +
//            "ۤ۫۟\n" +
//            "ۗۛۜ\n" +
//            "ۘۧۙ\n" +
//            "ۧۘۚ\n" +
//            "ۦۗۖۘ\n" +
//            "ۖۤۦ\n" +
//            "۠۠ۦۘ\n" +
//            "ۥۗ۫\n" +
//            "ۦۖ۫\n" +
//            "ۙۡۘ\n" +
//            "ۨ۫ۤ\n" +
//            "ۤ۠۠\n" +
//            "ۜۛۥۘ\n" +
//            "ۙ۠ۖۘ\n" +
//            "ۤ۫\n" +
//            "ۤۖۡ\n" +
//            "۫ۦۥۘ\n" +
//            "ۖۨۡ\n" +
//            "۠ۗۛ\n" +
//            "ۡۙۦ\n" +
//            "۬ۥ۫\n" +
//            "ۙۢۘۘ\n" +
//            "ۛۖۨۘ\n" +
//            "ۦۦۨۘ\n" +
//            "ۦۚ\n" +
//            "ۤ۟ۡۘ\n" +
//            "ۙۗۛ\n" +
//            "ۤۢۨ\n" +
//            "ۖۡۡ\n" +
//            "۬ۙۡ\n" +
//            "ۨ۬ۙ\n" +
//            "ۢۧۘۘ\n" +
//            "ۥۨۖ\n" +
//            "ۡۜۢ\n" +
//            "ۗ۬ۜ\n" +
//            "ۙۢۘ\n" +
//            "ۦ۬ۨ\n" +
//            "ۨۨۦ\n" +
//            "ۘ۬ۙ\n" +
//            "۟ۘۨ\n" +
//            "ۛ۟ۥۘ\n" +
//            "ۧۛۧ\n" +
//            "ۦۨۢ\n" +
//            "۟ۘۘۘ\n" +
//            "ۖ۬ۗ\n" +
//            "ۨ۟ۢ\n" +
//            "ۘ۬ۜ\n" +
//            "ۜ۬ۨۘ\n" +
//            "ۧ۠ۥۘ\n" +
//            "ۢۥۦ\n" +
//            "ۙۡ۬\n" +
//            "۠ۢ۬\n" +
//            "۫ۢۜۘ\n" +
//            "ۡۘۤ\n" +
//            "ۢ۬۫\n" +
//            "ۙۚۖ\n" +
//            "۟ۦۙ\n" +
//            "ۜۚۜۘ\n" +
//            "ۢ۬ۖۘ\n" +
//            "۬۬ۤ\n" +
//            "ۨۜۥۘ\n" +
//            "۬ۗۗ\n" +
//            "ۚۛۘ\n" +
//            "ۙۡۦ\n" +
//            "ۤۚۦۘ\n" +
//            "ۗۦۨ\n" +
//            "ۢۤۖ\n" +
//            "۟ۗۥ\n" +
//            "ۚ۫\n" +
//            "۬ۜۖۘ\n" +
//            "ۨۨۘۘ\n" +
//            "ۧۚۥۘ\n" +
//            "ۦۛۗ\n" +
//            "۟ۤ\n" +
//            "ۥۡۚ\n" +
//            "ۚۗۥۘ\n" +
//            "ۛۖۦ\n" +
//            "ۤ۬۠\n" +
//            "ۛۦۜۘ\n" +
//            "ۧۙۨۘ\n" +
//            "۬ۜۖ\n" +
//            "۬ۘۙ\n" +
//            "ۡ۬ۥۘ\n" +
//            "ۘۡۚ\n" +
//            "ۛ\n" +
//            "۠۫ۚ\n" +
//            "۬ۛۚ\n" +
//            "ۨۢۨ\n" +
//            "ۤۘۧ\n" +
//            "ۖۗ۟\n" +
//            "۬ۨۥ\n" +
//            "ۘۜۚ\n" +
//            "ۥ۟ۘ\n" +
//            "ۘۥۡۘ\n" +
//            "ۗۛۦ\n" +
//            "ۚۖۙ\n" +
//            "ۦۢۚ\n" +
//            "ۤۗۖ\n" +
//            "ۗۧۙ\n" +
//            "۠ۚ\n" +
//            "ۡۚۜۘ\n" +
//            "۟ۤۤ\n" +
//            "ۧۦۧ\n" +
//            "ۜۢۢ\n" +
//            "ۡ۠ۜۘ\n" +
//            "ۙۜۥ\n" +
//            "ۘ۫ۘ\n" +
//            "ۢۜۥ\n" +
//            "ۡۤۜۘ\n" +
//            "ۢۘۖ\n" +
//            "۟ۡۧ\n" +
//            "ۗۥۖ\n" +
//            "ۚۥۜۘ\n" +
//            "ۡۗۥ\n" +
//            "ۙۚۙ\n" +
//            "۟۟ۢ\n" +
//            "ۚۤۨۘ\n" +
//            "ۡ۫ۥ\n" +
//            "ۛۙۚ\n" +
//            "ۢۙۡ\n" +
//            "ۘۢۡۘ\n" +
//            "۫ۜۦۘ\n" +
//            "۫ۖۛ\n" +
//            "ۧۦۨ\n" +
//            "۫ۘۢ\n" +
//            "ۥۗۖ\n" +
//            "ۧۗۜۘ\n" +
//            "۬ۗ۟\n" +
//            "۠۫ۤ\n" +
//            "ۗ۬ۨ\n" +
//            "ۙۨۦۘ\n" +
//            "۫۫ۖۘ\n" +
//            "ۙۖ۠\n" +
//            "ۘۤۜۘ\n" +
//            "ۧۛۦۘ\n" +
//            "ۜۧۗ\n" +
//            "ۛ۟ۜ\n" +
//            "۬۫ۛ\n" +
//            "۫۠ۨۘ\n" +
//            "ۘ۫ۦ\n" +
//            "ۗۗ۟\n" +
//            "ۤ۬ۨۘ\n" +
//            "ۖۖۨ\n" +
//            "ۗۘ۬\n" +
//            "ۧۗۘۘ\n" +
//            "ۦۖۢ\n" +
//            "ۡۥۤ\n" +
//            "ۡۖۘۘ\n" +
//            "ۢ۬ۥۘ\n" +
//            "ۦ۫ۤ\n" +
//            "ۛۡۧ\n" +
//            "ۢ۬۟\n" +
//            "۫ۜۙ\n" +
//            "۠ۤۨۘ\n" +
//            "ۙۤۧ\n" +
//            "ۜۨۘ\n" +
//            "ۘۛۜ\n" +
//            "ۚۥۨ\n" +
//            "ۙۖۛ\n" +
//            "ۙۤۖ\n" +
//            "۠۟ۗ\n" +
//            "ۢ۬ۖ\n" +
//            "ۚۥۧۘ\n" +
//            "ۡۜۡۘ\n" +
//            "ۛۧۚ\n" +
//            "۠ۤۜۘ\n" +
//            "ۨ۠ۗ\n" +
//            "۬ۘۜ\n" +
//            "ۘ۬ۗ\n" +
//            "ۘۖۧ\n" +
//            "ۙۚۚ\n" +
//            "ۜ۫ۗ\n" +
//            "ۡۗۨ\n" +
//            "ۚۚۨۘ\n" +
//            "ۚۘ۟\n" +
//            "ۤۡۧۘ\n" +
//            "ۦۢۖۘ\n" +
//            "ۤۗ۬\n" +
//            "ۧۨۖۘ\n" +
//            "۬ۧۘ\n" +
//            "۫ۦ۟\n" +
//            "ۗۤ۠\n" +
//            "۟۫ۛ\n" +
//            "ۙۡ\n" +
//            "ۙۥۡۘ\n" +
//            "ۦۗۜۘ\n" +
//            "ۡۙۜۘ\n" +
//            "ۜۤ۬\n" +
//            "ۧۖۨۘ\n" +
//            "ۤۥۤ\n" +
//            "۟ۜۜ\n" +
//            "۠ۦۘ\n" +
//            "۬ۗ۠\n" +
//            "۟ۦۧ\n" +
//            "ۗ۠ۨۘ\n" +
//            "۬۬ۨۘ\n" +
//            "ۤۢۧ\n" +
//            "ۙۜۥۘ\n" +
//            "ۦۥۦۘ\n" +
//            "ۡ۟ۦ\n" +
//            "ۜۗ۬\n" +
//            "ۧۚۥ\n" +
//            "ۢۛ۫\n" +
//            "۬ۛۜۘ\n" +
//            "ۚۥۢ\n" +
//            "ۢۚ۬\n" +
//            "ۦۙۦۘ\n" +
//            "۠۟ۛ\n" +
//            "ۜۢۜ\n" +
//            "ۘۖ۬\n" +
//            "ۙۢۚ\n" +
//            "ۛۘۥۘ\n" +
//            "ۚۗۜ\n" +
//            "ۢۗۥۘ\n" +
//            "ۥ۬ۜۘ\n" +
//            "ۛۨۦ\n" +
//            "ۦۚۦ\n" +
//            "۟ۙۦ\n" +
//            "ۧۢۥۘ\n" +
//            "۫ۢۧ\n" +
//            "ۙۧۥۘ\n" +
//            "ۗ۟ۘ\n" +
//            "ۦ۟ۨ\n" +
//            "ۛۚۥ\n" +
//            "۟۠ۙ\n" +
//            "۠ۗ۠\n" +
//            "ۙۢۛ\n" +
//            "ۧ۫ۖۘ\n" +
//            "ۡۡۥۘ\n" +
//            "ۖۚ۬\n" +
//            "۟۬ۗ\n" +
//            "ۨ۠ۥ\n" +
//            "ۧۘۜ\n" +
//            "۫ۘۤ\n" +
//            "ۡ۬\n" +
//            "ۙۦۜ\n" +
//            "ۚ۟ۥۘ\n" +
//            "ۡۛۡ\n" +
//            "ۢۨۢ\n" +
//            "۫ۨۜۘ\n" +
//            "ۛۨۜ\n" +
//            "ۧۖۚ\n" +
//            "ۢ۫ۢ\n" +
//            "ۧ۬۬\n" +
//            "ۜۢۚ\n" +
//            "ۙۤۡۘ\n" +
//            "۬ۚۨۘ\n" +
//            "۫ۥ۬\n" +
//            "۠ۙۨۘ\n" +
//            "ۡۛۢ\n" +
//            "ۢۢۖۘ\n" +
//            "ۥ۟ۖ\n" +
//            "ۙۢۦ\n" +
//            "ۗ۫ۖ\n" +
//            "ۖۥۙ\n" +
//            "ۧۨۦۘ\n" +
//            "۫ۦۗ\n" +
//            "ۛ۟۫\n" +
//            "۫۫ۨۘ\n" +
//            "ۦۗۖ\n" +
//            "ۛۘۧۘ\n" +
//            "۟ۚۘ\n" +
//            "۫ۨۖۘ\n" +
//            "ۧۡۧ\n" +
//            "ۥۗۗ\n" +
//            "ۙۘۙ\n" +
//            "ۖۥ۫\n" +
//            "ۛۧۨۘ\n" +
//            "ۚۦۧ\n" +
//            "ۙۘۡۘ\n" +
//            "ۧ۬ۗ\n" +
//            "ۖۘۥ\n" +
//            "ۖۧۥ\n" +
//            "ۡۤۗ\n" +
//            "۬ۖ۠\n" +
//            "ۨۦۖۘ\n" +
//            "۟ۙۖۘ\n" +
//            "ۥ۫ۖۘ\n" +
//            "ۖۡ۟\n" +
//            "۟ۛۘۘ\n" +
//            "ۖۢ۠\n" +
//            "۬ۜۢ\n" +
//            "ۚ۠ۙ\n" +
//            "ۜۗۥۘ\n" +
//            "ۛۧ۠\n" +
//            "ۡۧۦ\n" +
//            "ۜۨۥۘ\n" +
//            "۟ۧۛ\n" +
//            "ۤ۟ۘ\n" +
//            "ۗۜۨۘ\n" +
//            "۬۫ۖ\n" +
//            "ۚۖۛ\n" +
//            "ۥۘۨ\n" +
//            "ۢۚۙ\n" +
//            "ۜۙ۬\n" +
//            "ۙۛ۠\n" +
//            "ۗۙۡ\n" +
//            "۬ۧۖ\n" +
//            "ۧۥۜۘ\n" +
//            "ۚۗۜۘ\n" +
//            "ۚۧۥ\n" +
//            "۠ۘۧ\n" +
//            "ۨۛۘۘ\n" +
//            "۬ۤۛ\n" +
//            "ۙ۫۬\n" +
//            "ۧۡۡۘ\n" +
//            "ۧۚۧ\n" +
//            "ۨ۫ۖۘ\n" +
//            "ۜۙۦۘ\n" +
//            "ۙۘۖۘ\n" +
//            "۟ۖۜ\n" +
//            "ۤۨۥۘ\n" +
//            "ۢۦۚ\n" +
//            "ۧۙۙ\n" +
//            "ۘۗۘ\n" +
//            "ۚۤۢ\n" +
//            "ۢۤۙ\n" +
//            "ۧۥ۠\n" +
//            "ۖۗۗ\n" +
//            "ۧۨۜ\n" +
//            "ۡۘۦۘ\n" +
//            "۠ۜ۠\n" +
//            "ۦۙۥۘ\n" +
//            "ۨۡۛ\n" +
//            "۬ۥۘۘ\n" +
//            "۠ۘۡ\n" +
//            "۬ۛۖۘ\n" +
//            "۬۟ۥ\n" +
//            "ۗۚۨۘ\n" +
//            "۠ۨ\n" +
//            "ۦ۠ۖ\n" +
//            "ۥۨۚ\n" +
//            "ۨۧۙ\n" +
//            "ۗۧۥۘ\n" +
//            "ۗ۫ۜۘ\n" +
//            "ۧۖۛ\n" +
//            "ۖۜۤ\n" +
//            "ۛۛۚ\n" +
//            "ۤۛۘ\n" +
//            "ۤۗ۫\n" +
//            "ۙ۟ۢ\n" +
//            "ۗۙ۟\n" +
//            "ۜۖۦۘ\n" +
//            "ۗ۠ۜۘ\n" +
//            "ۛ۟ۧ\n" +
//            "۫ۧۡۘ\n" +
//            "۬ۧ۟\n" +
//            "ۚۢۨ\n" +
//            "ۥۗ۠\n" +
//            "ۦۡۚ\n" +
//            "ۥۢۦ\n" +
//            "۟ۦۜۘ\n" +
//            "ۡۡۘۘ\n" +
//            "ۚۤۤ\n" +
//            "ۜۛۗ\n" +
//            "ۘۧۖۘ\n" +
//            "ۘۡۡ\n" +
//            "ۢۥ۫\n" +
//            "ۢۦۡ\n" +
//            "ۡ۬۬\n" +
//            "۟ۗ۠\n" +
//            "ۨ۟\n" +
//            "ۘۗۦ\n" +
//            "ۖۢ\n" +
//            "ۗ۠ۘۘ\n" +
//            "۟۠ۡۘ\n" +
//            "ۚۛۡ\n" +
//            "ۜۘۦۘ\n" +
//            "ۘۢۜۘ\n" +
//            "ۨۦۧۘ\n" +
//            "ۘۢۘۘ\n" +
//            "ۛۢۦ\n" +
//            "ۨۖۤ\n" +
//            "ۤۢۨۘ\n" +
//            "ۜۘ۟\n" +
//            "ۧۗ\n" +
//            "ۛ۬ۛ\n" +
//            "۠ۧۜ\n" +
//            "ۖۘ۟\n" +
//            "ۛۤ\n" +
//            "ۡۦۧۘ\n" +
//            "ۤۦۚ\n" +
//            "ۤۛ\n" +
//            "ۨۗ\n" +
//            "۬ۘ۟\n" +
//            "ۦۛۡۘ\n" +
//            "ۢ۫ۥ\n" +
//            "ۧۚۛ\n" +
//            "ۜۙۙ\n" +
//            "ۚۨ۬\n" +
//            "ۥۢۜۘ\n" +
//            "۬ۗۡۘ\n" +
//            "ۢۖ\n" +
//            "ۖ۬ۢ\n" +
//            "ۜۨۜۘ\n" +
//            "ۨۗۨۘ\n" +
//            "ۡ۟ۨ\n" +
//            "ۢۡۜ\n" +
//            "ۜ۬ۦ\n" +
//            "ۘۤ۫\n" +
//            "۠ۥۧ\n" +
//            "ۨۗ۠\n" +
//            "۠ۡ۟\n" +
//            "ۙۦۥۘ\n" +
//            "۫ۤ۬\n" +
//            "ۙۡۥ\n" +
//            "ۦۗۧ\n" +
//            "ۙۨۦ\n" +
//            "ۘۘۜۘ\n" +
//            "۠ۚۘ\n" +
//            "ۖۦۡ\n" +
//            "۬ۤۧ\n" +
//            "ۨ۠ۢ\n" +
//            "ۗۖۦۘ\n" +
//            "۬ۡ۠\n" +
//            "ۢۡۗ\n" +
//            "ۡۖۥ\n" +
//            "ۢۤ۬\n" +
//            "ۚۤۗ\n" +
//            "ۢ۫ۦۘ\n" +
//            "ۡ۠ۤ\n" +
//            "ۦۢۡ\n" +
//            "ۢۘۙ\n" +
//            "ۖ۠۟\n" +
//            "۟ۨۘۘ\n" +
//            "ۥۨۨۘ\n" +
//            "۫ۗۥۘ\n" +
//            "ۚۤ۠\n" +
//            "ۙ۫ۡ\n" +
//            "۬ۘۚ\n" +
//            "ۨۥۚ\n" +
//            "۫ۨۜ\n" +
//            "ۖۤۗ\n" +
//            "ۡۤۦۘ\n" +
//            "ۨۤۥ\n" +
//            "ۜۘۦ\n" +
//            "ۥ۠ۖۘ\n" +
//            "ۚۦۦۘ\n" +
//            "ۤۢ۬\n" +
//            "ۢۛۗ\n" +
//            "ۨۙۥۘ\n" +
//            "ۘۧۤ\n" +
//            "ۙۦۘ\n" +
//            "۠ۧۢ\n" +
//            "ۗۡۡ\n" +
//            "ۖ۫ۨ\n" +
//            "ۤۘ۠\n" +
//            "۟ۥۧ\n" +
//            "ۖۙۘ\n" +
//            "ۥۧۨۘ\n" +
//            "ۢۗۨ\n" +
//            "ۨ۬ۥۘ\n" +
//            "ۜۧۦۘ\n" +
//            "۟ۘۜۘ\n" +
//            "ۦۢ\n" +
//            "ۥۥۗ\n" +
//            "ۥۡۙ\n" +
//            "ۤۧۥ\n" +
//            "ۡۢۡ\n" +
//            "۬ۤۢ\n" +
//            "ۛۨ۠\n" +
//            "۬ۡ\n" +
//            "ۧۚ۟\n" +
//            "۫ۨ۬\n" +
//            "ۥ۠ۨۘ\n" +
//            "۫ۡۖ\n" +
//            "ۖۗۨ\n" +
//            "ۗۤۡ\n" +
//            "ۚۘۜ\n" +
//            "۠ۦۥۘ\n" +
//            "ۤۦۧۘ\n" +
//            "ۚۦۨۘ\n" +
//            "ۢۙۦۘ\n" +
//            "ۚۙۙ\n" +
//            "ۥ۫ۦ\n" +
//            "ۗ۬ۘ\n" +
//            "ۗۤۜ\n" +
//            "ۘۛۘۘ\n" +
//            "ۤۙۡۘ\n" +
//            "۠ۜۘ\n" +
//            "ۜ۫۫\n" +
//            "۫ۡۥۘ\n" +
//            "ۡۨۖ\n" +
//            "ۜۨۘۘ\n" +
//            "۫ۗۜ\n" +
//            "ۗ۬ۗ\n" +
//            "ۗۘۗ\n" +
//            "۫ۚۥ\n" +
//            "ۛۗۡ\n" +
//            "۫ۗ۬\n" +
//            "ۧۘۖۘ\n" +
//            "ۦۤۥۘ\n" +
//            "ۗ۬۠\n" +
//            "ۚۡۡۘ\n" +
//            "ۨۤۡ\n" +
//            "۬۠\n" +
//            "ۘ۫ۥ\n" +
//            "۟ۖ۠\n" +
//            "ۦۜ\n" +
//            "ۤۙۦۘ\n" +
//            "ۖۛۨۘ\n" +
//            "ۘۜۧۘ\n" +
//            "ۧۡۢ\n" +
//            "ۙۡ۠\n" +
//            "ۡۧۚ\n" +
//            "ۢۥ۟\n" +
//            "ۦۥ۟\n" +
//            "ۡۡۥ\n" +
//            "ۗۛۗ\n" +
//            "ۘ۫ۘۘ\n" +
//            "ۙۛ۫\n" +
//            "ۨۗ۟\n" +
//            "ۡ۫ۥۘ\n" +
//            "۬۠۠\n" +
//            "۠۟ۥ\n" +
//            "۬ۖۙ\n" +
//            "ۛۦۚ\n" +
//            "ۘۨۜۘ\n" +
//            "ۦ۟ۡۘ\n" +
//            "ۦ۬ۛ\n" +
//            "ۧ۬ۖۘ\n" +
//            "ۡ۫۟\n" +
//            "۠ۗۙ\n" +
//            "ۙ۬ۚ\n" +
//            "ۘۦۧ\n" +
//            "۟ۙ۠\n" +
//            "ۨۖۥۘ\n" +
//            "ۦۥۥ\n" +
//            "ۚۗۖۘ\n" +
//            "ۛۙۨ\n" +
//            "ۜۜۖۘ\n" +
//            "ۗۙۦ\n" +
//            "۟ۜۢ\n" +
//            "ۢۘ۬\n" +
//            "ۧ۬۟\n" +
//            "۬ۨۨۘ\n" +
//            "ۜ۠ۘۘ\n" +
//            "۠ۜۗ\n" +
//            "ۧ۠۬\n" +
//            "۠ۨۡ\n" +
//            "ۢۢۡ\n" +
//            "۬ۨۗ\n" +
//            "ۨۥۦۘ\n" +
//            "ۡۜۨۘ\n" +
//            "ۤۧۡ\n" +
//            "ۖۨۧۘ\n" +
//            "ۗۥۘ\n" +
//            "ۥ۫ۖ\n" +
//            "ۚۥۜ\n" +
//            "ۛۥۖ\n" +
//            "۬ۢ۠\n" +
//            "۬ۖۜ\n" +
//            "ۘۡۧ\n" +
//            "۫ۥۜ\n" +
//            "۬ۢۢ\n" +
//            "ۜۡۗ\n" +
//            "ۤۛۜ\n" +
//            "ۘۚۥۘ\n" +
//            "ۦۥۢ\n" +
//            "ۡۨۖۘ\n" +
//            "۟۟\n" +
//            "۟ۡۧۘ\n" +
//            "ۤ۬ۛ\n" +
//            "ۥۛ\n" +
//            "ۗۚۜ\n" +
//            "۬۟ۖ\n" +
//            "ۡۙۛ\n" +
//            "ۗۡۡۘ\n" +
//            "ۧۨۥ\n" +
//            "ۚۗ۠\n" +
//            "۬ۜۦۘ\n" +
//            "۬ۘ۠\n" +
//            "۬ۘۦ\n" +
//            "۠ۛۜ\n" +
//            "ۛۜۨۘ\n" +
//            "ۢۤۥۘ\n" +
//            "ۙ۟۟\n" +
//            "ۗۗۚ\n" +
//            "ۦۡۜۘ\n" +
//            "ۨۢۧ\n" +
//            "ۤۨۡۘ\n" +
//            "ۧۜ۫\n" +
//            "ۡۚۡ\n" +
//            "ۗۜ۬\n" +
//            "۫۬ۤ\n" +
//            "ۥۖ\n" +
//            "۫ۦۖۘ\n" +
//            "۟ۙۚ\n" +
//            "ۥ۟ۛ\n" +
//            "ۗۥۜۘ\n" +
//            "ۦۘۨ\n" +
//            "ۙۜ۫\n" +
//            "ۖۤۨۘ\n" +
//            "۠۠ۨۘ\n" +
//            "۬ۦۡۘ\n" +
//            "ۘۛۤ\n" +
//            "ۚۧ۬\n" +
//            "ۡۤۨۘ\n" +
//            "ۜۡۡ\n" +
//            "ۖۢ۫\n" +
//            "ۢۖۧۘ\n" +
//            "ۨۙۙ\n" +
//            "ۧۢۘ\n" +
//            "ۧۢۧ\n" +
//            "ۙ۫ۨۘ\n" +
//            "ۦۤۜ\n" +
//            "۠ۤ۫\n" +
//            "۬ۖۘ\n" +
//            "ۜۦۗ\n" +
//            "ۚۚۘۘ\n" +
//            "ۤۘۨ\n" +
//            "ۥۖۖ\n" +
//            "ۜۛۘۘ\n" +
//            "۠۟ۨ\n" +
//            "ۢۜۜۘ\n" +
//            "ۧ۫ۤ\n" +
//            "۫۟ۥۘ\n" +
//            "۟ۦۜ\n" +
//            "ۖۨۘ\n" +
//            "۠ۘۚ\n" +
//            "۬ۥ۟\n" +
//            "ۢ۫ۘ\n" +
//            "ۙۧ۠\n" +
//            "۟ۧۢ\n" +
//            "ۡۗۘۘ\n" +
//            "ۨۡۦ\n" +
//            "ۧ۬ۘ\n" +
//            "۫ۦۥ\n" +
//            "ۗ۟ۧ\n" +
//            "ۦ۬ۙ\n" +
//            "ۙۢۧ\n" +
//            "ۘۘۙ\n" +
//            "ۤۦۜۘ\n" +
//            "ۤۤۖۘ\n" +
//            "ۢۘۡۘ\n" +
//            "۫ۧۥ\n" +
//            "ۙۧۛ\n" +
//            "ۜۗۨ\n" +
//            "ۦۙۜۘ\n" +
//            "ۚۚۨ\n" +
//            "ۧ۟ۧ\n" +
//            "ۘۚۖۘ\n" +
//            "۠۬ۦۘ\n" +
//            "ۢۡۨۘ\n" +
//            "ۙۜ\n" +
//            "ۜۡۘ\n" +
//            "ۥۢۡۘ\n" +
//            "ۘۨۤ\n" +
//            "ۙۛۡ\n" +
//            "ۗۨ\n" +
//            "ۦۢ۠\n" +
//            "ۦۚ۬\n" +
//            "۬ۙۥۘ\n" +
//            "ۘۖۧۘ\n" +
//            "ۜۜۦۘ\n" +
//            "ۙۖ\n" +
//            "ۥۘۧ\n" +
//            "ۛۨ۫\n" +
//            "ۤۜۘ\n" +
//            "۬۫ۡۘ\n" +
//            "ۥۤۡۘ\n" +
//            "ۦۥۧ\n" +
//            "۠۫ۨۘ\n" +
//            "۬ۨ\n" +
//            "ۢ۫ۚ\n" +
//            "ۜۗ\n" +
//            "۟۠ۖ\n" +
//            "۟ۥۧۘ\n" +
//            "ۤۘۙ\n" +
//            "ۗۨۨ\n" +
//            "ۘ۫ۥۘ\n" +
//            "۫ۜۗ\n" +
//            "۠ۚۨۘ\n" +
//            "ۢۛۖ\n" +
//            "ۧ۫\n" +
//            "۬۫ۨۘ\n" +
//            "ۥۗۨۘ\n" +
//            "۬ۚ۠\n" +
//            "ۧۜۙ\n" +
//            "ۚۘۨۘ\n" +
//            "۟ۢۢ\n" +
//            "ۢ۬ۥ\n" +
//            "ۥۜۖ\n" +
//            "ۙۢۨ\n" +
//            "ۢۜ\n" +
//            "۟۬ۦۘ\n" +
//            "ۨۜۗ\n" +
//            "ۦۧ۬\n" +
//            "ۤۙۤ\n" +
//            "ۚ۟\n" +
//            "۬ۡۨۘ\n" +
//            "ۤۛۧ\n" +
//            "۫ۦۜ\n" +
//            "ۘۙۘ\n" +
//            "ۗۢ۠\n" +
//            "۠ۛۨۘ\n" +
//            "ۨ۠ۦ\n" +
//            "۬۠ۥۘ\n" +
//            "ۛۧۥ\n" +
//            "ۨۘۡ\n" +
//            "۠۬ۘۘ\n" +
//            "ۚۨۚ\n" +
//            "ۖۚۘۘ\n" +
//            "ۢۗ۬\n" +
//            "ۦۧ۫\n" +
//            "ۢۙ۬\n" +
//            "ۦۡۗ\n" +
//            "ۛۗۦ\n" +
//            "ۥ۟ۤ\n" +
//            "ۢۨۡ\n" +
//            "۠ۖۘ\n" +
//            "ۗۡۙ\n" +
//            "ۚۤۨ\n" +
//            "ۤۛ۬\n" +
//            "ۧۥۖ\n" +
//            "ۡ۟۟\n" +
//            "ۤۜ\n" +
//            "۠ۡۘۘ\n" +
//            "ۛۧ۟\n" +
//            "ۘ۠ۜۘ\n" +
//            "ۡ۫ۡۘ\n" +
//            "۬ۨۢ\n" +
//            "ۚ۟ۨۘ\n" +
//            "ۡۨ۠\n" +
//            "ۡۨۚ\n" +
//            "ۤۧ۠\n" +
//            "۬ۨۘۘ\n" +
//            "ۜ۟ۡۘ\n" +
//            "ۨۛۙ\n" +
//            "ۧ۟ۥۘ\n" +
//            "ۜ۫ۖۘ\n" +
//            "۫۫۟\n" +
//            "۟ۨۗ\n" +
//            "۫ۥۘ\n" +
//            "۟ۢ\n" +
//            "۠ۗۧ\n" +
//            "ۥ۬ۖ\n" +
//            "ۚ۟ۜۘ\n" +
//            "۟ۢۡ\n" +
//            "ۚ۫ۨۘ\n" +
//            "ۛۗ۟\n" +
//            "۬ۘ۫\n" +
//            "ۗۡ\n" +
//            "ۥ۟ۡ\n" +
//            "۟ۖۘۘ\n" +
//            "ۚۤۧ\n" +
//            "ۗۢۡ\n" +
//            "۠ۧۤ\n" +
//            "ۚۗۥ\n" +
//            "ۙ۠ۘ\n" +
//            "ۜۗۜۘ\n" +
//            "ۛۖۘۘ\n" +
//            "ۚۚۛ\n" +
//            "ۡ۫ۤ\n" +
//            "ۢۧۚ\n" +
//            "ۦۥ۬\n" +
//            "ۨۛ\n" +
//            "ۛۦۦۘ\n" +
//            "۠ۘۨ\n" +
//            "ۚ۠ۖۘ\n" +
//            "ۙۙۡۘ\n" +
//            "ۡۤۢ\n" +
//            "ۗۥۜ\n" +
//            "ۦۖۦ\n" +
//            "۠ۤ۬\n" +
//            "ۥۖۜ\n" +
//            "ۤ۟ۘۘ\n" +
//            "۠ۨۘۘ\n" +
//            "ۚۖۜۘ\n" +
//            "ۢۜۨۘ\n" +
//            "ۜۘۖ\n" +
//            "ۡۖۦۘ\n" +
//            "ۢ۬ۤ\n" +
//            "ۧ\n" +
//            "ۙ۬ۢ\n" +
//            "ۗۖۚ\n" +
//            "ۗۥۘۘ\n" +
//            "۬ۚۘ\n" +
//            "ۦ۠۬\n" +
//            "ۖ۬ۡ\n" +
//            "۫ۛۥۘ\n" +
//            "ۨۢ۫\n" +
//            "ۤۥۘ\n" +
//            "۟ۗۡۘ\n" +
//            "ۖۦۦ\n" +
//            "ۛ۫ۙ\n" +
//            "ۤۜۡ\n" +
//            "۫ۧۥۘ\n" +
//            "ۙۨۜ\n" +
//            "ۙ۠ۚ\n" +
//            "۬ۥۧ\n" +
//            "ۦۤۘۘ\n" +
//            "ۖۙ۬\n" +
//            "ۦۙۤ\n" +
//            "ۧ۫ۛ\n" +
//            "ۛۢۘ\n" +
//            "ۥۤۘۘ\n" +
//            "ۖۗ۠\n" +
//            "ۤ۟ۖ\n" +
//            "۟ۗ\n" +
//            "ۢ۫ۡ\n" +
//            "ۜۦۡۘ\n" +
//            "ۜ۟ۦۘ\n" +
//            "ۗۗۨۘ\n" +
//            "ۚۗۧ\n" +
//            "ۛ۫ۦۘ\n" +
//            "۬۠ۡۘ\n" +
//            "ۧ۠ۤ\n" +
//            "ۗۢۘۘ\n" +
//            "ۡۙ\n" +
//            "ۧۧۨۘ\n" +
//            "ۨۧۧ\n" +
//            "ۚۥۛ\n" +
//            "ۗۘۨ\n" +
//            "ۚۤۥۘ\n" +
//            "ۨۘ۫\n" +
//            "ۚ۫ۜۘ\n" +
//            "ۡۖ۟\n" +
//            "ۤ۟ۨ\n" +
//            "ۡۗ۫\n" +
//            "ۨۘۥۘ\n" +
//            "ۖ۬۠\n" +
//            "۬ۜۙ\n" +
//            "ۙۛۚ\n" +
//            "ۖۤۖۘ\n" +
//            "ۚۛۨۘ\n" +
//            "۫ۛۨ\n" +
//            "ۛۚۘۘ\n" +
//            "ۨۘۖ\n" +
//            "ۡۡۨۘ\n" +
//            "ۖۙ۫\n" +
//            "ۜۧۥ\n" +
//            "ۘ۬ۧ\n" +
//            "ۙۧۥ\n" +
//            "ۧ۬\n" +
//            "ۙۦۧ\n" +
//            "۠ۖۦ\n" +
//            "ۧۖۧۘ\n" +
//            "ۢ۟ۦ\n" +
//            "ۖۧۘۘ\n" +
//            "ۢۥۡۘ\n" +
//            "۫ۧۦۘ\n" +
//            "ۦ۟ۙ\n" +
//            "ۜۡۙ\n" +
//            "ۜ\n" +
//            "ۤۨ۠\n" +
//            "۟ۥ۟\n" +
//            "۟ۖۙ\n" +
//            "ۡۥۖۘ\n" +
//            "ۛۡۤ\n" +
//            "ۙۦۗ\n" +
//            "ۢۢۨۘ\n" +
//            "ۡۥ۫\n" +
//            "۠ۦ۫\n" +
//            "۬ۖۤ\n" +
//            "۬۠ۘۘ\n" +
//            "۠ۚۨ\n" +
//            "ۜۘۜ\n" +
//            "ۨۖ۬\n" +
//            "ۖۙۛ\n" +
//            "۠ۛۧ\n" +
//            "ۢۢ۫\n" +
//            "ۨۛۨ\n" +
//            "ۘ۠ۤ\n" +
//            "۟ۥۜۘ\n" +
//            "ۧۥ\n" +
//            "ۛۡۡ\n" +
//            "۠۠۬\n" +
//            "ۦۜ۟\n" +
//            "ۘۜۡ\n" +
//            "ۘۙ\n" +
//            "۠ۚۦۘ\n" +
//            "ۧ۠ۖۘ\n" +
//            "ۤۡۦۘ\n" +
//            "۬ۖۦۘ\n" +
//            "ۥۖۥۘ\n" +
//            "ۥ۠ۦۘ\n" +
//            "ۗ۫ۤ\n" +
//            "ۛ۟ۡۘ\n" +
//            "ۡۡۘ\n" +
//            "ۛۘۚ\n" +
//            "ۧۜۗ\n" +
//            "ۨۘۗ\n" +
//            "ۦۗۡ\n" +
//            "ۖۗۖۘ\n" +
//            "ۢ۬ۚ\n" +
//            "ۥۢ\n" +
//            "ۖۜ۫\n" +
//            "ۥۜۨۘ\n" +
//            "ۧۗۖ\n" +
//            "ۚ۠ۛ\n" +
//            "۟۟ۜ\n" +
//            "ۨۚ۬\n" +
//            "۠۟ۘۘ\n" +
//            "۬ۨۧۘ\n" +
//            "ۗۧۖۘ\n" +
//            "ۤ۬ۨ\n" +
//            "ۨۛۜۘ\n" +
//            "ۚۤ۬\n" +
//            "ۙ۬ۘۘ\n" +
//            "۠ۙۘ\n" +
//            "ۦ۟ۜۘ\n" +
//            "۟۬ۤ\n" +
//            "ۧۗۖۘ\n" +
//            "ۜ۟ۚ\n" +
//            "۫ۡۜ\n" +
//            "ۗۚ۬\n" +
//            "ۙۥۜ\n" +
//            "ۘۙۖ\n" +
//            "۫ۦۢ\n" +
//            "ۘۢۘ\n" +
//            "۬۟ۘ\n" +
//            "ۘ۬ۨۘ\n" +
//            "ۜۘۨ\n" +
//            "۫ۙۥ\n" +
//            "۬ۧۡ\n" +
//            "ۢۖۡ\n" +
//            "ۚۥۨۘ\n" +
//            "ۥۘۧۘ\n" +
//            "ۨۤ۟\n" +
//            "ۧۛۘۘ\n" +
//            "ۛۛۜ\n" +
//            "ۢ۠ۘۘ\n" +
//            "ۥ۠ۥۘ\n" +
//            "۫۟۠\n" +
//            "ۙۦۘۘ\n" +
//            "۫ۛۙ\n" +
//            "ۙ۠۫\n" +
//            "ۥۡۥۘ\n" +
//            "ۜ۟ۗ\n" +
//            "ۘۢ\n" +
//            "ۙۡ۫\n" +
//            "ۥۥۖ\n" +
//            "۠ۦۚ\n" +
//            "ۜۥ۫\n" +
//            "۫ۤۖ\n" +
//            "ۤ۬ۗ\n" +
//            "ۦۦۘ\n" +
//            "ۖۡۢ\n" +
//            "ۤۖۛ\n" +
//            "ۛ۠ۨۘ\n" +
//            "۟ۤۡۘ\n" +
//            "ۚۡۢ\n" +
//            "ۥۡۥ\n" +
//            "ۢ۠ۗ\n" +
//            "ۨۛۡۘ\n" +
//            "ۨۨۨ\n" +
//            "ۖۜۦۘ\n" +
//            "ۘۗۙ\n" +
//            "ۨ۫ۜۘ\n" +
//            "ۚۘ۫\n" +
//            "ۨ۠ۥۘ\n" +
//            "ۛۙۦ\n" +
//            "ۦۛۙ\n" +
//            "ۛۙۥۘ\n" +
//            "ۤۥۜ\n" +
//            "ۛۖۥۘ\n" +
//            "ۧۙ۟\n" +
//            "ۙۖۖۘ\n" +
//            "ۖۨ۫\n" +
//            "ۖۧۙ\n" +
//            "ۛۘۖ\n" +
//            "ۚ۟ۡۘ\n" +
//            "ۘۖۨ\n" +
//            "ۢ۟ۖ\n" +
//            "ۖۜ\n" +
//            "ۤۚۨ\n" +
//            "ۨ۠ۙ\n" +
//            "ۡۧۡۘ\n" +
//            "ۗۛۖ\n" +
//            "ۘۢۧ\n" +
//            "ۘۥۜ\n" +
//            "ۛۦۖۘ\n" +
//            "ۖۛۘ\n" +
//            "ۙۥۘۘ\n" +
//            "۬ۖۡۘ\n" +
//            "۬ۛۘ\n" +
//            "ۦۨۜ\n" +
//            "ۦۤۦ\n" +
//            "ۗۧ۫\n" +
//            "ۢۢۗ\n" +
//            "ۢۥۦۘ\n" +
//            "۠۬ۦ\n" +
//            "ۤۢۗ\n" +
//            "ۦ۬ۜ\n" +
//            "ۦۤۡۘ\n" +
//            "ۥۨۧۘ\n" +
//            "ۖۦۘ\n" +
//            "۬ۜۦ\n" +
//            "ۧۧۤ\n" +
//            "ۘ۟\n" +
//            "ۖۛۦۘ\n" +
//            "ۙۡۜۘ\n" +
//            "ۜۢۜۘ\n" +
//            "ۤ۠۫\n" +
//            "ۖ۟۬\n" +
//            "۠ۥۜ\n" +
//            "ۨ۠ۧ\n" +
//            "ۖۙۦۘ\n" +
//            "ۢ\n" +
//            "ۖۜۗ\n" +
//            "ۖۛۜۘ\n" +
//            "ۙۥۦ\n" +
//            "۠ۚ۫\n" +
//            "ۙۤ۟\n" +
//            "ۙۖۗ\n" +
//            "ۦۙۘۘ\n" +
//            "ۦ۫۬\n" +
//            "ۗۡۘۘ\n" +
//            "ۤ۠ۦۘ\n" +
//            "۠ۙۘۘ\n" +
//            "ۖۙ۟\n" +
//            "ۛۧۜ\n" +
//            "۬ۡ۫\n" +
//            "ۡۚ\n" +
//            "ۢۧۨ\n" +
//            "ۖۨۥۘ\n" +
//            "ۨۤۧ\n" +
//            "ۤۗۦۘ\n" +
//            "ۦۦ\n" +
//            "ۖۜۥ\n" +
//            "ۥۛۘۘ\n" +
//            "ۗۧ۠\n" +
//            "ۡۙۡۘ\n" +
//            "ۖۡۚ\n" +
//            "ۢۢۡۘ\n" +
//            "ۡۧۤ\n" +
//            "۟ۙ۫\n" +
//            "ۡۖۨۘ\n" +
//            "ۦۜۨ\n" +
//            "ۢ۫ۡۘ\n" +
//            "۬ۢۜ\n" +
//            "ۥۤۧ\n" +
//            "۠۬ۙ\n" +
//            "۟ۤۜ\n" +
//            "ۚۜۧۘ\n" +
//            "ۜۨۖۘ\n" +
//            "ۛۗۘۘ\n" +
//            "ۤۙۥۘ\n" +
//            "۫ۙۜۘ\n" +
//            "۟ۜۗ\n" +
//            "ۛۚۛ\n" +
//            "۫ۨۢ\n" +
//            "۟ۘۖ\n" +
//            "ۚۧۚ\n" +
//            "ۛۧۙ\n" +
//            "ۤۧۨۘ\n" +
//            "ۨۛ۠\n" +
//            "ۥۧۥ\n" +
//            "۫۫ۜۘ\n" +
//            "ۗۡ۠\n" +
//            "ۦۖۥ\n" +
//            "۠ۗۥۘ\n" +
//            "ۘۡ۫\n" +
//            "ۗۤۢ\n" +
//            "ۙۡۡۘ\n" +
//            "ۢ۬ۦۘ\n" +
//            "ۤۨۤ\n" +
//            "ۙۨۖ\n" +
//            "ۗ۫ۦۘ\n" +
//            "۫۟ۡ\n" +
//            "۫ۗۡۘ\n" +
//            "۬ۥۙ\n" +
//            "ۜۘۜۘ\n" +
//            "ۘ۠ۚ\n" +
//            "ۢۗۡ\n" +
//            "۫ۨۦ\n" +
//            "ۙۖ۬\n" +
//            "ۡۢۢ\n" +
//            "ۦۙۨۘ\n" +
//            "ۖۚۦۘ\n" +
//            "ۗۡۥۘ\n" +
//            "ۢۦۧ\n" +
//            "ۤۥۥۘ\n" +
//            "۫ۨۦۘ\n" +
//            "ۘ۠ۦ\n" +
//            "ۘ۬ۘۘ\n" +
//            "ۚۨۡۘ\n" +
//            "ۜۖۨۘ\n" +
//            "ۤۖۤ\n" +
//            "ۚۦۜۘ\n" +
//            "ۤۧۘۘ\n" +
//            "ۨ۬ۤ\n" +
//            "ۨۖۜ\n" +
//            "ۜۥ۠\n" +
//            "ۤۚۛ\n" +
//            "ۘۘۘۘ\n" +
//            "۟ۘۡۘ\n" +
//            "۟ۗ۫\n" +
//            "۫ۡ۫\n" +
//            "ۗۧۨۘ\n" +
//            "ۥۢۘ\n" +
//            "ۧۜ۠\n" +
//            "ۦۨۘۘ\n" +
//            "ۢۜۦۘ\n" +
//            "۟ۥ۠\n" +
//            "۫ۙۗ\n" +
//            "ۡۜۘ\n" +
//            "ۚۗۨۘ\n" +
//            "ۦۖۥۘ\n" +
//            "ۤۚۗ\n" +
//            "ۜۢۡۘ\n" +
//            "ۡۨۢ\n" +
//            "ۗۤۦ\n" +
//            "ۥۖۧۘ\n" +
//            "۠ۙۜۘ\n" +
//            "۠ۧۘ\n" +
//            "۬ۧۦ\n" +
//            "ۚۚۧ\n" +
//            "ۘۙۡ\n" +
//            "۫ۦۦۘ\n" +
//            "ۚۙۥۘ\n" +
//            "۠۫۫\n" +
//            "ۥۙۡ\n" +
//            "۬ۘۥۘ\n" +
//            "ۧ۫ۜۘ\n" +
//            "ۚۡ۟\n" +
//            "ۥۤۖۘ\n" +
//            "ۨۘۛ\n" +
//            "۬ۤۦ\n" +
//            "ۚۡۦۘ\n" +
//            "ۨۤۙ\n" +
//            "۠ۤۗ\n" +
//            "ۨۚۖۘ\n" +
//            "۠ۜۚ\n" +
//            "ۨۥۜۘ\n" +
//            "ۤۨۜۘ\n" +
//            "۬۟ۨ\n" +
//            "ۤ۠ۥ\n" +
//            "ۘ۬ۖۘ\n" +
//            "ۖۖۜ\n" +
//            "ۧۘۦ\n" +
//            "ۤۘ۬\n" +
//            "ۨۢ۬\n" +
//            "ۛ۠ۖ\n" +
//            "ۤ۟ۜۘ\n" +
//            "ۥ۬ۖۘ\n" +
//            "۠ۥۤ\n" +
//            "ۥۦۨۘ\n" +
//            "ۖ\n" +
//            "ۤ۠۟\n" +
//            "ۛۚۥۘ\n" +
//            "ۤۛۥۘ\n" +
//            "ۡۖ۫\n" +
//            "ۗ۫ۨ\n" +
//            "۠ۦۦۘ\n" +
//            "۬ۦۜ\n" +
//            "ۡۤۜ\n" +
//            "ۥۘ۠\n" +
//            "ۨ۫\n" +
//            "ۛ۫ۘ\n" +
//            "ۧ۫ۚ\n" +
//            "ۢۥۜ\n" +
//            "ۡۘۥ\n" +
//            "ۖۧ۫\n" +
//            "ۤ۬ۘۘ\n" +
//            "۠ۥ۫\n" +
//            "ۖۛۢ\n" +
//            "ۘۥۡ\n" +
//            "ۙۨۡ\n" +
//            "ۛ۟ۛ\n" +
//            "ۘۢۗ\n" +
//            "ۨۚ۟\n" +
//            "ۙۧ۟\n" +
//            "ۨۢۡۘ\n" +
//            "ۢۖۦ\n" +
//            "۟ۥۛ\n" +
//            "۠ۡۜ\n" +
//            "ۤۧۦۘ\n" +
//            "ۚۧۡۘ\n" +
//            "ۖۗۙ\n" +
//            "ۜۥۡۘ\n" +
//            "ۛۙۢ\n" +
//            "ۤۧۖ\n" +
//            "ۛ۫ۤ\n" +
//            "ۙۙۜۘ\n" +
//            "۠ۙۤ\n" +
//            "۬ۘۥ\n" +
//            "ۧۜۡۘ\n" +
//            "ۗۡۖۘ\n" +
//            "ۥۚۚ\n" +
//            "ۦۗۙ\n" +
//            "ۡۘ۠\n" +
//            "ۙۨۚ\n" +
//            "ۗ۟ۥۘ\n" +
//            "ۛۘ۟\n" +
//            "ۥ۠۫\n" +
//            "۟۬۬\n" +
//            "۠۟ۚ\n" +
//            "ۚۢۦۘ\n" +
//            "ۛۜۡۘ\n" +
//            "ۜۦۘۘ\n" +
//            "ۦۧۜ\n" +
//            "ۧۖۡ\n" +
//            "ۦۧۥ\n" +
//            "۫۫ۥ\n" +
//            "ۨۦۥ\n" +
//            "ۙۙۚ\n" +
//            "ۢ۟ۥ\n" +
//            "ۧۚۨۘ\n" +
//            "ۘۛۥۘ\n" +
//            "ۥۗ۟\n" +
//            "ۦۘۜ\n" +
//            "ۗۘۚ\n" +
//            "ۗۡۘ\n" +
//            "ۥ۫ۦۘ\n" +
//            "ۛۛۤ\n" +
//            "ۡ۟ۥ\n" +
//            "۟۟ۦۘ\n" +
//            "ۚۙۘ\n" +
//            "۟ۚۥ\n" +
//            "ۜۚۖۘ\n" +
//            "ۤ۟ۗ\n" +
//            "۠ۘۗ\n" +
//            "ۥۙۖۘ\n" +
//            "ۙۛۦۘ\n" +
//            "ۖۥۤ\n" +
//            "ۦ۠ۡ\n" +
//            "ۤۛۨۘ\n" +
//            "ۘۢۛ\n" +
//            "ۤۨۧۘ\n" +
//            "ۧۦۢ\n" +
//            "ۧۦۡۘ\n" +
//            "ۚۜۙ\n" +
//            "ۛۨۤ\n" +
//            "۫۟ۖ\n" +
//            "ۨ۟ۦۘ\n" +
//            "ۦۘۦۘ\n" +
//            "ۜۦ۠\n" +
//            "ۖۢۖۘ\n" +
//            "ۢۛۘۘ\n" +
//            "ۖۡۦۘ\n" +
//            "ۢۦۘۘ\n" +
//            "۠ۢۡۘ\n" +
//            "ۜۡۡۘ\n" +
//            "ۦۦۥ\n" +
//            "ۗۨۘۘ\n" +
//            "ۨ۠ۨ\n" +
//            "۫ۡۤ\n" +
//            "۟۬ۡ\n" +
//            "ۢۛۙ\n" +
//            "۫ۖۖ\n" +
//            "ۧۤ۠\n" +
//            "۬ۚۨ\n" +
//            "۠۟۠\n" +
//            "ۢۖ۠\n" +
//            "ۘۥۢ\n" +
//            "ۚ۟ۜ\n" +
//            "ۧ۟\n" +
//            "ۘۚ۠\n" +
//            "ۢۧۡۘ\n" +
//            "ۢ۫ۗ\n" +
//            "ۨۨۥ\n" +
//            "ۨۜۜۘ\n" +
//            "ۗۙۢ\n" +
//            "۠ۛۡۘ\n" +
//            "ۤۧ۫\n" +
//            "ۘۤۖ\n" +
//            "ۡۗۜۘ\n" +
//            "ۡۜۦ\n" +
//            "۟ۛ۟\n" +
//            "ۡۘ\n" +
//            "ۦۛۡ\n" +
//            "ۖۗۛ\n" +
//            "ۗ۬ۛ\n" +
//            "۟ۨ۟\n" +
//            "۟ۗۖۘ\n" +
//            "ۢۨۡۘ\n" +
//            "ۛ۟ۖۘ\n" +
//            "ۜ۟ۢ\n" +
//            "۫ۡۖۘ\n" +
//            "ۡۦۜ\n" +
//            "ۨۢۨۘ\n" +
//            "۠۟ۖ\n" +
//            "۬ۨۜ\n" +
//            "ۖ۟ۖ\n" +
//            "۟۠ۢ\n" +
//            "ۖۨۜۘ\n" +
//            "ۧۖۦ\n" +
//            "ۙۜۜۘ\n" +
//            "ۛۘ۠\n" +
//            "۟ۥۦ\n" +
//            "ۦۢۥ\n" +
//            "ۗ۬ۦۘ\n" +
//            "ۦۘۖ\n" +
//            "ۧ۟ۡ\n" +
//            "۠ۨۦۘ\n" +
//            "ۛۧۗ\n" +
//            "ۦۗ۟\n" +
//            "ۙۥ۠\n" +
//            "ۡۤۖ\n" +
//            "ۜ۠ۜ\n" +
//            "ۥۨۢ\n" +
//            "ۨ۟ۡۘ\n" +
//            "ۦ۬ۡۘ\n" +
//            "ۤۛۥ\n" +
//            "ۦ۠ۨ\n" +
//            "۠ۗ۬\n" +
//            "۫ۗۧ\n" +
//            "ۘۜۘۘ\n" +
//            "ۚۛ۟\n" +
//            "ۚۡ۫\n" +
//            "ۦۦۢ\n" +
//            "ۥۦ\n" +
//            "ۨۙۖ\n" +
//            "ۧ۟ۦ\n" +
//            "۟ۙۨ\n" +
//            "ۚۗ\n" +
//            "۠۫۬\n" +
//            "ۛۖۙ\n" +
//            "ۦۖ\n" +
//            "۬ۧۛ\n" +
//            "ۦۦۦ\n" +
//            "۟ۜۖۘ\n" +
//            "ۡۖۥۘ\n" +
//            "۠ۖۗ\n" +
//            "ۢۢۢ\n" +
//            "ۘ۟۫\n" +
//            "ۖۧۗ\n" +
//            "ۙ۫ۜۘ\n" +
//            "ۗ۟۠\n" +
//            "ۤ۫ۨ\n" +
//            "ۖۜۥۘ\n" +
//            "ۖۦ۠\n" +
//            "ۡ۫ۘ\n" +
//            "ۡۦۧ\n" +
//            "ۛۜۤ\n" +
//            "۬ۚۜ\n" +
//            "ۘۨ۫\n" +
//            "ۗۤۗ\n" +
//            "۟ۚۗ\n" +
//            "ۢۚ۟\n" +
//            "۫ۧۖۘ\n" +
//            "ۛۢۚ\n" +
//            "ۜ۟ۥۘ\n" +
//            "۠ۙ۬\n" +
//            "ۘۚۦ\n" +
//            "ۢۢۛ\n" +
//            "ۢۜۢ\n" +
//            "ۗۜۦۘ\n" +
//            "ۜ۟ۥ\n" +
//            "ۛۙۥ\n" +
//            "ۦۚۨۘ\n" +
//            "۟ۧ۠\n" +
//            "ۨۤ۫\n" +
//            "ۧ۫ۧ\n" +
//            "ۢۖۖ\n" +
//            "۟ۤۖ\n" +
//            "ۧۨۜۘ\n" +
//            "ۖۡۨ\n" +
//            "۟۠\n" +
//            "۫ۗۥ\n" +
//            "ۨۢۦۘ\n" +
//            "ۨۙ۠\n" +
//            "ۥۥۘ\n" +
//            "ۡ۬ۖۘ\n" +
//            "ۜۚۛ\n" +
//            "ۥۤۨۘ\n" +
//            "ۖۜۛ\n" +
//            "ۘ۫ۨۘ\n" +
//            "ۨ۬۟\n" +
//            "ۛۚۦ\n" +
//            "ۦۘ\n" +
//            "ۗۜۘ\n" +
//            "۬ۖۜۘ\n" +
//            "ۗۘۛ\n" +
//            "ۛۢ\n" +
//            "ۘ۟ۙ\n" +
//            "ۤۖۢ\n" +
//            "ۦۡۜ\n" +
//            "ۜۥۥ\n" +
//            "ۦۦۘۘ\n" +
//            "ۧۧۖ\n" +
//            "ۥۘۜ\n" +
//            "ۜ۫ۨ\n" +
//            "۫ۚۘۘ\n" +
//            "ۡۥۖ\n" +
//            "ۜۥ۟\n" +
//            "ۥۨۥۘ\n" +
//            "ۜۖۤ\n" +
//            "۟ۖۗ\n" +
//            "۠۫۠\n" +
//            "ۛۢۘۘ\n" +
//            "۠ۦۥ\n" +
//            "۫۠ۜۘ\n" +
//            "ۡ۬ۡ\n" +
//            "ۘۦۜۘ\n" +
//            "ۨ۠\n" +
//            "ۦ۬۫\n" +
//            "۫ۡۢ\n" +
//            "ۤۢۖ\n" +
//            "ۨۨۡ\n" +
//            "ۥ۬ۦۘ\n" +
//            "ۨۙۨۘ\n" +
//            "ۖۗۘ\n" +
//            "ۖۦۧ\n" +
//            "ۘۥۖ\n" +
//            "۟۠۟\n" +
//            "۠ۧ۟\n" +
//            "ۦ۟ۡ\n" +
//            "ۙ۠ۗ\n" +
//            "ۢۖۚ\n" +
//            "ۗ۠ۖۘ\n" +
//            "ۤ۬۬\n" +
//            "۫۫\n" +
//            "ۢۗۦ\n" +
//            "ۙۙۙ\n" +
//            "ۢۚۧ\n" +
//            "ۙۧۦ\n" +
//            "ۗۦ۫\n" +
//            "۫ۦۤ\n" +
//            "ۙۡۦۘ\n" +
//            "۟ۦۤ\n" +
//            "۫ۨۧۘ\n" +
//            "ۜۛ۟\n" +
//            "ۖ۬ۦۘ\n" +
//            "ۢۦۛ\n" +
//            "ۦ۟ۨۘ\n" +
//            "ۜ۠ۤ\n" +
//            "ۤ۫ۘۘ\n" +
//            "۟ۤۙ\n" +
//            "ۦ۫ۙ\n" +
//            "ۙۦۨ\n" +
//            "۟ۡ۟\n" +
//            "ۜ۬ۡۘ\n" +
//            "ۛ۬ۖ\n" +
//            "ۘۗۢ\n" +
//            "۬۬۟\n" +
//            "ۚۨۧ\n" +
//            "۟۫ۤ\n" +
//            "ۘۜۢ\n" +
//            "ۖۧۦۘ\n" +
//            "ۚۤۚ\n" +
//            "ۥۙۖ\n" +
//            "۫ۘۧۘ\n" +
//            "ۧۛۥ\n" +
//            "ۤۦ۬\n" +
//            "ۘۖۙ\n" +
//            "۠ۤ۟\n" +
//            "ۨ۫ۡ\n" +
//            "ۛۚۨ\n" +
//            "۫ۢۚ\n" +
//            "ۢ۬ۡۘ\n" +
//            "ۢ۟ۡ\n" +
//            "ۨۢۛ\n" +
//            "ۘۦۥ\n" +
//            "ۜ۬ۜۘ\n" +
//            "۟ۖۦۘ\n" +
//            "ۢۛۡ\n" +
//            "ۦ۬ۥۘ\n" +
//            "ۤۘۖۘ\n" +
//            "ۚۛۜۘ\n" +
//            "۟ۙۜۘ\n" +
//            "ۚۥ۟\n" +
//            "ۚۧۡ\n" +
//            "ۚۗۡ\n" +
//            "ۖۥۦ\n" +
//            "ۨۖۢ\n" +
//            "ۖۛ\n" +
//            "ۧۛ۟\n" +
//            "۬۫ۜ\n" +
//            "ۘ۠ۡ\n" +
//            "ۧۜۖۘ\n" +
//            "۠ۤۦ\n" +
//            "۫ۨۡ\n" +
//            "۫۠ۗ\n" +
//            "ۧۤۚ\n" +
//            "ۘۢ۠\n" +
//            "ۖ۠ۘۘ\n" +
//            "۬ۡۥۘ\n" +
//            "ۛۛۦ\n" +
//            "ۢۢۥ\n" +
//            "ۛ۠ۥۘ\n" +
//            "ۚۤ۫\n" +
//            "۠ۚۛ\n" +
//            "ۛۗۧ\n" +
//            "۠ۧۚ\n" +
//            "ۙۖۢ\n" +
//            "ۚ۬ۢ\n" +
//            "ۖۤ۬\n" +
//            "ۛۜۜ\n" +
//            "ۤۥۦۘ\n" +
//            "ۦۧۜۘ\n" +
//            "ۤۙۜ\n" +
//            "ۜۚۦۘ\n" +
//            "۬ۨۦ\n" +
//            "ۡۖۘ\n" +
//            "۫ۖۜ\n" +
//            "ۤۖ۬\n" +
//            "ۙۙۡ\n" +
//            "ۗۥۡۘ\n" +
//            "۠ۨۥۘ\n" +
//            "ۚۙۡ\n" +
//            "۠ۛۘۘ\n" +
//            "ۢۗۛ\n" +
//            "ۗۜۙ\n" +
//            "ۦۨۥ\n" +
//            "۠ۨۧ\n" +
//            "۫۫ۜ\n" +
//            "ۢۗۖ\n" +
//            "ۛۚۡۘ\n" +
//            "۟ۦۥۘ\n" +
//            "ۨۦ۠\n" +
//            "ۘۘۜ\n" +
//            "ۧۥۙ\n" +
//            "ۚۧۛ\n" +
//            "۫ۦۘ\n" +
//            "ۛۜ۠\n" +
//            "ۤۧۗ\n" +
//            "ۨۜ۠\n" +
//            "ۦۨۡ\n" +
//            "ۧۢۢ\n" +
//            "ۚۥۚ\n" +
//            "ۧۡۗ\n" +
//            "ۗۢۗ\n" +
//            "ۧ۫ۗ\n" +
//            "۠ۗ۟\n" +
//            "ۧ۟ۜۘ\n" +
//            "ۥۘۘۘ\n" +
//            "ۛۥۦ\n" +
//            "۠۫۟\n" +
//            "ۘۤۤ\n" +
//            "ۛ۟ۢ\n" +
//            "ۤۨۡ\n" +
//            "ۤ۟ۧ\n" +
//            "ۘۖۢ\n" +
//            "۠۠ۚ\n" +
//            "ۙۚۢ\n" +
//            "ۜۚۖ\n" +
//            "ۗ۠\n" +
//            "ۗۨۗ\n" +
//            "۟ۧۜ\n" +
//            "ۢ۟ۗ\n" +
//            "ۦۙ۠\n" +
//            "ۙۚۜۘ\n" +
//            "ۚۙ\n" +
//            "ۤۙ۟\n" +
//            "ۙۛۦ\n" +
//            "ۖۤۚ\n" +
//            "ۗۨۖۘ\n" +
//            "ۜۗۘ\n" +
//            "ۥۛۜ\n" +
//            "ۤۛ۟\n" +
//            "ۜۤۙ\n" +
//            "ۢۖۖۘ\n" +
//            "ۚ۬ۨۘ\n" +
//            "ۙۚۡ\n" +
//            "ۜۛۥ\n" +
//            "۟ۖۨۘ\n" +
//            "ۧۜۢ\n" +
//            "ۗۙۨۘ\n" +
//            "ۦۖۖۘ\n" +
//            "ۦۨۤ\n" +
//            "ۘۖۗ\n" +
//            "ۘۢ۫\n" +
//            "ۢۘۥۘ\n" +
//            "ۘۧۡۘ\n" +
//            "ۖ۫ۨۘ\n" +
//            "۟ۤۗ\n" +
//            "ۙۡۖ\n" +
//            "۟۠ۤ\n" +
//            "۠ۚ۬\n" +
//            "۬ۖ\n" +
//            "ۤۦۨ\n" +
//            "ۙ۫ۘۘ\n" +
//            "ۜۘۥ\n" +
//            "ۡۛۦ\n" +
//            "ۘۥۥۘ\n" +
//            "ۢۜ۬\n" +
//            "۫ۙۤ\n" +
//            "ۨۗ۫\n" +
//            "۟۬ۢ\n" +
//            "ۚ۟ۡ\n" +
//            "ۗ۠۫\n" +
//            "۟ۗۜ\n" +
//            "ۡۗ۠\n" +
//            "ۙۙۦ\n" +
//            "ۤ۟ۨۘ\n" +
//            "ۛۘۜ\n" +
//            "ۖۡ۫\n" +
//            "ۘۨۢ\n" +
//            "ۧۚ۫\n" +
//            "۟ۥ۫\n" +
//            "۟ۛۥۘ\n" +
//            "ۨۚ۫\n" +
//            "ۗۚۗ\n" +
//            "ۦۧۦ\n" +
//            "۬ۢ۫\n" +
//            "ۘۨۘۘ\n" +
//            "ۗۧۡ\n" +
//            "ۖۖ\n" +
//            "ۥۢۥ\n" +
//            "ۜۦۨۘ\n" +
//            "ۥۨۡ\n" +
//            "۠ۨۖۘ\n" +
//            "ۨۤۛ\n" +
//            "ۜۤۗ\n" +
//            "۠ۖ۠\n" +
//            "ۨۨۢ\n" +
//            "ۗ۫۠\n" +
//            "ۖۦۨۘ\n" +
//            "ۘۤۢ\n" +
//            "ۜ۠ۨ\n" +
//            "ۛۛۜۘ\n" +
//            "ۥۧۛ\n" +
//            "ۙۨ۠\n" +
//            "ۧۛ۬\n" +
//            "ۖۜۦ\n" +
//            "ۚ۬ۨ\n" +
//            "ۤۙۦ\n" +
//            "ۨ۠ۨۘ\n" +
//            "۬ۥۧۘ\n" +
//            "ۚ۠ۨ\n" +
//            "ۘۥۥ\n" +
//            "ۦۢۜۘ\n" +
//            "۠ۤۥۘ\n" +
//            "ۜۧۘ\n" +
//            "ۦ۠ۨۘ\n" +
//            "ۖۦ۬\n" +
//            "۬ۙۚ\n" +
//            "ۡ۟\n" +
//            "ۤۗ\n" +
//            "ۜۨۤ\n" +
//            "ۗۜۜۘ\n" +
//            "ۢ۠ۨ\n" +
//            "ۜۨۛ\n" +
//            "۫۠ۨ\n" +
//            "ۢۧۤ\n" +
//            "ۢۨ۫\n" +
//            "ۥۛۡ\n" +
//            "ۢۥۨۘ\n" +
//            "ۨۖ۠\n" +
//            "۬ۦۘۘ\n" +
//            "ۧۥ۫\n" +
//            "ۨۢۢ\n" +
//            "۟ۥۦۘ\n" +
//            "ۚۗۤ\n" +
//            "ۖۚۨ\n" +
//            "ۖ۫ۖ\n" +
//            "ۥۢۢ\n" +
//            "ۜۦۢ\n" +
//            "ۚۚۖۘ\n" +
//            "ۡۤۚ\n" +
//            "ۡۦۡ\n" +
//            "ۘۛ۟\n" +
//            "ۛۚۘ\n" +
//            "۬ۨۡۘ\n" +
//            "۟۠۠\n" +
//            "ۨۚۙ\n" +
//            "ۚۥۥۘ\n" +
//            "۠ۜۘۘ\n" +
//            "۫ۚ۟\n" +
//            "ۧ۠ۘۘ\n" +
//            "ۛۥۧ\n" +
//            "ۙۗۥۘ\n" +
//            "۟۬۫\n" +
//            "ۨ۠ۛ\n" +
//            "ۛ۟۟\n" +
//            "ۢۢۚ\n" +
//            "ۗۤ\n" +
//            "ۚ۟ۤ\n" +
//            "ۗۗۖۘ\n" +
//            "ۦ۫ۡ\n" +
//            "ۡۡۡ\n" +
//            "۫ۥ\n" +
//            "ۖ۠ۥۘ\n" +
//            "ۢۙۤ\n" +
//            "ۤۦۗ\n" +
//            "ۚۜۦ\n" +
//            "ۦۤ۬\n" +
//            "ۙ۫ۙ\n" +
//            "۫ۙ۠\n" +
//            "ۗ۠ۖ\n" +
//            "۬ۡۦۘ\n" +
//            "ۖۚۖۘ\n" +
//            "۟ۜۜۘ\n" +
//            "ۚۦۢ\n" +
//            "ۥۧۖۘ\n" +
//            "ۥۜۚ\n" +
//            "ۘۥ۠\n" +
//            "ۖۙۡ\n" +
//            "ۜۧ۫\n" +
//            "ۗ۫\n" +
//            "ۚ۠ۧ\n" +
//            "ۖ۫ۦ\n" +
//            "ۚۦ۠\n" +
//            "۬ۜۨ\n" +
//            "ۧۥۧۘ\n" +
//            "۠ۖ۬\n" +
//            "ۢ۟ۥۘ\n" +
//            "۫ۥۡۘ\n" +
//            "ۗۥۦۘ\n" +
//            "۬ۖۧ\n" +
//            "ۢۧۖ\n" +
//            "ۜۨۙ\n" +
//            "۟ۧۦ\n" +
//            "۫۫ۡۘ\n" +
//            "ۡۘۦ\n" +
//            "ۖۜ۟\n" +
//            "ۙۙ۠\n" +
//            "ۤۤۖ\n" +
//            "ۨۘ\n" +
//            "ۨۦۡۘ\n" +
//            "۟ۤۜۘ\n" +
//            "ۖ۫ۜ\n" +
//            "ۦ۟ۜ\n" +
//            "ۙۨۖۘ\n" +
//            "ۧۥۖۘ\n" +
//            "ۢۗۙ\n" +
//            "ۢ۫ۨ\n" +
//            "ۗۘۢ\n" +
//            "ۖۡۘۘ\n" +
//            "۟۬ۖۘ\n" +
//            "ۙۜۙ\n" +
//            "ۡۨ\n" +
//            "۬۫ۦۘ\n" +
//            "ۤ۠ۛ\n" +
//            "ۛۥۨ\n" +
//            "ۡۜۨ\n" +
//            "ۡۚۙ\n" +
//            "ۜۖۡ\n" +
//            "ۥۖ۠\n" +
//            "ۜۡۛ\n" +
//            "ۘۡۥ\n" +
//            "۠۬ۜ\n" +
//            "ۛۧۡ\n" +
//            "ۦ۟۟\n" +
//            "ۢۘۧ\n" +
//            "۫ۚۦ\n" +
//            "۟۫ۥ\n" +
//            "ۡۥۜۘ\n" +
//            "ۦ۬ۤ\n" +
//            "۬ۘۖۘ\n" +
//            "ۘۦۨۘ\n" +
//            "۫ۡ۬\n" +
//            "ۦۡۢ\n" +
//            "ۢۡۤ\n" +
//            "ۗۨۢ\n" +
//            "۫ۢۥۘ\n" +
//            "ۚۦۜ\n" +
//            "ۨۥۘ\n" +
//            "ۙ۠\n" +
//            "ۘۤۥ\n" +
//            "ۜۙۗ\n" +
//            "۠ۘۛ\n" +
//            "ۤۖۨ\n" +
//            "ۗۧۨ\n" +
//            "ۦۧۨ\n" +
//            "۠ۤۘۘ\n" +
//            "ۖۛۡۘ\n" +
//            "۠ۧۡۘ\n" +
//            "ۙۘۧۘ\n" +
//            "ۖ۬\n" +
//            "۟ۘۚ\n" +
//            "ۥ۬ۜ\n" +
//            "ۗۦۤ\n" +
//            "ۙۜۧ\n" +
//            "۫ۦ۠\n" +
//            "ۘۜ۫\n" +
//            "ۘۜ۬\n" +
//            "ۜۙۨۘ\n" +
//            "ۜۚۡۘ\n" +
//            "ۗۧۥ\n" +
//            "ۨۙ\n" +
//            "۟ۖۛ\n" +
//            "ۦۜۖ\n" +
//            "۠ۗۜۘ\n" +
//            "ۡۢ۠\n" +
//            "۫ۗۖ\n" +
//            "ۧۚ\n" +
//            "ۥۡۨۘ\n" +
//            "ۙۛۛ\n" +
//            "۟ۙۖ\n" +
//            "۬ۦۦۘ\n" +
//            "ۦۛۦۘ\n" +
//            "ۙ۬ۡۘ\n" +
//            "ۤ۬ۦۘ\n" +
//            "ۚ۟ۨ\n" +
//            "ۧۨۧ\n" +
//            "ۗۖ۫\n" +
//            "۬ۥۨۘ\n" +
//            "ۧۚۖۘ\n" +
//            "ۘۛۘ\n" +
//            "۬ۛۜ\n" +
//            "ۧۜۨ\n" +
//            "ۥۨۗ\n" +
//            "ۘۗۦۘ\n" +
//            "۠ۦۦ\n" +
//            "ۘۛ۬\n" +
//            "ۨۢۙ\n" +
//            "ۙۙۘۘ\n" +
//            "ۙۖۘ\n" +
//            "ۥۚ\n" +
//            "ۢ۟ۘۘ\n" +
//            "ۗۧۘۘ\n" +
//            "ۦۧۨۘ\n" +
//            "ۙۥۚ\n" +
//            "ۥۙۥ\n" +
//            "ۘۘ۫\n" +
//            "۫۬ۢ\n" +
//            "ۧ۠ۜ\n" +
//            "ۙۧۘۘ\n" +
//            "ۗۦ۟\n" +
//            "ۛۗۜ\n" +
//            "ۨ۫ۦ\n" +
//            "ۡۤۥ\n" +
//            "ۥۦۖۘ\n" +
//            "ۥۜۨ\n" +
//            "۬۠۫\n" +
//            "۬۬۠\n" +
//            "ۜ۬ۤ\n" +
//            "ۚۢۡۘ\n" +
//            "ۚۢۥۘ\n" +
//            "۬ۢۗ\n" +
//            "ۜۦۥۘ\n" +
//            "۟ۢۡۘ\n" +
//            "ۧۜۨۘ\n" +
//            "ۛۜۖۘ\n" +
//            "۬ۦۗ\n" +
//            "۬ۤ۬\n" +
//            "ۖ۠ۘ\n" +
//            "۠۫ۘ\n" +
//            "ۤۢ۫\n" +
//            "ۖ۟ۢ\n" +
//            "۠ۢۘۘ\n" +
//            "۫ۜۛ\n" +
//            "ۘۚۛ\n" +
//            "ۦۡۦۘ\n" +
//            "۫۠ۦ\n" +
//            "ۘۚۡ\n" +
//            "ۚۧۥۘ\n" +
//            "ۢ۬ۧ\n" +
//            "ۥۘۖۘ\n" +
//            "ۛۘۨۘ\n" +
//            "ۗۖۖۘ\n" +
//            "ۛۖۥ\n" +
//            "ۚ۠ۘۘ\n" +
//            "ۖۦۢ\n" +
//            "ۧۗۨۘ\n" +
//            "ۜۤۤ\n" +
//            "ۦۗۨ\n" +
//            "ۡۙۚ\n" +
//            "ۢ۫ۘۘ\n" +
//            "ۤۛۛ\n" +
//            "۠۬ۥۘ\n" +
//            "۬ۤۨ\n" +
//            "ۦۚ۫\n" +
//            "۬۬ۦۘ\n" +
//            "ۗ۬ۨۘ\n" +
//            "ۢ۬ۡ\n" +
//            "ۨۤۘ\n" +
//            "ۤۡۗ\n" +
//            "ۙۘۜۘ\n" +
//            "ۤ۫ۡ\n" +
//            "ۜۖۛ\n" +
//            "ۤ۫ۖ\n" +
//            "۬ۦۖ\n" +
//            "ۦۢۨ\n" +
//            "ۦ۟ۘ\n" +
//            "ۗۗۦ\n" +
//            "ۢۘۥ\n" +
//            "ۙۚ۠\n" +
//            "۫ۤۦۘ\n" +
//            "ۡ۟ۨۘ\n" +
//            "۠ۙۜ\n" +
//            "ۤۜۖ\n" +
//            "ۢۗ\n" +
//            "۫ۙ۟\n" +
//            "ۗۘ\n" +
//            "ۘۡۙ\n" +
//            "ۦۧ\n" +
//            "۬ۙۧ\n" +
//            "ۛۜ۬\n" +
//            "ۤۥۢ\n" +
//            "ۚ۫ۥۘ\n" +
//            "ۜۖ۫\n" +
//            "ۢۙۖ\n" +
//            "ۡۤۘۘ\n" +
//            "ۘۧۦ\n" +
//            "۬ۨ۬\n" +
//            "ۗۨ۠\n" +
//            "۟ۤۦۘ\n" +
//            "ۗۦۜۘ\n" +
//            "ۦ۬ۦۘ\n" +
//            "ۛ۬۟\n" +
//            "ۘۨۨۘ\n" +
//            "۬۬ۘ\n" +
//            "ۛۙۤ\n" +
//            "ۖۛۜ\n" +
//            "ۙ۫ۗ\n" +
//            "ۖۙۥۘ\n" +
//            "ۛۛ\n" +
//            "ۗۛۙ\n" +
//            "ۤۚۚ\n" +
//            "ۢۡۡ\n" +
//            "ۥ۟ۥۘ\n" +
//            "ۥ۫ۨ\n" +
//            "ۤۛۡۘ\n" +
//            "ۥ۬ۡ\n" +
//            "ۧۡۨ\n" +
//            "۟ۦۘ\n" +
//            "ۥۗۧ\n" +
//            "۠ۖۜۘ\n" +
//            "ۘ۬ۖ\n" +
//            "ۗ۟ۥ\n" +
//            "ۦۡ\n" +
//            "۟ۗۚ\n" +
//            "ۗۖۛ\n" +
//            "۟ۦۨۘ\n" +
//            "۟۠۬\n" +
//            "۫۬ۥ\n" +
//            "ۢ۠\n" +
//            "۬ۙ۟\n" +
//            "ۦ۫ۢ\n" +
//            "ۛۢۡۘ\n" +
//            "ۛۦ۫\n" +
//            "۠۬ۘ\n" +
//            "ۥۗۜۘ\n" +
//            "ۙۚۜ\n" +
//            "ۧۢۦ\n" +
//            "ۧۦ۟\n" +
//            "ۡۘۨ\n" +
//            "۬ۤۙ\n" +
//            "ۖۚ۫\n" +
//            "۟ۗۧ\n" +
//            "ۜ۫ۢ\n" +
//            "ۜۨۖ\n" +
//            "۠ۨۧۘ\n" +
//            "ۘۙ۬\n" +
//            "ۨ۟ۚ\n" +
//            "ۨۜۢ\n" +
//            "ۤ۫ۙ\n" +
//            "ۜۤۖ\n" +
//            "۫ۖۙ\n" +
//            "ۖۤۜ\n" +
//            "ۚۡۛ\n" +
//            "ۡۡۧۘ\n" +
//            "ۡۦۨۘ\n" +
//            "۬۫ۤ\n" +
//            "۠۬\n" +
//            "۫۬ۖ\n" +
//            "۬۠ۛ\n" +
//            "ۙۗۙ\n" +
//            "ۜۙۥ\n" +
//            "ۜ۬ۚ\n" +
//            "ۦ۫ۥۘ\n" +
//            "ۤ۫ۗ\n" +
//            "ۜۜۘۘ\n" +
//            "۠ۢۦ\n" +
//            "ۙۖ۟\n" +
//            "ۙۖۖ\n" +
//            "ۛ۫۫\n" +
//            "ۧۙۗ\n" +
//            "۫ۛۖ\n" +
//            "ۚ۟ۢ\n" +
//            "ۡۚۨۘ\n" +
//            "ۙۥۨ\n" +
//            "ۤۘ\n" +
//            "ۥۧۜ\n" +
//            "ۘۛۧ\n" +
//            "ۚۖۡ\n" +
//            "۟۟۬\n" +
//            "ۧۨۘۘ\n" +
//            "ۨۖۨ\n" +
//            "ۘۜۡۘ\n" +
//            "ۧۦۙ\n" +
//            "ۜۖۦ\n" +
//            "۫ۚۨۘ\n" +
//            "ۡۧ۬\n" +
//            "ۧۦۥۘ\n" +
//            "ۨۛۖۘ\n" +
//            "ۖۖۖۘ\n" +
//            "ۚۥۤ\n" +
//            "ۘۙۨ\n" +
//            "ۛ۠ۛ\n" +
//            "ۡ۟ۗ\n" +
//            "۫۫ۢ\n" +
//            "ۧۥۥ\n" +
//            "ۙۙۛ\n" +
//            "ۚۨۡ\n" +
//            "ۛ۬ۥ\n" +
//            "ۨۜۛ\n" +
//            "ۨۚۧ\n" +
//            "۬ۗۧ\n" +
//            "۬ۜۛ\n" +
//            "ۜۨ۬\n" +
//            "ۨۜۖۘ\n" +
//            "۟ۡۖ\n" +
//            "۟ۦ۬\n" +
//            "ۦۤۨ\n" +
//            "ۖۙۥ\n" +
//            "ۧۡۙ\n" +
//            "ۧۚۨ\n" +
//            "ۙ۫ۦ\n" +
//            "۠ۚۘۘ\n" +
//            "ۧۦۘ\n" +
//            "ۨۢۥۘ\n" +
//            "ۖ۟ۘ\n" +
//            "ۤۦۥ\n" +
//            "ۘ۫ۧ\n" +
//            "۟ۚۜۘ\n" +
//            "ۡ۫ۦۘ\n" +
//            "۟ۥۥۘ\n" +
//            "ۦ۫ۚ\n" +
//            "ۘۘۨۘ\n" +
//            "ۗۚۚ\n" +
//            "ۨۛ۟\n" +
//            "۬۠ۥ\n" +
//            "ۛۖۧ\n" +
//            "ۖۛ۬\n" +
//            "ۚۚ\n" +
//            "ۜۨۧۘ\n" +
//            "ۧۚۖ\n" +
//            "۬ۧۨ\n" +
//            "۟ۜۡۘ\n" +
//            "ۥۤۨ\n" +
//            "ۢۜۖ\n" +
//            "ۘ۬ۦۘ\n" +
//            "ۖ۬ۖ\n" +
//            "ۡۡۙ\n" +
//            "ۛۦۖ\n" +
//            "ۛۧ۬\n" +
//            "ۚ۫۫\n" +
//            "ۖۤۘۘ\n" +
//            "ۢۖۧ\n" +
//            "ۦۧۤ\n" +
//            "۬ۡۜ\n" +
//            "ۧ۫ۘۘ\n" +
//            "ۢۛۜ\n" +
//            "ۖ۠ۙ\n" +
//            "ۘۗۡ\n" +
//            "ۤۡۜ\n" +
//            "ۚ۬ۗ\n" +
//            "ۛۜۘۘ\n" +
//            "۠ۦۧۘ\n" +
//            "ۖ۟ۛ\n" +
//            "ۢۥۘۘ\n" +
//            "ۦ۫ۗ\n" +
//            "ۚۤۦ\n" +
//            "ۛ۬ۦ\n" +
//            "ۜۖۙ\n" +
//            "۟۬ۜۘ\n" +
//            "ۙۚۖۘ\n" +
//            "ۖۖۧ\n" +
//            "ۨۡۧ\n" +
//            "ۗۢۖۘ\n" +
//            "ۙۧۗ\n" +
//            "ۙۗۢ\n" +
//            "ۨۡۥ\n" +
//            "ۥۚۡۘ\n" +
//            "ۡۚۘۘ\n" +
//            "۟ۘۘ\n" +
//            "ۤ۟۬\n" +
//            "ۤۙۖ\n" +
//            "ۜ۬ۛ\n" +
//            "ۦۙۖۘ\n" +
//            "ۙۘۜ\n" +
//            "ۢۧ۫\n" +
//            "۬۠ۨۘ\n" +
//            "ۥۧۡۘ\n" +
//            "۠ۡۨ\n" +
//            "ۚۦۙ\n" +
//            "ۚۘۦ\n" +
//            "ۢۚۜۘ\n" +
//            "ۜۗۤ\n" +
//            "۟ۖۖۘ\n" +
//            "ۖۘۡ\n" +
//            "۫۬ۨۘ\n" +
//            "۠ۖۛ\n" +
//            "ۡۚۤ\n" +
//            "ۛ۫۬\n" +
//            "ۚۛۤ\n" +
//            "ۗۚۢ\n" +
//            "ۚ۬ۡ\n" +
//            "۫ۤ۟\n" +
//            "ۜۖ۟\n" +
//            "۠۠ۢ\n" +
//            "ۗۡۦ\n" +
//            "ۧ۫ۥۘ\n" +
//            "ۘۤۘۘ\n" +
//            "ۙۧۢ\n" +
//            "۠ۤۨ\n" +
//            "ۡۥۧ\n" +
//            "۬ۚۛ\n" +
//            "ۜۧۖۘ\n" +
//            "ۛۧۖۘ\n" +
//            "ۨۖۘۘ\n" +
//            "۬ۦۥۘ\n" +
//            "ۦۨۙ\n" +
//            "ۡۜۥ\n" +
//            "۬ۡۡۘ\n" +
//            "ۥۗۙ\n" +
//            "۫ۘ۠\n" +
//            "ۚۖۥۘ\n" +
//            "ۙۘ۫\n" +
//            "ۗۙۜ\n" +
//            "ۡۨۡ\n" +
//            "ۙۥۦۘ\n" +
//            "ۘۛۙ\n" +
//            "ۖۥۨ\n" +
//            "ۚ۬ۙ\n" +
//            "ۗۦۡۘ\n" +
//            "ۜۙ۟\n" +
//            "ۢ۫ۛ\n" +
//            "ۗۦۨۘ\n" +
//            "ۗ۫ۥۘ\n" +
//            "ۜۙۚ\n" +
//            "۫ۨ\n" +
//            "ۙۥۗ\n" +
//            "۠۠ۛ\n" +
//            "ۙ۬ۧ\n" +
//            "۟ۚۨ\n" +
//            "ۗۤ۟\n" +
//            "۫ۜۥۘ\n" +
//            "ۙ۫ۥ\n" +
//            "۬ۗۖ\n" +
//            "ۙ۟ۡ\n" +
//            "ۖۖۥۘ\n" +
//            "ۨۧ۟\n" +
//            "۠۠ۥ\n" +
//            "ۢۦۜۘ\n" +
//            "ۗۛ\n" +
//            "۬ۘ\n" +
//            "ۘۜۛ\n" +
//            "ۢۤۨۘ\n" +
//            "ۦۦۧ\n" +
//            "۬۫۬\n" +
//            "ۦۙ\n" +
//            "۫ۢۤ\n" +
//            "ۖ۠ۨ\n" +
//            "ۚۡۧ\n" +
//            "ۛ۫ۛ\n" +
//            "ۜۢ\n" +
//            "۠ۜ۬\n" +
//            "ۡ۫ۨۘ\n" +
//            "۬ۢۘۘ\n" +
//            "ۛۡ۟\n" +
//            "ۥ۠ۜۘ\n" +
//            "۬ۚ۟\n" +
//            "ۥۜۤ\n" +
//            "ۛۦۙ\n" +
//            "ۥۦۜ\n" +
//            "ۘ۠ۘۘ\n" +
//            "ۖۙۜۘ\n" +
//            "ۜۘ۠\n" +
//            "ۛۚۤ\n" +
//            "ۨۨۛ\n" +
//            "ۗۗۖ\n" +
//            "ۚۜ۬\n" +
//            "ۛ۠ۨ\n" +
//            "۠ۖۚ\n" +
//            "ۛۛ۫\n" +
//            "ۗۢۥ\n" +
//            "ۤۜۙ\n" +
//            "۬ۘۜۘ\n" +
//            "ۙۙ۟\n" +
//            "ۨۚۤ\n" +
//            "ۤۙ۠\n" +
//            "ۥ۬۬\n" +
//            "ۦۜۨۘ\n" +
//            "ۧ۫ۨ\n" +
//            "ۖۢۙ\n" +
//            "ۨ۫ۘ\n" +
//            "ۢۛۥۘ\n" +
//            "ۤ۠ۨۘ\n" +
//            "ۗۚۥ\n" +
//            "ۖۨۛ\n" +
//            "ۛۥۗ\n" +
//            "ۙۤۜ\n" +
//            "ۢۡۛ\n" +
//            "ۡۨۥ\n" +
//            "ۢۥۧ\n" +
//            "ۚۤۡ\n" +
//            "ۢ۬۬\n" +
//            "ۡ۟ۚ\n" +
//            "۠ۖۥۘ\n" +
//            "ۛۨۚ\n" +
//            "ۧۘۧۘ\n" +
//            "ۧ۟ۨۘ\n" +
//            "ۢۧۦۘ\n" +
//            "ۤۘۛ\n" +
//            "ۘۧۜۘ\n" +
//            "۠ۙ۫\n" +
//            "ۨ۫ۛ\n" +
//            "۟ۤ۟\n" +
//            "ۙۖۘۘ\n" +
//            "ۙۗ۠\n" +
//            "ۘۤ۠\n" +
//            "ۜ۫ۘ\n" +
//            "۫۫ۘۘ\n" +
//            "ۨۜ۬\n" +
//            "۠ۥ۠\n" +
//            "ۦۚۤ\n" +
//            "ۦۛۢ\n" +
//            "ۤۨۜ\n" +
//            "۫ۚۙ\n" +
//            "۟ۢ۫\n" +
//            "۟ۙ۟\n" +
//            "ۖۗ\n" +
//            "۫ۧۤ\n" +
//            "۫ۦۘۘ\n" +
//            "ۢۦۨ\n" +
//            "۬ۛۥ\n" +
//            "ۢۙۘۘ\n" +
//            "ۗۦۚ\n" +
//            "ۦۘۥ\n" +
//            "۠۠ۘ\n" +
//            "ۛۖۤ\n" +
//            "ۤۢۡ\n" +
//            "۠ۛۚ\n" +
//            "۫ۥۨۘ\n" +
//            "ۖۢۘۘ\n" +
//            "ۢۨ۠\n" +
//            "ۛۨۡۘ\n" +
//            "ۡۗۙ\n" +
//            "ۧۨۡ\n" +
//            "ۧ۟ۘۘ\n" +
//            "۬ۢۡۘ\n" +
//            "ۖۖۡۘ\n" +
//            "ۨۧ۫\n" +
//            "۟ۜۘ\n" +
//            "ۨۦۗ\n" +
//            "ۥ۠ۖ\n" +
//            "۟۫۠\n" +
//            "ۚۙۗ\n" +
//            "ۨ۟۠\n" +
//            "ۧۢۡۘ\n" +
//            "ۘۢۨۘ\n" +
//            "ۖۖۛ\n" +
//            "۬۫ۙ\n" +
//            "ۧۛ۠\n" +
//            "ۗ۠ۜ\n" +
//            "ۛۛۘ\n" +
//            "ۧۨۨۘ\n" +
//            "ۜۡۥ\n" +
//            "ۡۛ۟\n" +
//            "ۥۜۧۘ\n" +
//            "ۤۖۙ\n" +
//            "ۚۥۖ\n" +
//            "ۖۛۡ\n" +
//            "ۨۧۖ\n" +
//            "۟ۚ۟\n" +
//            "ۤ۫ۡۘ\n" +
//            "ۧۘۨۘ\n" +
//            "۟ۜۥۘ\n" +
//            "ۢ۠ۦۘ\n" +
//            "ۢ۫۫\n" +
//            "۬۫ۥۘ\n" +
//            "ۚۦۡ\n" +
//            "ۜۜۤ\n" +
//            "ۚۜۘ\n" +
//            "ۡ۟ۖ\n" +
//            "ۘۦ\n" +
//            "۫ۛۗ\n" +
//            "ۥۚۥ\n" +
//            "ۡۥۛ\n" +
//            "ۥۛۛ\n" +
//            "ۧۤۡۘ\n" +
//            "ۙۥ\n" +
//            "ۧۢۛ\n" +
//            "۬۬ۘۘ\n" +
//            "ۥۦۡۘ\n" +
//            "۠ۙۢ\n" +
//            "۫ۘۡ\n" +
//            "ۨ۟ۜ\n" +
//            "۠۠۫\n" +
//            "ۛۦۡ\n" +
//            "ۛۤ۟\n" +
//            "ۖ۫ۥ\n" +
//            "ۢۦۤ\n" +
//            "ۧۧۘ\n" +
//            "ۚ۬ۤ\n" +
//            "ۡۡۜۘ\n" +
//            "ۚۗۖ\n" +
//            "ۚۙۜ\n" +
//            "۬۠ۦۘ\n" +
//            "ۦ۟ۖ\n" +
//            "ۥ۫ۢ\n" +
//            "ۨۚۘ\n" +
//            "۬ۢۦ\n" +
//            "ۥۧۡ\n" +
//            "ۖۛۙ\n" +
//            "۫ۡ\n" +
//            "ۤۖ۠\n" +
//            "۫ۙ۫\n" +
//            "ۗۛۘۘ\n" +
//            "ۨۘۨ\n" +
//            "ۡۚۖ\n" +
//            "۟ۥۤ\n" +
//            "۟ۨۡ\n" +
//            "ۨۤۖ\n" +
//            "ۢۜ۟\n" +
//            "ۗ۟۬\n" +
//            "ۙۛۢ\n" +
//            "۬ۢ۬\n" +
//            "ۨۜۦۘ\n" +
//            "ۥۢۘۘ\n" +
//            "ۜۗۖۘ\n" +
//            "ۧۤۤ\n" +
//            "ۤۗۗ\n" +
//            "۟۠۫\n" +
//            "۟۠ۚ\n" +
//            "ۛۦۧ\n" +
//            "ۢۚۖۘ\n" +
//            "ۦۖۧۘ\n" +
//            "۬ۚۢ\n" +
//            "ۛ۠ۗ\n" +
//            "ۚۙ۫\n" +
//            "ۘ۠ۗ\n" +
//            "ۧ۟۬\n" +
//            "ۥۘۘ\n" +
//            "ۦ۠ۢ\n" +
//            "ۘۤۘ\n" +
//            "ۗۨ۟\n" +
//            "ۢ۟ۢ\n" +
//            "ۜ۠ۛ\n" +
//            "ۚ۟ۦ\n" +
//            "ۜۥۛ\n" +
//            "ۢۚۥ\n" +
//            "ۜۥ\n" +
//            "ۗ۟ۙ\n" +
//            "ۜۜ۟\n" +
//            "ۜۖۧ\n" +
//            "ۨ۬ۨ\n" +
//            "ۥۨۦ\n" +
//            "ۜ۫ۘۘ\n" +
//            "ۡ۫۫\n" +
//            "ۥ۫ۛ\n" +
//            "۬ۥۛ\n" +
//            "ۨ۠ۤ\n" +
//            "ۨۨۧ\n" +
//            "ۗۨۛ\n" +
//            "ۗۖۥۘ\n" +
//            "۠ۥ\n" +
//            "ۚۡۜۘ\n" +
//            "۠ۙۡ\n" +
//            "ۚۢۡ\n" +
//            "ۖۧۨ\n" +
//            "ۜۡۢ\n" +
//            "۬ۦۧ\n" +
//            "ۚۢۤ\n" +
//            "ۜ۠۟\n" +
//            "۬ۡۙ\n" +
//            "۠۠ۙ\n" +
//            "ۦۙۨ\n" +
//            "ۗۜۗ\n" +
//            "ۤۙۡ\n" +
//            "ۢ۠ۜۘ\n" +
//            "ۨۗۥ\n" +
//            "ۧ۬ۤ\n" +
//            "ۙۜۖ\n" +
//            "ۦ۟ۛ\n" +
//            "ۚۛۦۘ\n" +
//            "ۛۥۙ\n" +
//            "۟۠ۦۘ\n" +
//            "ۗۜۧۘ\n" +
//            "ۤ۫ۢ\n" +
//            "۬ۙ۬\n" +
//            "ۡۜۛ\n" +
//            "ۖ۠ۜۘ\n" +
//            "ۘۜ۠\n" +
//            "۠ۥۙ\n" +
//            "ۦ۬ۖ\n" +
//            "ۦۜۥ\n" +
//            "ۦۡۤ\n" +
//            "ۧۖۜ\n" +
//            "ۡ۫ۜ\n" +
//            "ۤۦۡۘ\n" +
//            "ۘۚۨ\n" +
//            "ۤ۬ۢ\n" +
//            "۫ۛۢ\n" +
//            "ۢۡ۠\n" +
//            "ۨۗۙ\n" +
//            "ۙ۠ۤ\n" +
//            "۬ۚ\n" +
//            "ۤ۠ۜ\n" +
//            "ۧۙ۠\n" +
//            "ۢۧۖۘ\n" +
//            "ۗۙۙ\n" +
//            "ۧۖۖۘ\n" +
//            "ۦۥۦ\n" +
//            "ۦۚۛ\n" +
//            "۫ۖۥۘ\n" +
//            "ۗۡۜ\n" +
//            "ۘ۟ۗ\n" +
//            "ۧۥۤ\n" +
//            "ۛۢۖۘ\n" +
//            "ۡۦ۟\n" +
//            "ۦۙۥ\n" +
//            "ۤۚۖ\n" +
//            "ۖۛۗ\n" +
//            "ۛۚۖۘ\n" +
//            "۬ۥۜۘ\n" +
//            "ۘۖۘ\n" +
//            "ۚ۟ۛ\n" +
//            "ۚۜۧ\n" +
//            "۬۬ۜ\n" +
//            "ۢۨۛ\n" +
//            "۠۬ۡ\n" +
//            "ۦۚۗ\n" +
//            "۠۠ۦ\n" +
//            "ۘۖۚ\n" +
//            "۫ۘ۫\n" +
//            "۠ۡۥ\n" +
//            "۟ۛۦۘ\n" +
//            "ۚۙۛ\n" +
//            "ۖۨۥ\n" +
//            "۫ۤۜۘ\n" +
//            "ۡ۬ۦۘ\n" +
//            "۟ۢۥۘ\n" +
//            "۫ۧ۬\n" +
//            "ۧۡۚ\n" +
//            "ۜ۟ۖۘ\n" +
//            "ۘ۫ۜۘ\n" +
//            "۫ۖۖۘ\n" +
//            "ۥ۬ۙ\n" +
//            "ۛۛۙ\n" +
//            "ۘۙۤ\n" +
//            "ۖۚۙ\n" +
//            "ۜۡ۠\n" +
//            "ۡۘۘۘ\n" +
//            "ۙ۟ۡۘ\n" +
//            "۟ۥۗ\n" +
//            "۠ۥۚ\n" +
//            "ۥۘۡ\n" +
//            "ۘۜۥۘ\n" +
//            "ۚۢۜۘ\n" +
//            "ۖ۬ۘۘ\n" +
//            "ۗۘۦۘ\n" +
//            "ۥۗۨ\n" +
//            "۟ۡۥۘ\n" +
//            "ۤۛۜۘ\n" +
//            "ۧۨۙ\n" +
//            "۟ۨ\n" +
//            "ۡۥ۠\n" +
//            "۬۟ۜۘ\n" +
//            "ۧۧۥۘ\n" +
//            "ۧۧ۠\n" +
//            "۟ۤۘ\n" +
//            "۠ۡۡ\n" +
//            "ۚۙۡۘ\n" +
//            "ۤۚۜ\n" +
//            "۬ۡۧۘ\n" +
//            "ۧۤ۬\n" +
//            "ۥۖۤ\n" +
//            "۟۟۫\n" +
//            "ۙۛۖ\n" +
//            "ۢۙ۫\n" +
//            "ۦۖۤ\n" +
//            "ۚۤۥ\n" +
//            "ۡۧۧ\n" +
//            "ۤ۠ۤ\n" +
//            "ۗۖۧ\n" +
//            "ۘۘۖ\n" +
//            "ۡۘۨۘ\n" +
//            "ۘۤ۬\n" +
//            "ۘۖ۟\n" +
//            "۬۫۟\n" +
//            "۟۬ۦ\n" +
//            "۫۠ۥۘ\n" +
//            "ۙۚۛ\n" +
//            "ۤۨۘ\n" +
//            "ۡۡۨ\n" +
//            "ۛۗۥۘ\n" +
//            "۬ۨ۟\n" +
//            "ۥۧۙ\n" +
//            "ۙۢۙ\n" +
//            "ۘ۬۬\n" +
//            "۟ۖۨ\n" +
//            "ۙ۫۫\n" +
//            "ۢۙۢ\n" +
//            "۠ۘ۟\n" +
//            "۬ۙۢ\n" +
//            "ۨۤۗ\n" +
//            "ۥۜۖۘ\n" +
//            "۟ۥۡۘ\n" +
//            "۬ۦ۫\n" +
//            "ۡۤ۠\n" +
//            "۠ۡۦ\n" +
//            "ۡۛۘ\n" +
//            "ۚ۟ۙ\n" +
//            "۠ۚۡۘ\n" +
//            "ۜۛۡۘ\n" +
//            "ۢ۬ۙ\n" +
//            "ۛۨۦۘ\n" +
//            "۟ۨۦۘ\n" +
//            "۠۠ۡۘ\n" +
//            "ۘۙۗ\n" +
//            "ۘۧۢ\n" +
//            "ۛ۠\n" +
//            "ۢۧۡ\n" +
//            "ۡۥ۬\n" +
//            "ۥۡۧۘ\n" +
//            "ۚۡۡ\n" +
//            "۠ۖۡ\n" +
//            "ۗۙ۬\n" +
//            "ۥۨۘۘ\n" +
//            "ۗۥۦ\n" +
//            "ۛۢۡ\n" +
//            "ۤۥ۬\n" +
//            "۫ۥۥۘ\n" +
//            "ۖۜۡۘ\n" +
//            "ۦ۫ۨ\n" +
//            "۠ۧۖۘ\n" +
//            "ۖۨۢ\n" +
//            "ۢ۫ۨۘ\n" +
//            "ۙۛۨۘ\n" +
//            "۫۬ۡ\n" +
//            "ۘۚۨۘ\n" +
//            "ۤۡ۠\n" +
//            "ۥ۬ۧ\n" +
//            "ۛۛۘۘ\n" +
//            "ۖۗۧ\n" +
//            "ۜۚۚ\n" +
//            "ۛۦۥ\n" +
//            "ۡۨۛ\n" +
//            "ۨۜۘ\n" +
//            "ۚۜۖ\n" +
//            "ۤ۬۟\n" +
//            "ۧۛۜ\n" +
//            "ۡۗ۟\n" +
//            "۬ۛۨۘ\n" +
//            "۠ۛۗ\n" +
//            "ۤ۬ۦ\n" +
//            "ۤۡۤ\n" +
//            "ۨۘۤ\n" +
//            "ۦ۫ۘۘ\n" +
//            "ۚۘۤ\n" +
//            "۬ۢۛ\n" +
//            "ۘۦۦۘ\n" +
//            "ۗ۟ۘۘ\n" +
//            "ۚۜۡ\n" +
//            "ۤۦ۫\n" +
//            "ۘۤۦ\n" +
//            "۫ۛ۟\n" +
//            "ۛۥ۬\n" +
//            "ۗۘۘ\n" +
//            "ۤ۠\n" +
//            "ۘۛۡۘ\n" +
//            "ۙۥۖۘ\n" +
//            "ۖ۫ۖۘ\n" +
//            "ۥۢ۠\n" +
//            "ۛۦۦ\n" +
//            "۫ۗۙ\n" +
//            "۟۫ۨ\n" +
//            "ۖۥۦۘ\n" +
//            "ۗۙۡۘ\n" +
//            "ۙۤ۬\n" +
//            "۟ۦۦ\n" +
//            "۟۫۬\n" +
//            "ۥۖۘ\n" +
//            "ۚۢ۫\n" +
//            "ۨ۠۠\n" +
//            "ۛۜۘ\n" +
//            "ۢۨۤ\n" +
//            "ۨۘۦۘ\n" +
//            "ۚۧ\n" +
//            "ۚ۟ۥ\n" +
//            "ۡ۠\n" +
//            "ۙۚ۟\n" +
//            "ۙۗۖۘ\n" +
//            "ۗۥۗ\n" +
//            "ۗۥۚ\n" +
//            "ۚۚۤ\n" +
//            "ۦۖۦۘ\n" +
//            "۠ۛۘ\n" +
//            "ۤۦۡ\n" +
//            "۠ۧۘۘ\n" +
//            "ۨۛۗ\n" +
//            "ۦۤ۟\n" +
//            "ۨ۟ۥۘ\n" +
//            "ۧۗۧ\n" +
//            "۠ۜۡ\n" +
//            "ۘۙۨۘ\n" +
//            "ۧۧۡۘ\n" +
//            "ۜۡۜ\n" +
//            "ۚۙ۬\n" +
//            "ۢۨۗ\n" +
//            "ۗ۫ۥ\n" +
//            "ۖۗۢ\n" +
//            "ۛۢۥۘ\n" +
//            "۠ۦ\n" +
//            "۠۬ۨ\n" +
//            "ۗۗۗ\n" +
//            "ۥۗۥۘ\n" +
//            "ۜۨۦۘ\n" +
//            "ۘۘۢ\n" +
//            "ۙۛۤ\n" +
//            "ۖ۟\n" +
//            "ۜۢۛ\n" +
//            "۬ۚۥۘ\n" +
//            "ۙۡۡ\n" +
//            "۬ۤۦۘ\n" +
//            "ۥۥۜۘ\n" +
//            "ۢۨۥۘ\n" +
//            "ۤۤۗ\n" +
//            "۠ۥۦۘ\n" +
//            "۬ۖۨۘ\n" +
//            "ۧۜۘ\n" +
//            "ۨۖۘ\n" +
//            "ۦۜۖۘ\n" +
//            "ۘۧۧ\n" +
//            "ۙ۫ۥۘ\n" +
//            "ۢۜۧ\n" +
//            "۠۟ۖۘ\n" +
//            "۬ۖۦ\n" +
//            "ۙۙ\n" +
//            "ۗۘۦ\n" +
//            "۫ۢۘ\n" +
//            "ۦۜۘ\n" +
//            "ۖۚۢ\n" +
//            "ۖۥۗ\n" +
//            "۫ۨۤ\n" +
//            "۫ۚۡۘ\n" +
//            "ۤ۫۫\n" +
//            "ۚ۫ۥ\n" +
//            "ۧۧۜ\n" +
//            "ۧ۬ۚ\n" +
//            "ۜۧ\n" +
//            "ۢۥۗ\n" +
//            "ۢۨۜ\n" +
//            "ۜ۫ۡۘ\n" +
//            "ۨ۟ۤ\n" +
//            "ۗۜۧ\n" +
//            "ۤ۟۠\n" +
//            "ۚۛ\n" +
//            "ۤۡۦ\n" +
//            "۫ۢۨ\n" +
//            "ۨۧۨۘ\n" +
//            "ۜۦۖۘ\n" +
//            "ۚۜۛ\n" +
//            "ۢ۫ۧ\n" +
//            "ۢۢ۬\n" +
//            "ۥۤۛ\n" +
//            "ۙ۬۠\n" +
//            "ۨۧۡۘ\n" +
//            "ۖۘ\n" +
//            "ۨۛۘ\n" +
//            "ۜۗۗ\n" +
//            "ۚۘۨ\n" +
//            "ۛۙۛ\n" +
//            "ۖۨۖ\n" +
//            "ۡ۠ۡۘ\n" +
//            "ۘ۟۠\n" +
//            "ۨۙۗ\n" +
//            "ۦۢۡۘ\n" +
//            "ۚۤۖ\n" +
//            "۫ۛۥ\n" +
//            "۠ۘۦ\n" +
//            "۫ۘۘ\n" +
//            "۟ۦۘۘ\n" +
//            "ۧ۟ۛ\n" +
//            "ۖۘ۠\n" +
//            "ۚۖۦ\n" +
//            "ۛۙۜۘ\n" +
//            "ۨۢۜۘ\n" +
//            "ۜۦۧۘ\n" +
//            "۬ۡۘۘ\n" +
//            "ۛۤۨۘ\n" +
//            "ۨۡۢ\n" +
//            "ۗ۟ۦۘ\n" +
//            "۫ۧۚ\n" +
//            "۫ۘۡۘ\n" +
//            "ۛ۬ۢ\n" +
//            "۬ۙۗ\n" +
//            "ۤۡ۫\n" +
//            "۬ۚۦ\n" +
//            "ۚۦ۫\n" +
//            "ۤۜۨۘ\n" +
//            "ۗ۠۬\n" +
//            "ۨ۬ۡ\n" +
//            "ۗۡ۫\n" +
//            "ۚۛۗ\n" +
//            "۬ۙۦ\n" +
//            "ۦۜۘۘ\n" +
//            "۟ۙ۬\n" +
//            "ۥۛۥ\n" +
//            "ۢ۟ۜ\n" +
//            "ۢ۟ۙ\n" +
//            "ۨۚۨۘ\n" +
//            "ۜۖۗ\n" +
//            "ۢۜۚ\n" +
//            "ۘۡۧۘ\n" +
//            "۫ۦۡۘ\n" +
//            "ۜۢ۠\n" +
//            "ۥۙۙ\n" +
//            "۟ۖۤ\n" +
//            "ۥۖۧ\n" +
//            "ۘۖۡ\n" +
//            "۟ۘۦ\n" +
//            "ۜۢۦ\n" +
//            "ۛ۬ۜ\n" +
//            "۬۫ۡ\n" +
//            "ۗۨ۬\n" +
//            "ۜۛۨۘ\n" +
//            "ۢۥۘ\n" +
//            "ۡۘۢ\n" +
//            "ۡۙۜ\n" +
//            "ۘۘۧۘ\n" +
//            "ۧۢ۟\n" +
//            "ۘ۠ۡۘ\n" +
//            "ۢۙۡۘ\n" +
//            "ۛۤۥۘ\n" +
//            "۠ۨۤ\n" +
//            "ۗ۟۟\n" +
//            "ۖۦۘۘ\n" +
//            "ۖۚۤ\n" +
//            "ۛ۬ۚ\n" +
//            "ۚ۬ۚ\n" +
//            "ۥۡۡۘ\n" +
//            "ۧۥۡۘ\n" +
//            "ۙۤۨۘ\n" +
//            "ۛۨۙ\n" +
//            "۫ۖۧۘ\n" +
//            "ۚ۠۠\n" +
//            "ۡۖۖ\n" +
//            "ۜۤۡۘ\n" +
//            "ۛۥۖۘ\n" +
//            "۟ۛۥ\n" +
//            "ۜۧۙ\n" +
//            "۠ۡۨۘ\n" +
//            "ۦۘ۟\n" +
//            "ۢۡۘ\n" +
//            "ۥ۟ۢ\n" +
//            "۬ۥۢ\n" +
//            "۫ۧۘ\n" +
//            "۫ۤۙ\n" +
//            "ۙۗۘۘ\n" +
//            "ۗ۠ۢ\n" +
//            "ۥۚ۬\n" +
//            "۟ۡۡۘ\n" +
//            "ۤۢ۟\n" +
//            "ۘۧۦۘ\n" +
//            "۟ۦۡ\n" +
//            "ۥۜۥ\n" +
//            "ۧ۟ۥ\n" +
//            "ۨۧ\n" +
//            "ۢۥۙ\n" +
//            "ۘۨۥ\n" +
//            "ۙ۬ۘ\n" +
//            "ۜۜ\n" +
//            "ۗۧ۬\n" +
//            "ۥۘ۫\n" +
//            "ۙۥۤ\n" +
//            "ۘۙ۫\n" +
//            "ۚۡۙ\n" +
//            "ۛۗۦۘ\n" +
//            "۫ۥۧ\n" +
//            "ۜۗۛ\n" +
//            "ۛۦۘۘ\n" +
//            "ۥۙۧ\n" +
//            "ۖۤۦۘ\n" +
//            "ۗۚۙ\n" +
//            "ۜۛۧ\n" +
//            "ۜۢۘۘ\n" +
//            "ۨۘۧۘ\n" +
//            "۫۫ۦ\n" +
//            "۟ۥۨ\n" +
//            "ۛۡ\n" +
//            "ۗۨۦۘ\n" +
//            "ۛ۠ۦۘ\n" +
//            "ۜۢۙ\n" +
//            "ۚۘۘ\n" +
//            "۠ۖ۟\n" +
//            "ۚۨۨۘ\n" +
//            "ۡ۠ۘۘ\n" +
//            "ۦۨۚ\n" +
//            "۬ۥۖۘ\n" +
//            "ۥ۫ۡۘ\n" +
//            "ۢ۬۠\n" +
//            "ۢۚۘ\n" +
//            "ۜۡ\n" +
//            "۬۟ۖۘ\n" +
//            "ۙۘۥۘ\n" +
//            "ۤۡۥ\n" +
//            "۟ۢۤ\n" +
//            "۠ۤ\n" +
//            "ۖۜۚ\n" +
//            "ۨ۬ۥ\n" +
//            "ۡ۟ۘۘ\n" +
//            "۟۫ۖ\n" +
//            "ۦۤۛ\n" +
//            "۠ۢۤ\n" +
//            "ۘ۟ۦ\n" +
//            "۠ۜۜۘ\n" +
//            "۟ۜۨ\n" +
//            "ۡۖۙ\n" +
//            "ۖۖ۟\n" +
//            "ۘۜۦ\n" +
//            "۟ۙۘۘ\n" +
//            "۬ۜۧ\n" +
//            "ۚۗۗ\n" +
//            "۫۠ۙ\n" +
//            "ۙ۟ۘ\n" +
//            "ۜ۟ۨ\n" +
//            "ۖۘۘۘ\n" +
//            "۬ۗۦ\n" +
//            "ۨ۟ۜۘ\n" +
//            "۫ۢۦۘ\n" +
//            "۠ۦۜۘ\n" +
//            "ۡۦۖۘ\n" +
//            "ۤۥۙ\n" +
//            "ۘۨۚ\n" +
//            "۬ۜ۫\n" +
//            "ۤۛۙ\n" +
//            "۬ۨۥۘ\n" +
//            "ۙۢۨۘ\n" +
//            "ۖۡ\n" +
//            "ۥۢۨ\n" +
//            "ۚ۟۬\n" +
//            "۠ۘۜ\n" +
//            "ۚ۠۟\n" +
//            "ۤۡ\n" +
//            "ۨۚۗ\n" +
//            "ۢۖۛ\n" +
//            "۬ۥ۬\n" +
//            "۫۟ۜ\n" +
//            "ۡۦۢ\n" +
//            "ۗۖۡ\n" +
//            "ۨۡۜۘ\n" +
//            "۟ۘۛ\n" +
//            "ۡۦۛ\n" +
//            "ۖۜ۠\n" +
//            "ۡۙۧ\n" +
//            "۫۬ۛ\n" +
//            "ۜۜۜۘ\n" +
//            "ۨۤۦۘ\n" +
//            "ۖ۟ۡۘ\n" +
//            "ۖ۬۫\n" +
//            "ۡۦۘ\n" +
//            "۫ۛۦۘ\n" +
//            "ۧۛۨ\n" +
//            "۬۬ۥ\n" +
//            "۠ۨۚ\n" +
//            "ۚ۫ۡ\n" +
//            "ۧ۬ۖ\n" +
//            "ۖۘ۬\n" +
//            "۟ۢۦۘ\n" +
//            "۫ۦۚ\n" +
//            "ۚۜۤ\n" +
//            "ۛۜۥۘ\n" +
//            "ۖۘۖ\n" +
//            "ۨ۟۫\n" +
//            "ۜۖۨ\n" +
//            "ۨۤۜۘ\n" +
//            "ۧۖۧ\n" +
//            "ۚ۟ۦۘ\n" +
//            "ۜ۬ۦۘ\n" +
//            "ۢۧۥۘ\n" +
//            "۫ۙۦۘ\n" +
//            "ۦۥۖ\n" +
//            "ۜۛۦ\n" +
//            "ۨۤۖۘ\n" +
//            "ۘ۫ۛ\n" +
//            "ۛۤ۬\n" +
//            "ۤۨ۫\n" +
//            "ۨ۬ۘ\n" +
//            "ۡ۠ۖ\n" +
//            "۟۟ۖۘ\n" +
//            "ۜۨ\n" +
//            "ۦ۬ۜۘ\n" +
//            "ۗۜۘۘ\n" +
//            "ۦ۬ۘۘ\n" +
//            "ۙۨۨۘ\n" +
//            "ۨۧ۠\n" +
//            "ۛۢۙ\n" +
//            "۫۟ۖۘ\n" +
//            "ۡۨۡۘ\n" +
//            "ۗ۬۫\n" +
//            "۠ۖۧۘ\n" +
//            "ۨۙ۬\n" +
//            "۟ۡ۬\n" +
//            "ۡۘ۫\n" +
//            "ۘۗۘۘ\n" +
//            "ۢ۫ۖ\n" +
//            "ۙ۫ۜ\n" +
//            "ۗۛۦۘ\n" +
//            "ۤۜۖۘ\n" +
//            "۫ۥۘۘ\n" +
//            "ۙۗۗ\n" +
//            "ۢۗۘ\n" +
//            "۫ۨۖ\n" +
//            "ۖۙۡۘ\n" +
//            "۠ۡ\n" +
//            "ۥ۫ۘ\n" +
//            "ۙ۬ۦۘ\n" +
//            "ۡۗۢ\n" +
//            "ۛۥۧۘ\n" +
//            "ۙۥ۬\n" +
//            "ۘۥۘۘ\n" +
//            "ۢ۬ۗ\n" +
//            "ۙۘ۠\n" +
//            "ۜۡۚ\n" +
//            "ۢۤۦ\n" +
//            "ۢۖ۬\n" +
//            "ۖ۠ۦۘ\n" +
//            "ۢۜۛ\n" +
//            "ۥ۠ۦ\n" +
//            "ۙۖۨۘ\n" +
//            "ۤۚۥۘ\n" +
//            "۠ۢۖ\n" +
//            "ۛۗۗ\n" +
//            "ۜۙۧ\n" +
//            "ۦۧۡ\n" +
//            "۫۟ۨ\n" +
//            "ۦۛۖ\n" +
//            "ۙ۟ۤ\n" +
//            "ۢۚۡ\n" +
//            "ۧۡ۬\n" +
//            "ۙۧ۬\n" +
//            "۬ۙ\n" +
//            "ۡۢۦ\n" +
//            "۟ۢۙ\n" +
//            "ۤۘۨۘ\n" +
//            "ۘۥۛ\n" +
//            "۬ۖۢ\n" +
//            "۫ۙۘۘ\n" +
//            "ۘۧۘۘ\n" +
//            "ۜ۟ۛ\n" +
//            "۫ۢۗ\n" +
//            "ۙ۟ۨۘ\n" +
//            "ۢۗ۠\n" +
//            "ۛۙۡ\n" +
//            "ۘۘۚ\n" +
//            "ۖ۬ۘ\n" +
//            "ۤۡۡۘ\n" +
//            "ۢ۫ۜ\n" +
//            "ۢۢۜۘ\n" +
//            "ۗ۬ۧ\n" +
//            "ۛ۬ۨ\n" +
//            "ۚ۠ۤ\n" +
//            "۠ۙ۠\n" +
//            "۬ۗۖۘ\n" +
//            "۬۫ۨ\n" +
//            "۠۬ۨۘ\n" +
//            "ۧ۫۟\n" +
//            "ۢۜۧۘ\n" +
//            "ۙۧۜۘ\n" +
//            "ۗۛۥ\n" +
//            "ۥۧ۠\n" +
//            "ۚۦۡۘ\n" +
//            "ۛۡۙ\n" +
//            "ۡۨ۟\n" +
//            "۟۫\n" +
//            "ۜ۟۟\n" +
//            "ۤۙۨۘ\n" +
//            "ۖ۫ۗ\n" +
//            "۫ۨ۟\n" +
//            "ۗۦۡ\n" +
//            "ۧۜۡ\n" +
//            "۠ۙۨ\n" +
//            "ۡۥۡ\n" +
//            "ۛۘۘ\n" +
//            "ۚۥۘۘ\n" +
//            "ۨۧۛ\n" +
//            "۟ۚۛ\n" +
//            "۫۫ۡ\n" +
//            "ۙ۠ۛ\n" +
//            "ۢۧۜ\n" +
//            "ۡۤۘ\n" +
//            "۫ۥۦ\n" +
//            "ۦۨۡۘ\n" +
//            "ۚ۬۫\n" +
//            "۠ۨۛ\n" +
//            "۠ۜۨ\n" +
//            "ۢۛۤ\n" +
//            "ۤۨۗ\n" +
//            "ۜۤۥ\n" +
//            "۟ۢۨۘ\n" +
//            "۠ۙ\n" +
//            "ۙۘۤ\n" +
//            "۫ۛ\n" +
//            "ۚۖۘۘ\n" +
//            "ۘۦۧۘ\n" +
//            "۬۬ۜۘ\n" +
//            "ۗۙۛ\n" +
//            "ۦۤۨۘ\n" +
//            "ۜ۠ۦۘ\n" +
//            "ۦۦۡ\n" +
//            "ۙۖۙ\n" +
//            "ۧۡۖ\n" +
//            "ۨ۫ۘۘ\n" +
//            "ۧۨۛ\n" +
//            "۬۬ۖ\n" +
//            "ۥۙۤ\n" +
//            "ۖ۫ۛ\n" +
//            "ۨ۠ۘۘ\n" +
//            "ۙۢ۟\n" +
//            "ۙ۟ۛ\n" +
//            "ۤۧۨ\n" +
//            "ۛۙ۬\n" +
//            "ۗۦۖۘ\n" +
//            "ۦۚۘ\n" +
//            "۠ۨۡۘ\n" +
//            "۫ۨۚ\n" +
//            "ۥۛۚ\n" +
//            "ۧۨۧۘ\n" +
//            "ۘ۠ۖۘ\n" +
//            "۬ۥۤ\n" +
//            "۟ۘۨۘ\n" +
//            "ۡۗۖۘ\n" +
//            "ۖۢۦ\n" +
//            "۫ۙۘ\n" +
//            "ۤۜۨ\n" +
//            "ۦۙۚ\n" +
//            "ۛ۬ۖۘ\n" +
//            "۠ۦۡ\n" +
//            "ۘۜۘ\n" +
//            "ۛۦ\n" +
//            "ۛ۫ۜ\n" +
//            "ۚۘۧۘ\n" +
//            "۫ۦۨۘ\n" +
//            "ۤۥۡ\n" +
//            "ۡۦۥۘ\n" +
//            "ۛۤۨ\n" +
//            "۟ۗۥۘ\n" +
//            "ۖ۬ۨ\n" +
//            "ۤۢۤ\n" +
//            "۠ۦۧ\n" +
//            "۬ۡۥ\n" +
//            "ۚۖۧ\n" +
//            "ۛۤۢ\n" +
//            "ۧۗۘ\n" +
//            "۟ۛۡ\n" +
//            "۫ۨۗ\n" +
//            "۟ۗۘ\n" +
//            "ۧۨ۫\n" +
//            "۫ۜ\n" +
//            "۬ۦۡ\n" +
//            "۫۠۟\n" +
//            "ۜۖۡۘ\n" +
//            "ۤۖۜ\n" +
//            "۠ۥ۬\n" +
//            "۬ۥۦۘ\n" +
//            "ۧۙۡ\n" +
//            "ۖۚۦ\n" +
//            "ۡۤۡ\n" +
//            "ۚۜۢ\n" +
//            "ۖۚۥۘ\n" +
//            "ۖ۬ۚ\n" +
//            "ۨ۠۫\n" +
//            "ۛ۠ۜۘ\n" +
//            "ۢۘۘ\n" +
//            "ۥۡۦ\n" +
//            "ۡۨۨۘ\n" +
//            "ۧ۫ۦ\n" +
//            "ۜۡۧ\n" +
//            "ۡ۫ۦ\n" +
//            "ۙۗۨ\n" +
//            "ۡۘۙ\n" +
//            "ۡۦۦۘ\n" +
//            "۟ۛۨۘ\n" +
//            "ۡۘۥۘ\n" +
//            "۠ۨۦ\n" +
//            "۟۟۟\n" +
//            "ۗۙۚ\n" +
//            "ۤۨۥ\n" +
//            "ۖۘۦ\n" +
//            "ۨۢۜ\n" +
//            "ۖ۟ۗ\n" +
//            "ۛۛۡ\n" +
//            "ۙۖۤ\n" +
//            "۠ۛ\n" +
//            "۠ۤۘ\n" +
//            "ۘ۠ۜ\n" +
//            "۟ۨۖۘ\n" +
//            "ۖۥۥ\n" +
//            "ۙۘۨ\n" +
//            "ۡۤۦ\n" +
//            "ۦۜۡ\n" +
//            "ۥ\n" +
//            "ۛ۠ۤ\n" +
//            "ۧۙۥ\n" +
//            "ۧۥ۟\n" +
//            "۟ۢۜۘ\n" +
//            "ۛ۠ۧ\n" +
//            "۫ۘۖۘ\n" +
//            "ۥ۬ۦ\n" +
//            "ۦۙ۫\n" +
//            "۬۫ۗ\n" +
//            "ۢۡۦۘ\n" +
//            "ۖۤ۫\n" +
//            "ۜۢۤ\n" +
//            "ۛۥ۫\n" +
//            "ۡۤۨ\n" +
//            "ۘۦۖۘ\n" +
//            "ۖ۬ۥ\n" +
//            "ۨۦۨۘ\n" +
//            "ۛۧۦۘ\n" +
//            "۠ۛۖۘ\n" +
//            "ۦۥۧۘ\n" +
//            "ۜ۠ۧ\n" +
//            "۠ۙۦۘ\n" +
//            "ۗ۫ۘۘ\n" +
//            "۠ۥۡۘ\n" +
//            "ۛ۠ۡ\n" +
//            "۬ۜۘۘ\n" +
//            "ۥۙۘ\n" +
//            "۠ۡۖ\n" +
//            "ۧ۫ۡ\n" +
//            "ۙۛۜ\n" +
//            "ۨۢۤ\n" +
//            "۫ۗۗ\n" +
//            "۫۟ۥ\n" +
//            "۠ۢۙ\n" +
//            "۬ۛۘۘ\n" +
//            "ۙۥ۫\n" +
//            "ۚۖ\n" +
//            "۟ۦۖ\n" +
//            "ۙ۬ۦ\n" +
//            "۟ۢۥ\n" +
//            "ۙ۬۬\n" +
//            "۬ۜۘ\n" +
//            "ۜۥۜۘ\n" +
//            "ۘ۠ۛ\n" +
//            "ۧۤۦۘ\n" +
//            "ۧ۫ۦۘ\n" +
//            "ۛۚۚ\n" +
//            "ۤۙۙ\n" +
//            "ۥۦۥ\n" +
//            "ۤۜۥۘ\n" +
//            "ۖۘۡۘ\n" +
//            "ۧۘۘۘ\n" +
//            "۟ۧۨ\n" +
//            "ۤ۬ۜۘ\n" +
//            "۠ۜۥۘ\n" +
//            "ۤۡۖ\n" +
//            "ۖۘۦۘ\n" +
//            "ۗۤۖ\n" +
//            "ۜۜۚ\n" +
//            "۟ۚۡۘ\n" +
//            "۠۟\n" +
//            "ۥۚۗ\n" +
//            "ۛ۠ۢ\n" +
//            "ۜۜۡۘ\n" +
//            "ۜۤۦ\n" +
//            "ۗۗۤ\n" +
//            "ۨ۫ۚ\n" +
//            "ۡۛۨۘ\n" +
//            "۫ۜۧۘ\n" +
//            "ۤ۬ۤ\n" +
//            "۟ۙۧ\n" +
//            "ۛۦ۠\n" +
//            "۠ۜۖۘ\n" +
//            "۫۫ۘ\n" +
//            "ۢ۠ۡۘ\n" +
//            "ۥۤۦ\n" +
//            "ۨۤۤ\n" +
//            "ۙ۠ۡ\n" +
//            "ۢۢۘۘ\n" +
//            "ۖۤۡ\n" +
//            "ۛ۠۫\n" +
//            "ۗۥۖۘ\n" +
//            "ۧۥۘۘ\n" +
//            "ۤۙۜۘ\n" +
//            "ۘۜۖ\n" +
//            "ۚۖ۟\n" +
//            "ۚۦۛ\n" +
//            "۬۫\n" +
//            "ۡۛ۠\n" +
//            "ۤۨۦۘ\n" +
//            "ۜۘۛ\n" +
//            "ۤۜۦۘ\n" +
//            "ۢۡ۫\n" +
//            "ۢۡۦ\n" +
//            "ۨۗۥۘ\n" +
//            "ۚ۬ۘۘ\n" +
//            "۬ۦۨ\n" +
//            "۬ۤۥ\n" +
//            "۟ۛۤ\n" +
//            "ۧۡۡ\n" +
//            "ۗۦ۬\n" +
//            "۬۬۫\n" +
//            "ۡۧ۠\n" +
//            "ۧۧۘۘ\n" +
//            "ۦۧۖۘ\n" +
//            "ۥ۠۠\n" +
//            "۟ۤۚ\n" +
//            "ۛ۟ۗ\n" +
//            "ۧ۫ۥ\n" +
//            "ۖ۫ۜۘ\n" +
//            "ۗۜۖۘ\n" +
//            "ۜ۬\n" +
//            "ۖۤۥۘ\n" +
//            "ۙۖۧۘ\n" +
//            "ۥۚۦۘ\n" +
//            "ۘ۫ۦۘ\n" +
//            "ۢۘۚ\n" +
//            "ۘۗۥۘ\n" +
//            "ۤۡۥۘ\n" +
//            "ۨۤۨ\n" +
//            "ۧۛۡۘ\n" +
//            "ۡۢۜ\n" +
//            "۟ۧۥ\n" +
//            "۠ۢۦۘ\n" +
//            "۟ۢ۟\n" +
//            "ۚ۟۠\n" +
//            "ۜۜۢ\n" +
//            "۠ۗۡ\n" +
//            "ۚ۠ۜ\n" +
//            "۫۠ۛ\n" +
//            "ۜ۟۬\n" +
//            "۬ۡۖۘ\n" +
//            "ۦۤ۫\n" +
//            "۠ۙۙ\n" +
//            "ۢۦ\n" +
//            "ۚۜ\n" +
//            "ۗ\n" +
//            "ۡۥۨۘ\n" +
//            "ۦ۫ۦ\n" +
//            "ۧۘ\n" +
//            "ۛۖۖ\n" +
//            "ۙۗ\n" +
//            "ۥۨۜ\n" +
//            "ۛۘۧ\n" +
//            "ۘۨۙ\n" +
//            "ۗۚۡۘ\n" +
//            "۬ۦ۬\n" +
//            "ۖۧ\n" +
//            "۠۟ۨۘ\n" +
//            "ۜۥۥۘ\n" +
//            "ۚ۟۫\n" +
//            "ۦۧ۟\n" +
//            "۠ۖۘۘ\n" +
//            "۫ۖۢ\n" +
//            "ۢۦۦۘ\n" +
//            "ۧۥۗ\n" +
//            "ۥۖۚ\n" +
//            "ۨۢۡ\n" +
//            "۟ۡۦۘ\n" +
//            "ۗۡۚ\n" +
//            "ۗۗ\n" +
//            "ۥ۟ۦ\n" +
//            "ۗۗۢ\n" +
//            "ۦۖۚ\n" +
//            "ۤۚۜۘ\n" +
//            "ۤۚۡ\n" +
//            "ۡۖ\n" +
//            "ۤۙ\n" +
//            "۫ۢۖ\n" +
//            "ۜۙۜۘ\n" +
//            "ۥۖۦ\n" +
//            "۫ۖۡ\n" +
//            "ۖۖۘ\n" +
//            "ۘۚۚ\n" +
//            "۫ۤۢ\n" +
//            "ۨۦ۫\n" +
//            "ۨ۟ۛ\n" +
//            "ۙۜۘ\n" +
//            "ۨۨۥۘ\n" +
//            "ۧۢۖۘ\n" +
//            "ۤۥ\n" +
//            "ۡۢۚ\n" +
//            "ۛ۬۬\n" +
//            "۟ۢۧ\n" +
//            "ۚۖۚ\n" +
//            "ۦۥ۠\n" +
//            "۫۟۟\n" +
//            "ۢۢۘ\n" +
//            "ۜۗ۟\n" +
//            "ۡۧۦۘ\n" +
//            "ۡۡۖۘ\n" +
//            "۬ۜۚ\n" +
//            "ۢۘۨ\n" +
//            "ۡۨۘ\n" +
//            "ۥۡۜ\n" +
//            "ۜۦۧ\n" +
//            "ۢۤ۠\n" +
//            "ۚۧۨ\n" +
//            "۟ۤۧ\n" +
//            "۬ۘۨ\n" +
//            "ۢۖۜۘ\n" +
//            "ۚۨۗ\n" +
//            "ۢۘۘۘ\n" +
//            "ۥ۟ۧ\n" +
//            "۟ۗ۬\n" +
//            "ۚۖۧۘ\n" +
//            "ۥۥۥۘ\n" +
//            "ۧۦۛ\n" +
//            "۫ۛۘ\n" +
//            "ۤ۠ۘ\n" +
//            "ۘۧۥۘ\n" +
//            "ۨ۠ۡۘ\n" +
//            "ۥۡۨ\n" +
//            "ۘۡۦۘ\n" +
//            "ۖۘۧ\n" +
//            "۫۠ۢ\n" +
//            "ۤۥۨ\n" +
//            "ۘۛ۠\n" +
//            "ۚ۫ۦ\n" +
//            "۠ۥۧۘ\n" +
//            "ۥۡۖۘ\n" +
//            "ۥۙ۟\n" +
//            "ۢۧۜۘ\n" +
//            "ۦۦۦۘ\n" +
//            "ۡ۟ۙ\n" +
//            "ۤۙۗ\n" +
//            "ۜۙۖ\n" +
//            "۠ۢۢ\n" +
//            "ۖۙۗ\n" +
//            "ۧۜۧ\n" +
//            "ۘ۟ۖ\n" +
//            "ۦۛۘۘ\n" +
//            "ۛۙۜ\n" +
//            "ۦۚۖۘ\n" +
//            "ۤۧۚ\n" +
//            "ۥۦ۫\n" +
//            "ۚ۠ۨۘ\n" +
//            "ۤۢۘۘ\n" +
//            "ۥۥۢ\n" +
//            "۟۫ۚ\n" +
//            "ۖۤۖ\n" +
//            "۬۟۟\n" +
//            "ۘۛۖ\n" +
//            "۠ۡۧۘ\n" +
//            "ۥۗ۬\n" +
//            "۠۟ۦۘ\n" +
//            "۫ۧۖ\n" +
//            "۬ۢ۟\n" +
//            "ۢۛ۬\n" +
//            "۫ۧ۫\n" +
//            "۬ۖۘۘ\n" +
//            "ۥۧۗ\n" +
//            "ۚۚۡ\n" +
//            "۬ۡ۬\n" +
//            "ۛۧۧ\n" +
//            "۟ۛۛ\n" +
//            "ۛ۫۟\n" +
//            "ۚۨۤ\n" +
//            "ۦۙ۟\n" +
//            "ۡۢۗ\n" +
//            "ۨۦۨ\n" +
//            "ۗۢۚ\n" +
//            "۟۟ۘ\n" +
//            "ۨۗۗ\n" +
//            "ۥۦۜۘ\n" +
//            "ۛۘۡۘ\n" +
//            "ۛۨۨ\n" +
//            "ۛۚۧ\n" +
//            "۠ۚ۟\n" +
//            "ۤۙۧ\n" +
//            "ۨۜۦ\n" +
//            "ۤۤۜ\n" +
//            "ۢۖۢ\n" +
//            "ۘ۠۟\n" +
//            "ۖۖ۬\n" +
//            "۟ۧۙ\n" +
//            "ۡۛۗ\n" +
//            "ۢ۬ۦ\n" +
//            "۬ۦۙ\n" +
//            "ۗۚۘ\n" +
//            "ۛۤۖ\n" +
//            "ۛ۬ۧ\n" +
//            "ۙۡۚ\n" +
//            "ۙۜۨ\n" +
//            "ۖۗۥ\n" +
//            "ۦۡۘ\n" +
//            "ۤۜ۫\n" +
//            "ۦ۬ۥ\n" +
//            "ۦۧۛ\n" +
//            "ۤۧۖۘ\n" +
//            "ۥ۠\n" +
//            "۟ۖۢ\n" +
//            "ۙۖ۫\n" +
//            "ۙۜۤ\n" +
//            "ۥۦۗ\n" +
//            "ۚۘۧ\n" +
//            "ۡۛۖۘ\n" +
//            "ۙۦۥ\n" +
//            "ۤۙۘ\n" +
//            "ۧۧۡ\n" +
//            "۠ۤۖۘ\n" +
//            "ۢۘۗ\n" +
//            "ۡۨۦ\n" +
//            "ۚۖۜ\n" +
//            "ۙۢۥ\n" +
//            "ۛۙۗ\n" +
//            "ۨۚ۠\n" +
//            "ۘ۠\n" +
//            "ۘۘۡ\n" +
//            "ۧۨۡۘ\n" +
//            "ۡۙۥ\n" +
//            "ۜ۫۬\n" +
//            "ۨۖۦ\n" +
//            "ۘۛۥ\n" +
//            "ۚ۠\n" +
//            "ۗۤۛ\n" +
//            "ۜۗۚ\n" +
//            "ۙۤ۫\n" +
//            "ۢ۠ۥ\n" +
//            "ۛ۫ۧ\n" +
//            "ۛۧۨ\n" +
//            "۟ۥۙ\n" +
//            "ۙۤۘ\n" +
//            "۟ۦۛ\n" +
//            "ۢۢۤ\n" +
//            "ۘۖۤ\n" +
//            "ۖۨۡۘ\n" +
//            "ۖۙۨ\n" +
//            "ۙۘۡ\n" +
//            "۠ۦ۠\n" +
//            "ۙۗۧ\n" +
//            "ۡۨۜۘ\n" +
//            "ۦۡ۬\n" +
//            "ۜۚۗ\n" +
//            "ۧۢۨۘ\n" +
//            "ۧۛۖ\n" +
//            "ۤۘۚ\n" +
//            "ۡ۬۠\n" +
//            "ۢۥ۠\n" +
//            "ۖۛۥۘ\n" +
//            "ۤۦۧ\n" +
//            "ۨ۟ۨۘ\n" +
//            "ۦ۠ۤ\n" +
//            "ۡۛۤ\n" +
//            "ۨۡۘۘ\n" +
//            "۠ۚ۠\n" +
//            "ۡۥۦ\n" +
//            "ۢۗ۟\n" +
//            "ۚ۠۫\n" +
//            "۫ۘۜ\n" +
//            "ۛۖۘ\n" +
//            "ۗ۫ۘ\n" +
//            "۬۟ۧ\n" +
//            "ۧ۬ۙ\n" +
//            "ۖۦۥۘ\n" +
//            "ۖ۠ۨۘ\n" +
//            "ۦ۟ۦۘ\n" +
//            "۫۠ۡ\n" +
//            "ۖۦۥ\n" +
//            "ۤۡۛ\n" +
//            "ۤۨۢ\n" +
//            "ۥۧۚ\n" +
//            "۬\n" +
//            "ۙ۬ۤ\n" +
//            "ۧۜ۬\n" +
//            "ۜۗۖ\n" +
//            "ۦۛۨۘ\n" +
//            "ۜۧۧ\n" +
//            "ۢ۬ۘۘ\n" +
//            "ۧۗۡ\n" +
//            "ۜۖ\n" +
//            "ۖۛۚ\n" +
//            "ۗ۟ۨۘ\n" +
//            "ۙۦۦۘ\n" +
//            "ۚۘۥ\n" +
//            "ۡۢۙ\n" +
//            "ۚۡۥ\n" +
//            "ۡ۟ۖۘ\n" +
//            "ۥۚۦ\n" +
//            "ۦۖ۠\n" +
//            "ۗۥ۫\n" +
//            "ۛۖۨ\n" +
//            "ۜ۫ۜۘ\n" +
//            "۫۟ۡۘ\n" +
//            "ۦۜۜۘ\n" +
//            "۠۬ۤ\n" +
//            "۠ۘۙ\n" +
//            "ۙۨ۬\n" +
//            "ۖ۟ۖۘ\n" +
//            "ۥۤۡ\n" +
//            "۬ۡۡ\n" +
//            "ۤ۠۬\n" +
//            "ۖ۬ۦ\n" +
//            "ۢۡۜۘ\n" +
//            "۟ۛۢ\n" +
//            "ۚۥ۬\n" +
//            "ۧۖ۬\n" +
//            "ۦ۫ۜۘ\n" +
//            "ۙۡۤ\n" +
//            "ۤۙۚ\n" +
//            "ۦۘۘۘ\n" +
//            "۫ۛۨۘ\n" +
//            "ۘۘۨ\n" +
//            "۟ۧۖۘ\n" +
//            "ۤۧ۬\n" +
//            "ۡ۠۠\n" +
//            "ۤۛۖ\n" +
//            "ۚۛۖۘ\n" +
//            "۟ۤۛ\n" +
//            "ۘۙۖۘ\n" +
//            "ۛۦۤ\n" +
//            "ۗۦۦ\n" +
//            "۟ۦۖۘ\n" +
//            "ۦۘۤ\n" +
//            "ۘۛۨۘ\n" +
//            "ۛۤۘ\n" +
//            "۟ۡۗ\n" +
//            "ۢۡ۬\n" +
//            "ۡۘۛ\n" +
//            "ۗۛۘ\n" +
//            "ۨ۫ۢ\n" +
//            "ۧۦ۠\n" +
//            "ۤ۠ۡۘ\n" +
//            "ۤۦۜ\n" +
//            "ۨۥۨۘ\n" +
//            "ۥ۬ۛ\n" +
//            "ۡۨۗ\n" +
//            "ۡۧۙ\n" +
//            "ۘۙۘۘ\n" +
//            "ۛۧۘۘ\n" +
//            "ۢۦۘ\n" +
//            "ۚۨۥۘ\n" +
//            "ۥۦۦۘ\n" +
//            "ۜ۠ۡۘ\n" +
//            "ۘۨ۬\n" +
//            "ۤۡۡ\n" +
//            "ۚۦۥ\n" +
//            "۬ۥۗ\n" +
//            "ۖۢۚ\n" +
//            "۫ۡۘۘ\n" +
//            "ۥ۠ۙ\n" +
//            "۫ۤۦ\n" +
//            "ۦۥۡ\n" +
//            "ۡ۟۫\n" +
//            "ۛۡۛ\n" +
//            "ۡۢۜۘ\n" +
//            "ۗۥۧ\n" +
//            "ۤۦۨۘ\n" +
//            "ۗۛۖۘ\n" +
//            "۟ۧۦۘ\n" +
//            "ۜۖۘۘ\n" +
//            "ۚ۟ۘ\n" +
//            "ۤۧۡۘ\n" +
//            "ۗۨۖ\n" +
//            "ۖۧۡۘ\n" +
//            "۬ۡۚ\n" +
//            "ۨ۠ۚ\n" +
//            "ۖ۟ۦ\n" +
//            "ۤۖۖ\n" +
//            "۬ۢۜۘ\n" +
//            "ۦۨۨۘ\n" +
//            "ۥۥۤ\n" +
//            "ۤۡۙ\n" +
//            "ۦۘ۠\n" +
//            "ۡ۠ۡ\n" +
//            "۫۬\n" +
//            "ۗۨۡۘ\n" +
//            "ۜۚۨ\n" +
//            "۫ۙۡ\n" +
//            "۫ۥۤ\n" +
//            "ۗۥۙ\n" +
//            "ۨ۬ۖۘ\n" +
//            "ۦۗ۬\n" +
//            "۠۠ۡ\n" +
//            "ۢۨۖ\n" +
//            "۬ۜۨۘ\n" +
//            "ۧۢۗ\n" +
//            "ۚۡ۠\n" +
//            "ۢۤ\n" +
//            "ۖ۟ۚ\n" +
//            "ۚۙۚ\n" +
//            "ۧۦۥ\n" +
//            "ۛۨۡ\n" +
//            "ۗ۠ۨ\n" +
//            "ۚۚۦۘ\n" +
//            "ۥۢۥۘ\n" +
//            "ۘۚۜ\n" +
//            "۟ۢۖۘ\n" +
//            "ۗۡۧۘ\n" +
//            "ۧۛۛ\n" +
//            "ۡۦ۬\n" +
//            "ۜۥۗ\n" +
//            "۫ۥۨ\n" +
//            "ۚۖۖۘ\n" +
//            "ۥ۠ۘ\n" +
//            "۬ۗۜ\n" +
//            "۟ۚۢ\n" +
//            "ۙ۠ۨۘ\n" +
//            "ۘۘ۠\n" +
//            "ۤۗ۟\n" +
//            "ۖۥۘ\n" +
//            "ۢ۬ۘ\n" +
//            "ۚۦۘ\n" +
//            "۬ۨۚ\n" +
//            "ۙ۟ۜ\n" +
//            "۠۟ۜ\n" +
//            "۠ۡۚ\n" +
//            "ۨۡ۟\n" +
//            "۬۟\n" +
//            "ۛۛۥ\n" +
//            "ۥۦۙ\n" +
//            "ۘ۟ۢ\n" +
//            "ۗۛۚ\n" +
//            "ۥۦۤ\n" +
//            "ۥۡۧ\n" +
//            "ۛ۠۬\n" +
//            "ۚۘ\n" +
//            "۫ۨ۫\n" +
//            "ۘ۫ۖ\n" +
//            "ۗۤۜۘ\n" +
//            "ۨۤۜ\n" +
//            "ۢ۠ۘ\n" +
//            "ۦۘ۬\n" +
//            "ۚۘۖۘ\n" +
//            "ۤۥۦ\n" +
//            "ۦ۠ۗ\n" +
//            "ۗۖ\n" +
//            "۫ۜ۫\n" +
//            "ۚۜ۟\n" +
//            "ۚۢۥ\n" +
//            "ۨۘۘ\n" +
//            "ۘۦۡۘ\n" +
//            "ۧۛۤ\n" +
//            "۠ۦۨۘ\n" +
//            "۬۫ۢ\n" +
//            "۠ۥۨۘ\n" +
//            "ۧ۠ۡ\n" +
//            "ۖۙ\n" +
//            "ۙ۟ۖۘ\n" +
//            "۬ۗ۫\n" +
//            "ۥۧۦ\n" +
//            "ۗۥۧۘ\n" +
//            "ۧۤۖ\n" +
//            "ۙۜۚ\n" +
//            "ۗۗۘ\n" +
//            "ۦۜۢ\n" +
//            "۫ۢۡ\n" +
//            "ۧۙۥۘ\n" +
//            "۠ۖۦۘ\n" +
//            "ۜۡۥۘ\n" +
//            "ۥ۠ۛ\n" +
//            "ۜ۠ۢ\n" +
//            "ۖۦۤ").split("\n");
}
