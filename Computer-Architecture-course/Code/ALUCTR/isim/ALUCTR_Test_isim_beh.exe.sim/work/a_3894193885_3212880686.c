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
static const char *ng0 = "E:/Xilinx/Computer Architecture Lab/Project/ALUCTR/ALUCTR.vhd";



static void work_a_3894193885_3212880686_p_0(char *t0)
{
    char *t1;
    char *t2;
    char *t3;
    int t4;
    char *t5;
    char *t6;
    int t7;
    char *t8;
    char *t9;
    int t10;
    char *t11;
    char *t12;
    char *t13;
    char *t14;
    char *t15;
    char *t16;
    char *t17;
    unsigned char t18;
    unsigned int t19;

LAB0:    xsi_set_current_line(44, ng0);
    t1 = (t0 + 1032U);
    t2 = *((char **)t1);
    t1 = (t0 + 4660);
    t4 = xsi_mem_cmp(t1, t2, 2U);
    if (t4 == 1)
        goto LAB3;

LAB7:    t5 = (t0 + 4662);
    t7 = xsi_mem_cmp(t5, t2, 2U);
    if (t7 == 1)
        goto LAB4;

LAB8:    t8 = (t0 + 4664);
    t10 = xsi_mem_cmp(t8, t2, 2U);
    if (t10 == 1)
        goto LAB5;

LAB9:
LAB6:    xsi_set_current_line(57, ng0);
    t1 = (t0 + 4694);
    t3 = (t0 + 2912);
    t5 = (t3 + 56U);
    t6 = *((char **)t5);
    t8 = (t6 + 56U);
    t9 = *((char **)t8);
    memcpy(t9, t1, 4U);
    xsi_driver_first_trans_fast_port(t3);

LAB2:    t1 = (t0 + 2832);
    *((int *)t1) = 1;

LAB1:    return;
LAB3:    xsi_set_current_line(46, ng0);
    t11 = (t0 + 4666);
    t13 = (t0 + 2912);
    t14 = (t13 + 56U);
    t15 = *((char **)t14);
    t16 = (t15 + 56U);
    t17 = *((char **)t16);
    memcpy(t17, t11, 4U);
    xsi_driver_first_trans_fast_port(t13);
    goto LAB2;

LAB4:    xsi_set_current_line(48, ng0);
    t1 = (t0 + 4670);
    t3 = (t0 + 2912);
    t5 = (t3 + 56U);
    t6 = *((char **)t5);
    t8 = (t6 + 56U);
    t9 = *((char **)t8);
    memcpy(t9, t1, 4U);
    xsi_driver_first_trans_fast_port(t3);
    goto LAB2;

LAB5:    xsi_set_current_line(50, ng0);
    t1 = (t0 + 1192U);
    t2 = *((char **)t1);
    t1 = (t0 + 4674);
    t18 = 1;
    if (6U == 6U)
        goto LAB14;

LAB15:    t18 = 0;

LAB16:    if (t18 != 0)
        goto LAB11;

LAB13:    xsi_set_current_line(52, ng0);
    t1 = (t0 + 1192U);
    t2 = *((char **)t1);
    t1 = (t0 + 4684);
    t18 = 1;
    if (6U == 6U)
        goto LAB23;

LAB24:    t18 = 0;

LAB25:    if (t18 != 0)
        goto LAB20;

LAB22:
LAB21:
LAB12:    goto LAB2;

LAB10:;
LAB11:    xsi_set_current_line(51, ng0);
    t8 = (t0 + 4680);
    t11 = (t0 + 2912);
    t12 = (t11 + 56U);
    t13 = *((char **)t12);
    t14 = (t13 + 56U);
    t15 = *((char **)t14);
    memcpy(t15, t8, 4U);
    xsi_driver_first_trans_fast_port(t11);
    goto LAB12;

LAB14:    t19 = 0;

LAB17:    if (t19 < 6U)
        goto LAB18;
    else
        goto LAB16;

LAB18:    t5 = (t2 + t19);
    t6 = (t1 + t19);
    if (*((unsigned char *)t5) != *((unsigned char *)t6))
        goto LAB15;

LAB19:    t19 = (t19 + 1);
    goto LAB17;

LAB20:    xsi_set_current_line(53, ng0);
    t8 = (t0 + 4690);
    t11 = (t0 + 2912);
    t12 = (t11 + 56U);
    t13 = *((char **)t12);
    t14 = (t13 + 56U);
    t15 = *((char **)t14);
    memcpy(t15, t8, 4U);
    xsi_driver_first_trans_fast_port(t11);
    goto LAB21;

LAB23:    t19 = 0;

LAB26:    if (t19 < 6U)
        goto LAB27;
    else
        goto LAB25;

LAB27:    t5 = (t2 + t19);
    t6 = (t1 + t19);
    if (*((unsigned char *)t5) != *((unsigned char *)t6))
        goto LAB24;

LAB28:    t19 = (t19 + 1);
    goto LAB26;

}


extern void work_a_3894193885_3212880686_init()
{
	static char *pe[] = {(void *)work_a_3894193885_3212880686_p_0};
	xsi_register_didat("work_a_3894193885_3212880686", "isim/ALUCTR_Test_isim_beh.exe.sim/work/a_3894193885_3212880686.didat");
	xsi_register_executes(pe);
}
