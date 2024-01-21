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
static const char *ng0 = "C:/Users/home/Desktop/Project/k/zero_extend.vhd";
extern char *IEEE_P_2592010699;



static void work_a_3105827084_3212880686_p_0(char *t0)
{
    char t6[16];
    char t8[16];
    char t13[16];
    char t18[16];
    char *t1;
    char *t3;
    char *t5;
    char *t7;
    char *t9;
    char *t10;
    int t11;
    unsigned int t12;
    char *t14;
    int t15;
    char *t16;
    unsigned char t17;
    char *t19;
    unsigned int t20;
    unsigned char t21;
    char *t22;
    char *t23;
    char *t24;
    char *t25;
    char *t26;
    char *t27;

LAB0:    xsi_set_current_line(13, ng0);

LAB3:    t1 = (t0 + 4313);
    t3 = (t0 + 4341);
    t7 = ((IEEE_P_2592010699) + 4024);
    t9 = (t8 + 0U);
    t10 = (t9 + 0U);
    *((int *)t10) = 0;
    t10 = (t9 + 4U);
    *((int *)t10) = 27;
    t10 = (t9 + 8U);
    *((int *)t10) = 1;
    t11 = (27 - 0);
    t12 = (t11 * 1);
    t12 = (t12 + 1);
    t10 = (t9 + 12U);
    *((unsigned int *)t10) = t12;
    t10 = (t13 + 0U);
    t14 = (t10 + 0U);
    *((int *)t14) = 0;
    t14 = (t10 + 4U);
    *((int *)t14) = 2;
    t14 = (t10 + 8U);
    *((int *)t14) = 1;
    t15 = (2 - 0);
    t12 = (t15 * 1);
    t12 = (t12 + 1);
    t14 = (t10 + 12U);
    *((unsigned int *)t14) = t12;
    t5 = xsi_base_array_concat(t5, t6, t7, (char)97, t1, t8, (char)97, t3, t13, (char)101);
    t14 = (t0 + 1032U);
    t16 = *((char **)t14);
    t17 = *((unsigned char *)t16);
    t19 = ((IEEE_P_2592010699) + 4024);
    t14 = xsi_base_array_concat(t14, t18, t19, (char)97, t5, t6, (char)99, t17, (char)101);
    t12 = (28U + 3U);
    t20 = (t12 + 1U);
    t21 = (32U != t20);
    if (t21 == 1)
        goto LAB5;

LAB6:    t22 = (t0 + 2752);
    t23 = (t22 + 56U);
    t24 = *((char **)t23);
    t25 = (t24 + 56U);
    t26 = *((char **)t25);
    memcpy(t26, t14, 32U);
    xsi_driver_first_trans_fast_port(t22);

LAB2:    t27 = (t0 + 2672);
    *((int *)t27) = 1;

LAB1:    return;
LAB4:    goto LAB2;

LAB5:    xsi_size_not_matching(32U, t20, 0);
    goto LAB6;

}


extern void work_a_3105827084_3212880686_init()
{
	static char *pe[] = {(void *)work_a_3105827084_3212880686_p_0};
	xsi_register_didat("work_a_3105827084_3212880686", "isim/MIPS_isim_beh.exe.sim/work/a_3105827084_3212880686.didat");
	xsi_register_executes(pe);
}
