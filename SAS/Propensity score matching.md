# Propensity score matching



- ##### SAS 코드

```sas
ODS GRAPHICS ON;
PROC PSMATCH DATA=데이터 REGION= ;
	CLASS 바이너리 변수;
	PSMODEL ;
	MATCH METHOD=GREEDY(K=2)  ;
	ASSESS  ;
	OUTPUT OUT(OBS=MATCH)=OUT_MATCH MATCHIID=_MATCHID;
RUN;
```



- nearest neighbor matching

```sas
ods graphics on;
proc psmatch data=School region=treated;
    class Music Gender;
    psmodel Music(Treated='Yes')= Gender Absence;
    match method=greedy(k=1) exact=Gender caliper=0.5;
    assess lps var=(Gender Absence) / plots=all weight=none;
    output out(obs=match)=OutEx4 matchid=_MatchID;
run;

```

