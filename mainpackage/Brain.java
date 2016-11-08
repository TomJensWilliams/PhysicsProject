package mainpackage;

import mainpackage.ChapterTwentyThree.Ch23Center;
import mainpackage.ChapterTwentyFour.Ch24Center;
import mainpackage.ChapterTwentyNine.Ch29Center;
import mainpackage.ChapterTwentySeven.Ch27Center;
import mainpackage.ChapterThirty.Ch30Center;
import mainpackage.ChapterThirtyFour.Ch34Center;
import mainpackage.ChapterThirtyOne.Ch31Center;
import mainpackage.ChapterThirtyThree.Ch33Center;
import mainpackage.ChapterThirtyTwo.Ch32Center;
import mainpackage.ChapterTwentyEight.Ch28Center;
import mainpackage.ChapterTwentyFive.Ch25Center;
import mainpackage.ChapterTwentySix.Ch26Center;

public class Brain {

	Ch23Center ch23;
	Ch24Center ch24;
	Ch25Center ch25;
	Ch26Center ch26;
	Ch27Center ch27;
	Ch28Center ch28;
	Ch29Center ch29;
	Ch30Center ch30;
	Ch31Center ch31;
	Ch32Center ch32;
	Ch33Center ch33;
	Ch34Center ch34;
	
	public Brain(){
		ch23 = new Ch23Center();
		ch24 = new Ch24Center();
		ch25 = new Ch25Center();
		ch26 = new Ch26Center();
		ch27 = new Ch27Center();
		ch28 = new Ch28Center();
		ch29 = new Ch29Center();
		ch30 = new Ch30Center();
		ch31 = new Ch31Center();
		ch32 = new Ch32Center();
		ch33 = new Ch33Center();
		ch34 = new Ch34Center();
	}
	
	public void useExample(int chapterNumberInput, int exampleNumberInput, boolean isRandomInput){
		switch(chapterNumberInput){
		case 23:
			switch(exampleNumberInput){
			case 1:
				ch23.ch23ex1(isRandomInput);
				break;
			case 2:
				ch23.ch23ex2(isRandomInput);
				break;
			case 3:
				ch23.ch23ex3(isRandomInput);
				break;
			case 4:
				ch23.ch23ex4(isRandomInput);
				break;
			case 5:
				ch23.ch23ex5(isRandomInput);
				break;
			case 6:
				ch23.ch23ex6(isRandomInput);
				break;
			case 7:
				ch23.ch23ex7(isRandomInput);
				break;
			case 8:
				ch23.ch23ex8(isRandomInput);
				break;
			case 9:
				ch23.ch23ex9(isRandomInput);
				break;
			case 10:
				ch23.ch23ex10(isRandomInput);
				break;
			}
			break;
		case 24:
			switch(exampleNumberInput){
			case 1:
				ch24.ch24ex1(isRandomInput);
				break;
			case 2:
				ch24.ch24ex2(isRandomInput);
				break;
			case 3:
				ch24.ch24ex3(isRandomInput);
				break;
			case 4:
				ch24.ch24ex4(isRandomInput);
				break;
			case 5:
				ch24.ch24ex5(isRandomInput);
				break;
			case 6:
				ch24.ch24ex6(isRandomInput);
				break;
			case 7:
				ch24.ch24ex7(isRandomInput);
				break;
			}
			break;
		case 25:
			switch(exampleNumberInput){
			case 1:
				ch25.ch25ex1(isRandomInput);
				break;
			case 2:
				ch25.ch25ex2(isRandomInput);
				break;
			case 3:
				ch25.ch25ex3(isRandomInput);
				break;
			case 4:
				ch25.ch25ex4(isRandomInput);
				break;
			case 5:
				ch25.ch25ex5(isRandomInput);
				break;
			case 6:
				ch25.ch25ex6(isRandomInput);
				break;
			case 7:
				ch25.ch25ex7(isRandomInput);
				break;
			case 8:
				ch25.ch25ex8(isRandomInput);
				break;
			}
			break;
		case 26:
			switch(exampleNumberInput){
			case 1:
				ch26.ch26ex1(isRandomInput);
				break;
			case 2:
				ch26.ch26ex2(isRandomInput);
				break;
			case 3:
				ch26.ch26ex3(isRandomInput);
				break;
			case 4:
				ch26.ch26ex4(isRandomInput);
				break;
			case 5:
				ch26.ch26ex5(isRandomInput);
				break;
			case 6:
				ch26.ch26ex6(isRandomInput);
				break;
			case 7:
				ch26.ch26ex7(isRandomInput);
				break;
			case 8:
				ch26.ch26ex8(isRandomInput);
				break;
			}
			break;
		case 27:
			switch(exampleNumberInput){
			case 1:
				ch27.ch27ex1(isRandomInput);
				break;
			case 2:
				ch27.ch27ex2(isRandomInput);
				break;
			case 3:
				ch27.ch27ex3(isRandomInput);
				break;
			case 4:
				ch27.ch27ex4(isRandomInput);
				break;
			case 5:
				ch27.ch27ex5(isRandomInput);
				break;
			}
			break;
		case 28:
			switch(exampleNumberInput){
			case 1:
				ch28.ch28ex1(isRandomInput);
				break;
			case 2:
				ch28.ch28ex2(isRandomInput);
				break;
			case 3:
				ch28.ch28ex3(isRandomInput);
				break;
			case 4:
				ch28.ch28ex4(isRandomInput);
				break;
			case 5:
				ch28.ch28ex5(isRandomInput);
				break;
			case 6:
				ch28.ch28ex6(isRandomInput);
				break;
			case 7:
				ch28.ch28ex7(isRandomInput);
				break;
			case 8:
				ch28.ch28ex8(isRandomInput);
				break;
			case 9:
				ch28.ch28ex9(isRandomInput);
				break;
			case 10:
				ch28.ch28ex10(isRandomInput);
				break;
			case 11:
				ch28.ch28ex11(isRandomInput);
				break;
			}
			break;
		case 29:
			switch(exampleNumberInput){
			case 1:
				ch29.ch29ex1(isRandomInput);
				break;
			case 2:
				ch29.ch29ex2(isRandomInput);
				break;
			case 3:
				ch29.ch29ex3(isRandomInput);
				break;
			case 4:
				ch29.ch29ex4(isRandomInput);
				break;
			case 5:
				ch29.ch29ex5(isRandomInput);
				break;
			case 6:
				ch29.ch29ex6(isRandomInput);
				break;
			case 7:
				ch29.ch29ex7(isRandomInput);
				break;
			}
			break;
		case 30:
			switch(exampleNumberInput){
			case 1:
				ch30.ch30ex1(isRandomInput);
				break;
			case 2:
				ch30.ch30ex2(isRandomInput);
				break;
			case 3:
				ch30.ch30ex3(isRandomInput);
				break;
			case 4:
				ch30.ch30ex4(isRandomInput);
				break;
			case 5:
				ch30.ch30ex5(isRandomInput);
				break;
			case 6:
				ch30.ch30ex6(isRandomInput);
				break;
			case 7:
				ch30.ch30ex7(isRandomInput);
				break;
			}
			break;
		case 31:
			switch(exampleNumberInput){
			case 1:
				ch31.ch31ex1(isRandomInput);
				break;
			case 2:
				ch31.ch31ex2(isRandomInput);
				break;
			case 3:
				ch31.ch31ex3(isRandomInput);
				break;
			case 4:
				ch31.ch31ex4(isRandomInput);
				break;
			case 5:
				ch31.ch31ex5(isRandomInput);
				break;
			case 6:
				ch31.ch31ex6(isRandomInput);
				break;
			case 7:
				ch31.ch31ex7(isRandomInput);
				break;
			case 8:
				ch31.ch31ex8(isRandomInput);
				break;
			case 9:
				ch31.ch31ex9(isRandomInput);
				break;
			}
			break;
		case 32:
			switch(exampleNumberInput){
			case 1:
				ch32.ch32ex1(isRandomInput);
				break;
			case 2:
				ch32.ch32ex2(isRandomInput);
				break;
			case 3:
				ch32.ch32ex3(isRandomInput);
				break;
			case 4:
				ch32.ch32ex4(isRandomInput);
				break;
			case 5:
				ch32.ch32ex5(isRandomInput);
				break;
			case 6:
				ch32.ch32ex6(isRandomInput);
				break;
			}
			break;
		case 33:
			switch(exampleNumberInput){
			case 1:
				ch33.ch33ex1(isRandomInput);
				break;
			case 2:
				ch33.ch33ex2(isRandomInput);
				break;
			case 3:
				ch33.ch33ex3(isRandomInput);
				break;
			case 4:
				ch33.ch33ex4(isRandomInput);
				break;
			case 5:
				ch33.ch33ex5(isRandomInput);
				break;
			case 6:
				ch33.ch33ex6(isRandomInput);
				break;
			case 7:
				ch33.ch33ex7(isRandomInput);
				break;
			}
			break;
		case 34:
			switch(exampleNumberInput){
			case 1:
				ch34.ch34ex1(isRandomInput);
				break;
			case 2:
				ch34.ch34ex2(isRandomInput);
				break;
			case 3:
				ch34.ch34ex3(isRandomInput);
				break;
			case 4:
				ch34.ch34ex4(isRandomInput);
				break;
			case 5:
				ch34.ch34ex5(isRandomInput);
				break;
			}
			break;
		}
	}
	// THIS ONE STILL NEEDS SOME OF ITS WORK
	public void useProblem(int chapterNumberInput, int problemNumberInput, boolean isRandomInput){
		switch(chapterNumberInput){
		case 23:
			switch(problemNumberInput){
			case 3:
				ch23.ch23pr3(isRandomInput);
				break;
			case 5:
				ch23.ch23pr5(isRandomInput);
				break;
			case 13:
				ch23.ch23pr13(isRandomInput);
				break;
			case 16:
				ch23.ch23pr16(isRandomInput);
				break;
			case 18:
				ch23.ch23pr18(isRandomInput);
				break;
			case 20:
				ch23.ch23pr20(isRandomInput);
				break;
			case 22:
				ch23.ch23pr22(isRandomInput);
				break;
			case 23:
				ch23.ch23pr23(isRandomInput);
				break;
			case 26:
				ch23.ch23pr26(isRandomInput);
				break;
			case 28:
				ch23.ch23pr28(isRandomInput);
				break;
			case 29:
				ch23.ch23pr29(isRandomInput);
				break;
			case 33:
				ch23.ch23pr33(isRandomInput);
				break;
			case 34:
				ch23.ch23pr34(isRandomInput);
				break;
			case 35:
				ch23.ch23pr35(isRandomInput);
				break;
			case 37:
				ch23.ch23pr37(isRandomInput);
				break;
			case 40:
				ch23.ch23pr40(isRandomInput);
				break;
			case 41:
				ch23.ch23pr41(isRandomInput);
				break;
			case 45:
				ch23.ch23pr45(isRandomInput);
				break;
			case 47:
				ch23.ch23pr47(isRandomInput);
				break;
			case 60:
				ch23.ch23pr60(isRandomInput);
				break;
			case 62:
				ch23.ch23pr62(isRandomInput);
				break;
			case 64:
				ch23.ch23pr64(isRandomInput);
				break;
			}
			break;
		case 24:
			switch(problemNumberInput){
			case 1:
				ch24.ch24pr1(isRandomInput);
				break;
			case 3:
				ch24.ch24pr3(isRandomInput);
				break;
			case 4:
				ch24.ch24pr4(isRandomInput);
				break;
			case 5:
				ch24.ch24pr5(isRandomInput);
				break;
			case 7:
				ch24.ch24pr7(isRandomInput);
				break;
			case 10:
				ch24.ch24pr10(isRandomInput);
				break;
			case 11:
				ch24.ch24pr11(isRandomInput);
				break;
			case 18:
				ch24.ch24pr18(isRandomInput);
				break;
			case 21:
				ch24.ch24pr21(isRandomInput);
				break;
			case 27:
				ch24.ch24pr27(isRandomInput);
				break;
			case 29:
				ch24.ch24pr29(isRandomInput);
				break;
			case 31:
				ch24.ch24pr31(isRandomInput);
				break;
			case 33:
				ch24.ch24pr33(isRandomInput);
				break;
			case 39:
				ch24.ch24pr39(isRandomInput);
				break;
			case 41:
				ch24.ch24pr41(isRandomInput);
				break;
			case 44:
				ch24.ch24pr44(isRandomInput);
				break;
			case 47:
				ch24.ch24pr47(isRandomInput);
				break;
			case 51:
				ch24.ch24pr51(isRandomInput);
				break;
			case 55:
				ch24.ch24pr55(isRandomInput);
				break;
			case 57:
				ch24.ch24pr57(isRandomInput);
				break;
			}
			break;
		case 25:
			switch(problemNumberInput){
			case 1:
				ch25.ch25pr1(isRandomInput);
				break;
			case 2:
				ch25.ch25pr2(isRandomInput);
				break;
			case 5:
				ch25.ch25pr5(isRandomInput);
				break;
			case 8:
				ch25.ch25pr8(isRandomInput);
				break;
			case 9:
				ch25.ch25pr9(isRandomInput);
				break;
			case 11:
				ch25.ch25pr11(isRandomInput);
				break;
			case 15:
				ch25.ch25pr15(isRandomInput);
				break;
			case 29:
				ch25.ch25pr29(isRandomInput);
				break;
			case 31:
				ch25.ch25pr31(isRandomInput);
				break;
			case 32:
				ch25.ch25pr32(isRandomInput);
				break;
			case 34:
				ch25.ch25pr34(isRandomInput);
				break;
			case 35:
				ch25.ch25pr35(isRandomInput);
				break;
			case 39:
				ch25.ch25pr39(isRandomInput);
				break;
			case 40:
				ch25.ch25pr40(isRandomInput);
				break;
			case 49:
				ch25.ch25pr49(isRandomInput);
				break;
			case 55:
				ch25.ch25pr55(isRandomInput);
				break;
			case 60:
				ch25.ch25pr60(isRandomInput);
				break;
			case 62:
				ch25.ch25pr62(isRandomInput);
				break;
			case 63:
				ch25.ch25pr63(isRandomInput);
				break;
			case 67:
				ch25.ch25pr67(isRandomInput);
				break;
			}
			break;
		case 26:
			switch(problemNumberInput){
			case 1:
				ch26.ch26pr1(isRandomInput);
				break;
			case 2:
				ch26.ch26pr2(isRandomInput);
				break;
			case 5:
				ch26.ch26pr5(isRandomInput);
				break;
			case 6:
				ch26.ch26pr6(isRandomInput);
				break;
			case 7:
				ch26.ch26pr7(isRandomInput);
				break;
			case 8:
				ch26.ch26pr8(isRandomInput);
				break;
			case 9:
				ch26.ch26pr9(isRandomInput);
				break;
			case 10:
				ch26.ch26pr10(isRandomInput);
				break;
			case 11:
				ch26.ch26pr11(isRandomInput);
				break;
			case 12:
				ch26.ch26pr12(isRandomInput);
				break;
			case 17:
				ch26.ch26pr17(isRandomInput);
				break;
			case 19:
				ch26.ch26pr19(isRandomInput);
				break;
			case 23:
				ch26.ch26pr23(isRandomInput);
				break;
			case 25:
				ch26.ch26pr25(isRandomInput);
				break;
			case 27:
				ch26.ch26pr27(isRandomInput);
				break;
			case 29:
				ch26.ch26pr29(isRandomInput);
				break;
			case 33:
				ch26.ch26pr33(isRandomInput);
				break;
			case 40:
				ch26.ch26pr40(isRandomInput);
				break;
			case 41:
				ch26.ch26pr41(isRandomInput);
				break;
			case 47:
				ch26.ch26pr47(isRandomInput);
				break;
			case 50:
				ch26.ch26pr50(isRandomInput);
				break;
			case 52:
				ch26.ch26pr52(isRandomInput);
				break;
			case 56:
				ch26.ch26pr56(isRandomInput);
				break;
			case 60:
				ch26.ch26pr60(isRandomInput);
				break;
			case 64:
				ch26.ch26pr64(isRandomInput);
				break;
			}
			break;
		case 27:
			switch(problemNumberInput){
			case 1:
				ch27.ch27pr1(isRandomInput);
				break;
			case 4:
				ch27.ch27pr4(isRandomInput);
				break;
			case 6:
				ch27.ch27pr6(isRandomInput);
				break;
			case 9:
				ch27.ch27pr9(isRandomInput);
				break;
			case 13:
				ch27.ch27pr13(isRandomInput);
				break;
			case 17:
				ch27.ch27pr17(isRandomInput);
				break;
			case 18:
				ch27.ch27pr18(isRandomInput);
				break;
			case 21:
				ch27.ch27pr21(isRandomInput);
				break;
			case 22:
				ch27.ch27pr22(isRandomInput);
				break;
			case 26:
				ch27.ch27pr26(isRandomInput);
				break;
			case 27:
				ch27.ch27pr27(isRandomInput);
				break;
			case 31:
				ch27.ch27pr31(isRandomInput);
				break;
			case 35:
				ch27.ch27pr35(isRandomInput);
				break;
			case 38:
				ch27.ch27pr38(isRandomInput);
				break;
			case 52:
				ch27.ch27pr52(isRandomInput);
				break;
			case 54:
				ch27.ch27pr54(isRandomInput);
				break;
			case 56:
				ch27.ch27pr56(isRandomInput);
				break;
			case 57:
				ch27.ch27pr57(isRandomInput);
				break;
			case 65:
				ch27.ch27pr65(isRandomInput);
				break;
			}
			break;
		case 28:
			switch(problemNumberInput){
			case 1:
				ch28.ch28pr1(isRandomInput);
				break;
			case 2:
				ch28.ch28pr2(isRandomInput);
				break;
			case 3:
				ch28.ch28pr3(isRandomInput);
				break;
			case 7:
				ch28.ch28pr7(isRandomInput);
				break;
			case 10:
				ch28.ch28pr10(isRandomInput);
				break;
			case 13:
				ch28.ch28pr13(isRandomInput);
				break;
			case 15:
				ch28.ch28pr15(isRandomInput);
				break;
			case 16:
				ch28.ch28pr16(isRandomInput);
				break;
			case 20:
				ch28.ch28pr20(isRandomInput);
				break;
			case 21:
				ch28.ch28pr21(isRandomInput);
				break;
			case 22:
				ch28.ch28pr22(isRandomInput);
				break;
			case 24:
				ch28.ch28pr24(isRandomInput);
				break;
			case 31:
				ch28.ch28pr31(isRandomInput);
				break;
			case 32:
				ch28.ch28pr32(isRandomInput);
				break;
			case 35:
				ch28.ch28pr35(isRandomInput);
				break;
			case 40:
				ch28.ch28pr40(isRandomInput);
				break;
			case 42:
				ch28.ch28pr42(isRandomInput);
				break;
			case 45:
				ch28.ch28pr45(isRandomInput);
				break;
			case 50:
				ch28.ch28pr50(isRandomInput);
				break;
			case 53:
				ch28.ch28pr53(isRandomInput);
				break;
			case 54:
				ch28.ch28pr54(isRandomInput);
				break;
			case 55:
				ch28.ch28pr55(isRandomInput);
				break;
			case 59:
				ch28.ch28pr59(isRandomInput);
				break;
			case 61:
				ch28.ch28pr61(isRandomInput);
				break;
			}
			break;
		case 29:
			switch(problemNumberInput){
			case 5:
				ch29.ch29pr5(isRandomInput);
				break;
			case 7:
				ch29.ch29pr7(isRandomInput);
				break;
			case 8:
				ch29.ch29pr8(isRandomInput);
				break;
			case 11:
				ch29.ch29pr11(isRandomInput);
				break;
			case 16:
				ch29.ch29pr16(isRandomInput);
				break;
			case 19:
				ch29.ch29pr19(isRandomInput);
				break;
			case 21:
				ch29.ch29pr21(isRandomInput);
				break;
			case 25:
				ch29.ch29pr25(isRandomInput);
				break;
			case 26:
				ch29.ch29pr26(isRandomInput);
				break;
			case 27:
				ch29.ch29pr27(isRandomInput);
				break;
			case 31:
				ch29.ch29pr31(isRandomInput);
				break;
			case 35:
				ch29.ch29pr35(isRandomInput);
				break;
			case 41:
				ch29.ch29pr41(isRandomInput);
				break;
			case 42:
				ch29.ch29pr42(isRandomInput);
				break;
			case 46:
				ch29.ch29pr46(isRandomInput);
				break;
			case 47:
				ch29.ch29pr47(isRandomInput);
				break;
			case 49:
				ch29.ch29pr49(isRandomInput);
				break;
			case 56:
				ch29.ch29pr56(isRandomInput);
				break;
			case 58:
				ch29.ch29pr58(isRandomInput);
				break;
			case 59:
				ch29.ch29pr59(isRandomInput);
				break;
			}
			break;
		case 30:
			switch(problemNumberInput){
			case 2:
				ch30.ch30pr2(isRandomInput);
				break;
			case 3:
				ch30.ch30pr3(isRandomInput);
				break;
			case 8:
				ch30.ch30pr8(isRandomInput);
				break;
			case 14:
				ch30.ch30pr14(isRandomInput);
				break;
			case 15:
				ch30.ch30pr15(isRandomInput);
				break;
			case 17:
				ch30.ch30pr17(isRandomInput);
				break;
			case 18:
				ch30.ch30pr18(isRandomInput);
				break;
			case 27:
				ch30.ch30pr27(isRandomInput);
				break;
			case 35:
				ch30.ch30pr35(isRandomInput);
				break;
			case 36:
				ch30.ch30pr36(isRandomInput);
				break;
			case 37:
				ch30.ch30pr37(isRandomInput);
				break;
			case 39:
				ch30.ch30pr39(isRandomInput);
				break;
			case 43:
				ch30.ch30pr43(isRandomInput);
				break;
			case 45:
				ch30.ch30pr45(isRandomInput);
				break;
			case 47:
				ch30.ch30pr47(isRandomInput);
				break;
			case 53:
				ch30.ch30pr53(isRandomInput);
				break;
			case 61:
				ch30.ch30pr61(isRandomInput);
				break;
			case 63:
				ch30.ch30pr63(isRandomInput);
				break;
			case 65:
				ch30.ch30pr65(isRandomInput);
				break;
			case 66:
				ch30.ch30pr66(isRandomInput);
				break;
			case 67:
				ch30.ch30pr67(isRandomInput);
				break;
			}
			break;
		case 31:
			switch(problemNumberInput){
			case 4:
				ch31.ch31pr4(isRandomInput);
				break;
			case 5:
				ch31.ch31pr5(isRandomInput);
				break;
			case 7:
				ch31.ch31pr7(isRandomInput);
				break;
			case 14:
				ch31.ch31pr14(isRandomInput);
				break;
			case 15:
				ch31.ch31pr15(isRandomInput);
				break;
			case 16:
				ch31.ch31pr16(isRandomInput);
				break;
			case 17:
				ch31.ch31pr17(isRandomInput);
				break;
			case 20:
				ch31.ch31pr20(isRandomInput);
				break;
			case 23:
				ch31.ch31pr23(isRandomInput);
				break;
			case 24:
				ch31.ch31pr24(isRandomInput);
				break;
			case 25:
				ch31.ch31pr25(isRandomInput);
				break;
			case 27:
				ch31.ch31pr27(isRandomInput);
				break;
			case 28:
				ch31.ch31pr28(isRandomInput);
				break;
			case 29:
				ch31.ch31pr29(isRandomInput);
				break;
			case 33:
				ch31.ch31pr33(isRandomInput);
				break;
			case 37:
				ch31.ch31pr37(isRandomInput);
				break;
			case 55:
				ch31.ch31pr55(isRandomInput);
				break;
			case 56:
				ch31.ch31pr56(isRandomInput);
				break;
			case 64:
				ch31.ch31pr64(isRandomInput);
				break;
			case 66:
				ch31.ch31pr66(isRandomInput);
				break;
			case 67:
				ch31.ch31pr67(isRandomInput);
				break;
			}
			break;
		case 32:
			switch(problemNumberInput){
			case 1:
				ch32.ch32pr1(isRandomInput);
				break;
			case 2:
				ch32.ch32pr2(isRandomInput);
				break;
			case 3:
				ch32.ch32pr3(isRandomInput);
				break;
			case 4:
				ch32.ch32pr4(isRandomInput);
				break;
			case 8:
				ch32.ch32pr8(isRandomInput);
				break;
			case 9:
				ch32.ch32pr9(isRandomInput);
				break;
			case 10:
				ch32.ch32pr10(isRandomInput);
				break;
			case 11:
				ch32.ch32pr11(isRandomInput);
				break;
			case 18:
				ch32.ch32pr18(isRandomInput);
				break;
			case 21:
				ch32.ch32pr21(isRandomInput);
				break;
			case 23:
				ch32.ch32pr23(isRandomInput);
				break;
			case 24:
				ch32.ch32pr24(isRandomInput);
				break;
			case 28:
				ch32.ch32pr28(isRandomInput);
				break;
			case 30:
				ch32.ch32pr30(isRandomInput);
				break;
			case 37:
				ch32.ch32pr37(isRandomInput);
				break;
			case 40:
				ch32.ch32pr40(isRandomInput);
				break;
			case 41:
				ch32.ch32pr41(isRandomInput);
				break;
			case 44:
				ch32.ch32pr44(isRandomInput);
				break;
			case 45:
				ch32.ch32pr45(isRandomInput);
				break;
			case 49:
				ch32.ch32pr49(isRandomInput);
				break;
			case 59:
				ch32.ch32pr59(isRandomInput);
				break;
			case 61:
				ch32.ch32pr61(isRandomInput);
				break;
			case 63:
				ch32.ch32pr63(isRandomInput);
				break;
			}
			break;
		case 33:
			switch(problemNumberInput){
			case 3:
				ch33.ch33pr3(isRandomInput);
				break;
			case 4:
				ch33.ch33pr4(isRandomInput);
				break;
			case 7:
				ch33.ch33pr7(isRandomInput);
				break;
			case 9:
				ch33.ch33pr9(isRandomInput);
				break;
			case 10:
				ch33.ch33pr10(isRandomInput);
				break;
			case 11:
				ch33.ch33pr11(isRandomInput);
				break;
			case 12:
				ch33.ch33pr12(isRandomInput);
				break;
			case 15:
				ch33.ch33pr15(isRandomInput);
				break;
			case 17:
				ch33.ch33pr17(isRandomInput);
				break;
			case 19:
				ch33.ch33pr19(isRandomInput);
				break;
			case 21:
				ch33.ch33pr21(isRandomInput);
				break;
			case 24:
				ch33.ch33pr24(isRandomInput);
				break;
			case 27:
				ch33.ch33pr27(isRandomInput);
				break;
			case 40:
				ch33.ch33pr40(isRandomInput);
				break;
			case 41:
				ch33.ch33pr41(isRandomInput);
				break;
			case 42:
				ch33.ch33pr42(isRandomInput);
				break;
			case 45:
				ch33.ch33pr45(isRandomInput);
				break;
			case 46:
				ch33.ch33pr46(isRandomInput);
				break;
			case 47:
				ch33.ch33pr47(isRandomInput);
				break;
			case 50:
				ch33.ch33pr50(isRandomInput);
				break;
			case 57:
				ch33.ch33pr57(isRandomInput);
				break;
			case 58:
				ch33.ch33pr58(isRandomInput);
				break;
			case 65:
				ch33.ch33pr65(isRandomInput);
				break;
			case 68:
				ch33.ch33pr68(isRandomInput);
				break;
			}
			break;
		case 34:
			break;
		}
	}
	public void doAllExamples(int chapterNumberInput, boolean isRandomInput){
		for(int count = 0, last = numberOfExamplesInChapter(chapterNumberInput); count <= last; count++)
			useExample(chapterNumberInput, count, isRandomInput);
	}
	public void doAllProblems(int chapterNumberInput, boolean isRandomInput){
		for(int count = 0, last = numberOfProblemsInChapter(chapterNumberInput); count <= last; count++)
			useProblem(chapterNumberInput, fetchNumber(chapterNumberInput, count), isRandomInput);
	}
	public int numberOfExamplesInChapter(int chapterNumberInput){
		switch(chapterNumberInput){
		case 23:
			return 10;
		case 24:
			return 7;
		case 25:
			return 8;
		case 26:
			return 8;
		case 27:
			return 5;
		case 28:
			return 11;
		case 29:
			return 7;
		case 30:
			return 7;
		case 31:
			return 9;
		case 32:
			return 6;
		case 33:
			return 7;
		case 34:
			return 5;
		}
		return 0;
	}
	public int numberOfProblemsInChapter(int chapterNumberInput){
		switch(chapterNumberInput){
		case 23:
			return 22;
		case 24:
			return 20;
		case 25:
			return 20;
		case 26:
			return 25;
		case 27:
			return 19;
		case 28:
			return 24;
		case 29:
			return 20;
		case 30:
			return 21;
		case 31:
			return 21;
		case 32:
			return 23;
		case 33:
			return 24;
		case 34:
			return 0;
		}
		return 0;
	}
	public int fetchNumber(int chapterNumberInput, int problemNumberInput){
		switch(chapterNumberInput){
		case 23:
			switch(problemNumberInput){
			case 1:
				return 3;
			case 2:
				return 5;
			case 3:
				return 13;
			case 4:
				return 16;
			case 5:
				return 18;
			case 6:
				return 20;
			case 7:
				return 22;
			case 8:
				return 23;
			case 9:
				return 26;
			case 10:
				return 28;
			case 11:
				return 28;
			case 12:
				return 33;
			case 13:
				return 34;
			case 14:
				return 35;
			case 15:
				return 37;
			case 16:
				return 40;
			case 17:
				return 41;
			case 18:
				return 45;
			case 19:
				return 47;
			case 20:
				return 60;
			case 21:
				return 62;
			case 22:
				return 64;
			}
		case 24:
			switch(problemNumberInput){
			case 1:
				return 1;
			case 2:
				return 3;
			case 3:
				return 4;
			case 4:
				return 5;
			case 5:
				return 7;
			case 6:
				return 10;
			case 7:
				return 11;
			case 8:
				return 18;
			case 9:
				return 21;
			case 10:
				return 27;
			case 11:
				return 29;
			case 12:
				return 31;
			case 13:
				return 33;
			case 14:
				return 39;
			case 15:
				return 41;
			case 16:
				return 44;
			case 17:
				return 47;
			case 18:
				return 51;
			case 19:
				return 55;
			case 20:
				return 57;
			}
		case 25:
			switch(problemNumberInput){
			case 1:
				return 1;
			case 2:
				return 2;
			case 3:
				return 5;
			case 4:
				return 8;
			case 5:
				return 9;
			case 6:
				return 11;
			case 7:
				return 15;
			case 8:
				return 29;
			case 9:
				return 31;
			case 10:
				return 32;
			case 11:
				return 34;
			case 12:
				return 35;
			case 13:
				return 39;
			case 14:
				return 40;
			case 15:
				return 49;
			case 16:
				return 55;
			case 17:
				return 60;
			case 18:
				return 62;
			case 19:
				return 63;
			case 20:
				return 67;
			}
		case 26:
			switch(problemNumberInput){
			case 1:
				return 1;
			case 2:
				return 2;
			case 3:
				return 5;
			case 4:
				return 6;
			case 5:
				return 7;
			case 6:
				return 8;
			case 7:
				return 9;
			case 8:
				return 10;
			case 9:
				return 11;
			case 10:
				return 12;
			case 11:
				return 17;
			case 12:
				return 19;
			case 13:
				return 23;
			case 14:
				return 25;
			case 15:
				return 27;
			case 16:
				return 29;
			case 17:
				return 33;
			case 18:
				return 40;
			case 19:
				return 41;
			case 20:
				return 47;
			case 21:
				return 50;
			case 22:
				return 52;
			case 23:
				return 56;
			case 24:
				return 60;
			case 25:
				return 64;
			}
		case 27:
			switch(problemNumberInput){
			case 1:
				return 1;
			case 2:
				return 4;
			case 3:
				return 6;
			case 4:
				return 9;
			case 5:
				return 13;
			case 6:
				return 17;
			case 7:
				return 18;
			case 8:
				return 21;
			case 9:
				return 22;
			case 10:
				return 26;
			case 11:
				return 27;
			case 12:
				return 31;
			case 13:
				return 35;
			case 14:
				return 38;
			case 15:
				return 52;
			case 16:
				return 54;
			case 17:
				return 56;
			case 18:
				return 57;
			case 19:
				return 65;
			}
		case 28:
			switch(problemNumberInput){
			case 1:
				return 1;
			case 2:
				return 2;
			case 3:
				return 3;
			case 4:
				return 7;
			case 5:
				return 10;
			case 6:
				return 13;
			case 7:
				return 15;
			case 8:
				return 16;
			case 9:
				return 20;
			case 10:
				return 21;
			case 11:
				return 22;
			case 12:
				return 24;
			case 13:
				return 31;
			case 14:
				return 32;
			case 15:
				return 35;
			case 16:
				return 40;
			case 17:
				return 42;
			case 18:
				return 45;
			case 19:
				return 50;
			case 20:
				return 53;
			case 21:
				return 54;
			case 22:
				return 55;
			case 23:
				return 59;
			case 24:
				return 61;
			}
		case 29:
			switch(problemNumberInput){
			case 1:
				return 5;
			case 2:
				return 7;
			case 3:
				return 8;
			case 4:
				return 11;
			case 5:
				return 16;
			case 6:
				return 19;
			case 7:
				return 21;
			case 8:
				return 25;
			case 9:
				return 26;
			case 10:
				return 27;
			case 11:
				return 31;
			case 12:
				return 35;
			case 13:
				return 41;
			case 14:
				return 42;
			case 15:
				return 46;
			case 16:
				return 47;
			case 17:
				return 49;
			case 18:
				return 56;
			case 19:
				return 58;
			case 20:
				return 59;
			}
		case 30:
			switch(problemNumberInput){
			case 1:
				return 2;
			case 2:
				return 3;
			case 3:
				return 8;
			case 4:
				return 14;
			case 5:
				return 15;
			case 6:
				return 17;
			case 7:
				return 18;
			case 8:
				return 27;
			case 9:
				return 35;
			case 10:
				return 36;
			case 11:
				return 37;
			case 12:
				return 39;
			case 13:
				return 43;
			case 14:
				return 45;
			case 15:
				return 47;
			case 16:
				return 53;
			case 17:
				return 61;
			case 18:
				return 63;
			case 19:
				return 65;
			case 20:
				return 66;
			case 21:
				return 67;
			}
		case 31:
			switch(problemNumberInput){
			case 1:
				return 4;
			case 2:
				return 5;
			case 3:
				return 7;
			case 4:
				return 14;
			case 5:
				return 15;
			case 6:
				return 16;
			case 7:
				return 17;
			case 8:
				return 20;
			case 9:
				return 23;
			case 10:
				return 24;
			case 11:
				return 25;
			case 12:
				return 27;
			case 13:
				return 28;
			case 14:
				return 29;
			case 15:
				return 33;
			case 16:
				return 37;
			case 17:
				return 55;
			case 18:
				return 56;
			case 19:
				return 64;
			case 20:
				return 66;
			case 21:
				return 67;
			}
		case 32:
			switch(problemNumberInput){
			case 1:
				return 1;
			case 2:
				return 2;
			case 3:
				return 3;
			case 4:
				return 4;
			case 5:
				return 8;
			case 6:
				return 9;
			case 7:
				return 10;
			case 8:
				return 11;
			case 9:
				return 18;
			case 10:
				return 21;
			case 11:
				return 23;
			case 12:
				return 24;
			case 13:
				return 28;
			case 14:
				return 30;
			case 15:
				return 37;
			case 16:
				return 40;
			case 17:
				return 41;
			case 18:
				return 44;
			case 19:
				return 45;
			case 20:
				return 49;
			case 21:
				return 59;
			case 22:
				return 61;
			case 23:
				return 63;
			}
		case 33:
			switch(problemNumberInput){
			case 1:
				return 3;
			case 2:
				return 4;
			case 3:
				return 7;
			case 4:
				return 9;
			case 5:
				return 10;
			case 6:
				return 11;
			case 7:
				return 12;
			case 8:
				return 15;
			case 9:
				return 17;
			case 10:
				return 19;
			case 11:
				return 21;
			case 12:
				return 24;
			case 13:
				return 27;
			case 14:
				return 40;
			case 15:
				return 41;
			case 16:
				return 42;
			case 17:
				return 45;
			case 18:
				return 46;
			case 19:
				return 47;
			case 20:
				return 50;
			case 21:
				return 57;
			case 22:
				return 58;
			case 23:
				return 65;
			case 24:
				return 68;
			}
		case 34:
			return 0;
		}
		return 0;
	}
}
