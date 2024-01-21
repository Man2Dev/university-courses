/**********************************************************************/
/*   ____  ____                                                       */
/*  /   /\/   /                                                       */
/* /___/  \  /                                                        */
/* \   \   \/                                                       */
/*  \   \        Copyright (c) 2003-2009 Xilinx, Inc.                */
/*  /   /          All Right Reserved.                                 */
/* /---/   /\                                                         */
/* \   \  /  \                                                      */
/*  \___\/\___\                                                    */
/***********************************************************************/

/* This file is designed for use with ISim build 0x7708f090 */

#define XSI_HIDE_SYMBOL_SPEC true
#include "xsi.h"
#include <memory.h>
#ifdef __GNUC__
#include <stdlib.h>
#else
#include <malloc.h>
#define alloca _alloca
#endif
static const char *ng0 = "D:/Downloads/Uni Term 10/CoDes/Tamrin/CoDes_Project_Ghadimi_Hendiyani/MEM.vhd";
extern char *IEEE_P_1242562249;

int ieee_p_1242562249_sub_1657552908_1035706684(char *, char *, char *);


static void work_a_3501706103_3212880686_p_0(char *t0)
{
    char t7[16];
    char *t1;
    char *t2;
    char *t3;
    unsigned int t4;
    unsigned int t5;
    unsigned int t6;
    char *t8;
    char *t9;
    int t10;
    unsigned int t11;
    int t12;
    int t13;
    unsigned int t14;
    unsigned int t15;
    char *t16;
    char *t17;
    char *t18;
    char *t19;
    char *t20;

LAB0:    xsi_set_current_line(86, ng0);
    t1 = (t0 + 1488U);
    t2 = *((char **)t1);
    t1 = (t0 + 1032U);
    t3 = *((char **)t1);
    t4 = (5 - 5);
    t5 = (t4 * 1U);
    t6 = (0 + t5);
    t1 = (t3 + t6);
    t8 = (t7 + 0U);
    t9 = (t8 + 0U);
    *((int *)t9) = 5;
    t9 = (t8 + 4U);
    *((int *)t9) = 0;
    t9 = (t8 + 8U);
    *((int *)t9) = -1;
    t10 = (0 - 5);
    t11 = (t10 * -1);
    t11 = (t11 + 1);
    t9 = (t8 + 12U);
    *((unsigned int *)t9) = t11;
    t12 = ieee_p_1242562249_sub_1657552908_1035706684(IEEE_P_1242562249, t1, t7);
    t13 = (t12 - 0);
    t11 = (t13 * 1);
    xsi_vhdl_check_range_of_index(0, 63, 1, t12);
    t14 = (6U * t11);
    t15 = (0 + t14);
    t9 = (t2 + t15);
    t16 = (t0 + 2872);
    t17 = (t16 + 56U);
    t18 = *((char **)t17);
    t19 = (t18 + 56U);
    t20 = *((char **)t19);
    memcpy(t20, t9, 6U);
    xsi_driver_first_trans_fast_port(t16);
    t1 = (t0 + 2792);
    *((int *)t1) = 1;

LAB1:    return;
}


extern void work_a_3501706103_3212880686_init()
{
	static char *pe[] = {(void *)work_a_3501706103_3212880686_p_0};
	xsi_register_didat("work_a_3501706103_3212880686", "isim/TB_CPU2_isim_beh.exe.sim/work/a_3501706103_3212880686.didat");
	xsi_register_executes(pe);
}
