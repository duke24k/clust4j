package com.clust4j.data;

abstract class ToyMoonsLoader {
	final static DataSet load() {
		return new DataSet(
			getData(),
			getTarget(),
			getHeaders()
		);
	}
	
	final static String[] getHeaders() {
		return new String[]{
			"X1","X2","X3"
		};
	}
	
	
	final static double[][] getData() {
		return new double[][]{
			new double[]{ 1.58202308, -0.44581483, 0.461456005899927},
			new double[]{ 0.0660451 ,  0.4392075 , 0.48033150846168127},
			new double[]{ 0.73663111, -0.39896339, 0.5016944287816578},
			new double[]{-1.05692838,  0.2424558 , 0.025548093693374765},
			new double[]{-0.80216162,  0.20271838, -9.696418260110245E-4},
			new double[]{-0.70641308,  0.77076218, -0.040819381366082326},
			new double[]{ 0.2053884 ,  0.81875305, 0.012355448716954945},
			new double[]{ 1.37804958, -0.44658032, 0.4570421740717151},
			new double[]{ 0.8481931 ,  0.67172277, 0.018761929333169516},
			new double[]{ 0.92202981, -0.08438964, 0.05511566060899595},
			new double[]{ 0.38972996,  0.81785686, -0.013271949857025199},
			new double[]{-0.33031615,  0.9271263 , -0.0040772879274582575},
			new double[]{ 1.1673298 , -0.5978882 , 0.48446361667411997},
			new double[]{-0.59659735,  0.89753707, -0.0039490846915347854},
			new double[]{ 1.92535861,  0.1831877 , 0.5237265233845662},
			new double[]{ 1.12958691,  0.33602789, 0.01347769266317043},
			new double[]{ 1.12532895, -0.40571607, 0.5317905946186465},
			new double[]{ 1.09856769, -0.51879837, 0.5377206028758259},
			new double[]{ 0.57010693,  0.6727978 , 0.02684595995870433},
			new double[]{-0.30851921,  0.89344338, -0.012739910553422036},
			new double[]{-0.02646004,  0.14891397, 0.4774792048417454},
			new double[]{ 1.83385428, -0.17380486, 0.5271352306614542},
			new double[]{-0.01103091,  0.86424669, -0.008020685267760671},
			new double[]{-0.98799936,  0.38321942, 0.04278627740653426},
			new double[]{ 0.52363988, -0.14410208, 0.4789832039077701},
			new double[]{ 0.46249008,  0.91166069, 0.029023152205464583},
			new double[]{-0.90469417,  0.49415615, -0.05650095052538478},
			new double[]{ 2.01169144,  0.16298968, 0.5161268703966588},
			new double[]{ 0.77181427,  0.53088762, 0.024513413930970923},
			new double[]{ 0.7557984 , -0.56943072, 0.514427106415484},
			new double[]{ 0.87011866,  0.74872708, -0.009460533054167376},
			new double[]{-1.03596662,  0.11946065, -0.01860011084159777},
			new double[]{ 1.74719141, -0.42447937, 0.5041385367354987},
			new double[]{-0.18871867,  1.17238503, 0.00417938499828562},
			new double[]{ 2.12342023, -0.06925813, 0.5095632772320308},
			new double[]{ 0.87279305,  0.33197416, -0.05067460652920337},
			new double[]{ 0.34941974, -0.42196743, 0.47900310287792686},
			new double[]{ 0.41415424, -0.1800401 , 0.5043982314559731},
			new double[]{-0.62803007,  0.80352516, 0.027413936246808546},
			new double[]{ 0.56963494,  0.90949163, -0.03325105297462513},
			new double[]{-0.99719005, -0.11970871, 0.019918161126587387},
			new double[]{-0.49314938,  0.8633212 , 0.01085725870255553},
			new double[]{ 0.79129364,  0.36565358, 0.03001018859128761},
			new double[]{ 2.05604602,  0.30689373, 0.5312987516994581},
			new double[]{-0.23162969,  0.96018841, 0.025973664079565913},
			new double[]{ 0.33101883,  1.0001688 , -3.9043596243993673E-4},
			new double[]{ 1.52967741, -0.40784771, 0.5232863069979419},
			new double[]{ 0.08486919,  1.08681791, -0.03866177831991935},
			new double[]{ 0.30221566, -0.34003089, 0.4558988013978671},
			new double[]{ 0.5695298 ,  0.81440206, -0.015871091967215947},
			new double[]{-0.13900138,  1.01138407, 0.012594356515265413},
			new double[]{ 1.08160772,  0.20640071, 0.011801948250718257},
			new double[]{ 0.40239857,  0.80193787, -0.00660753223320782},
			new double[]{-0.67983069,  0.69539912, -7.01426419135211E-4},
			new double[]{ 0.84276977,  0.5972468 , -0.01863302017839621},
			new double[]{ 1.30792071, -0.29606853, 0.5003447784398866},
			new double[]{ 0.98360616,  0.35881696, 0.043033212472468274},
			new double[]{ 0.3622111 , -0.4752885 , 0.5148633256905396},
			new double[]{-0.65723499,  0.7387065 , 0.010678335067304172},
			new double[]{ 1.66840622, -0.10063929, 0.5056011926771704},
			new double[]{ 0.20740006,  0.05127823, 0.44018996339058114},
			new double[]{ 1.90401054,  0.61049282, 0.48497470396663395},
			new double[]{ 0.09612917,  0.55245494, 0.49979582010576856},
			new double[]{-1.05877377,  0.44730573, -0.012310413493544779},
			new double[]{ 0.03158909,  0.50592813, 0.49418259738498305},
			new double[]{ 0.62851293, -0.38957184, 0.5608829288648528},
			new double[]{-1.17519678,  0.10642288, -0.0135512284018564},
			new double[]{ 0.73166   , -0.29720973, 0.48912768297010306},
			new double[]{ 0.20124212, -0.09786869, 0.46170341837732726},
			new double[]{ 2.27018382,  0.36900416, 0.47076081779695633},
			new double[]{ 1.28336925, -0.43960798, 0.46825630386524675},
			new double[]{-0.81062113,  0.45582743, -0.0050324996727113235},
			new double[]{ 0.18929423, -0.18514051, 0.5007330787905698},
			new double[]{-0.96430552,  0.0691332 , 0.030662499128287515},
			new double[]{ 1.9761997 ,  0.38840405, 0.5044884825322691},
			new double[]{ 0.03809379, -0.01523585, 0.4891019971825738},
			new double[]{ 0.80024475, -0.52628805, 0.4691240774306391},
			new double[]{-0.35290531,  0.8530582 , -0.007363439571049678},
			new double[]{ 2.012567  ,  0.07687169, 0.4919322998805197},
			new double[]{ 0.03134214, -0.12061109, 0.4911806163003514},
			new double[]{ 0.22514912, -0.35858196, 0.464833629226306},
			new double[]{ 1.61709406, -0.14227982, 0.5317879677993737},
			new double[]{-0.78504369,  0.52650072, -0.006909477612671307},
			new double[]{-0.21884785,  0.81507777, -0.002840210842709549},
			new double[]{ 0.87961883,  0.11356979, -0.006281624227210913},
			new double[]{-0.00832098,  0.30340532, 0.508490714872926},
			new double[]{ 0.22935606,  0.93398703, 0.0030383977268663275},
			new double[]{ 1.18074478,  0.06029669, -0.005990764548206678},
			new double[]{ 0.00468177,  0.9498758 , -0.009488988763470284},
			new double[]{ 1.67707319, -0.13611819, 0.5087618343002979},
			new double[]{ 1.67216493,  0.05188503, 0.5032698717396054},
			new double[]{ 0.91381988, -0.42180392, 0.4913275371009407},
			new double[]{ 1.66753652, -0.18840855, 0.49143850081015183},
			new double[]{ 1.42339811, -0.34279705, 0.47685015769047245},
			new double[]{ 0.45090457,  0.88474421, -0.04629238018177751},
			new double[]{ 0.18786693, -0.14673226, 0.46690268404353463},
			new double[]{ 0.93677725, -0.51832207, 0.4819408121916641},
			new double[]{ 0.55022058,  0.72400379, -0.02463284578142423},
			new double[]{ 1.88739713, -0.01323424, 0.47719537764017994},
			new double[]{-0.03479039,  0.45164997, 0.43882366547413054}
		};
	}
	
	final static int[] getTarget() {
		return new int[]{
		    1, 1, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 1, 0, 1, 1, 0, 0, 1, 1, 0,
	        0, 1, 0, 0, 1, 0, 1, 0, 0, 1, 0, 1, 0, 1, 1, 0, 0, 0, 0, 0, 1, 0, 0,
	        1, 0, 1, 0, 0, 0, 0, 0, 0, 1, 0, 1, 0, 1, 1, 1, 1, 0, 1, 1, 0, 1, 1,
	        1, 1, 0, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1, 1, 1,
	        1, 1, 0, 1, 1, 0, 1, 1
		};
	}
}