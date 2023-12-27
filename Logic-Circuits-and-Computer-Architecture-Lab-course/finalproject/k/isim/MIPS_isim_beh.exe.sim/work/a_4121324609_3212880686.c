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
static const char *ng0 = "C:/Users/home/Desktop/Project/k/alu_sum_res.vhd";
extern char *IEEE_P_3620187407;
extern char *IEEE_P_2592010699;

char *ieee_p_3620187407_sub_674691591_3965413181(char *, char *, char *, char *, unsigned char );
char *ieee_p_3620187407_sub_767668596_3965413181(char *, char *, char *, char *, char *, char *);


static void work_a_4121324609_3212880686_p_0(char *t0)
{
    char t1[16];
    char t2[16];
    char t7[16];
    char t9[16];
    char t18[16];
    char t20[16];
    char *t3;
    char *t5;
    char *t6;
    char *t8;
    char *t10;
    char *t11;
    int t12;
    unsigned int t13;
    char *t14;
    char *t16;
    char *t17;
    char *t19;
    char *t21;
    char *t22;
    int t23;
    char *t24;
    char *t25;
    char *t26;
    unsigned char t27;
    char *t28;
    unsigned int t29;
    unsigned char t30;
    char *t31;
    char *t32;
    char *t33;
    char *t34;
    char *t35;
    char *t36;

LAB0:    xsi_set_current_line(18, ng0);

LAB3:    t3 = (t0 + 6094);
    t5 = (t0 + 1192U);
    t6 = *((char **)t5);
    t8 = ((IEEE_P_2592010699) + 4024);
    t10 = (t9 + 0U);
    t11 = (t10 + 0U);
    *((int *)t11) = 0;
    t11 = (t10 + 4U);
    *((int *)t11) = 0;
    t11 = (t10 + 8U);
    *((int *)t11) = 1;
    t12 = (0 - 0);
    t13 = (t12 * 1);
    t13 = (t13 + 1);
    t11 = (t10 + 12U);
    *((unsigned int *)t11) = t13;
    t11 = (t0 + 5924U);
    t5 = xsi_base_array_concat(t5, t7, t8, (char)97, t3, t9, (char)97, t6, t11, (char)101);
    t14 = (t0 + 6095);
    t16 = (t0 + 1352U);
    t17 = *((char **)t16);
    t19 = ((IEEE_P_2592010699) + 4024);
    t21 = (t20 + 0U);
    t22 = (t21 + 0U);
    *((int *)t22) = 0;
    t22 = (t21 + 4U);
    *((int *)t22) = 0;
    t22 = (t21 + 8U);
    *((int *)t22) = 1;
    t23 = (0 - 0);
    t13 = (t23 * 1);
    t13 = (t13 + 1);
    t22 = (t21 + 12U);
    *((unsigned int *)t22) = t13;
    t22 = (t0 + 5940U);
    t16 = xsi_base_array_concat(t16, t18, t19, (char)97, t14, t20, (char)97, t17, t22, (char)101);
    t24 = ieee_p_3620187407_sub_767668596_3965413181(IEEE_P_3620187407, t2, t5, t7, t16, t18);
    t25 = (t0 + 1032U);
    t26 = *((char **)t25);
    t27 = *((unsigned char *)t26);
    t25 = ieee_p_3620187407_sub_674691591_3965413181(IEEE_P_3620187407, t1, t24, t2, t27);
    t28 = (t1 + 12U);
    t13 = *((unsigned int *)t28);
    t29 = (1U * t13);
    t30 = (33U != t29);
    if (t30 == 1)
        goto LAB5;

LAB6:    t31 = (t0 + 3920);
    t32 = (t31 + 56U);
    t33 = *((char **)t32);
    t34 = (t33 + 56U);
    t35 = *((char **)t34);
    memcpy(t35, t25, 33U);
    xsi_driver_first_trans_fast(t31);

LAB2:    t36 = (t0 + 3808);
    *((int *)t36) = 1;

LAB1:    return;
LAB4:    goto LAB2;

LAB5:    xsi_size_not_matching(33U, t29, 0);
    goto LAB6;

}

static void work_a_4121324609_3212880686_p_1(char *t0)
{
    char *t1;
    char *t2;
    unsigned int t3;
    unsigned int t4;
    unsigned int t5;
    char *t6;
    char *t7;
    char *t8;
    char *t9;
    char *t10;
    char *t11;

LAB0:    xsi_set_current_line(19, ng0);

LAB3:    t1 = (t0 + 1832U);
    t2 = *((char **)t1);
    t3 = (32 - 31);
    t4 = (t3 * 1U);
    t5 = (0 + t4);
    t1 = (t2 + t5);
    t6 = (t0 + 3984);
    t7 = (t6 + 56U);
    t8 = *((char **)t7);
    t9 = (t8 + 56U);
    t10 = *((char **)t9);
    memcpy(t10, t1, 32U);
    xsi_driver_first_trans_fast_port(t6);

LAB2:    t11 = (t0 + 3824);
    *((int *)t11) = 1;

LAB1:    return;
LAB4:    goto LAB2;

}

static void work_a_4121324609_3212880686_p_2(char *t0)
{
    char *t1;
    char *t2;
    int t3;
    unsigned int t4;
    unsigned int t5;
    unsigned int t6;
    unsigned char t7;
    char *t8;
    char *t9;
    char *t10;
    char *t11;
    char *t12;
    char *t13;

LAB0:    xsi_set_current_line(20, ng0);

LAB3:    t1 = (t0 + 1832U);
    t2 = *((char **)t1);
    t3 = (32 - 32);
    t4 = (t3 * -1);
    t5 = (1U * t4);
    t6 = (0 + t5);
    t1 = (t2 + t6);
    t7 = *((unsigned char *)t1);
    t8 = (t0 + 4048);
    t9 = (t8 + 56U);
    t10 = *((char **)t9);
    t11 = (t10 + 56U);
    t12 = *((char **)t11);
    *((unsigned char *)t12) = t7;
    xsi_driver_first_trans_fast_port(t8);

LAB2:    t13 = (t0 + 3840);
    *((int *)t13) = 1;

LAB1:    return;
LAB4:    goto LAB2;

}


extern void work_a_4121324609_3212880686_init()
{
	static char *pe[] = {(void *)work_a_4121324609_3212880686_p_0,(void *)work_a_4121324609_3212880686_p_1,(void *)work_a_4121324609_3212880686_p_2};
	xsi_register_didat("work_a_4121324609_3212880686", "isim/MIPS_isim_beh.exe.sim/work/a_4121324609_3212880686.didat");
	xsi_register_executes(pe);
}
