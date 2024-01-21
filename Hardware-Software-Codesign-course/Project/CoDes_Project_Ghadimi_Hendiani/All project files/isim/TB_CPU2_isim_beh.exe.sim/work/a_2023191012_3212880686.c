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
static const char *ng0 = "D:/Downloads/Uni Term 10/CoDes/Tamrin/CoDes_Project_Ghadimi_Hendiyani/REG.vhd";



static void work_a_2023191012_3212880686_p_0(char *t0)
{
    unsigned char t1;
    char *t2;
    unsigned char t3;
    char *t4;
    char *t5;
    unsigned char t6;
    unsigned char t7;
    char *t8;
    unsigned char t9;
    unsigned char t10;
    char *t11;
    char *t12;
    char *t13;
    char *t14;
    char *t15;
    unsigned int t16;
    char *t17;

LAB0:    xsi_set_current_line(19, ng0);
    t2 = (t0 + 992U);
    t3 = xsi_signal_has_event(t2);
    if (t3 == 1)
        goto LAB5;

LAB6:    t1 = (unsigned char)0;

LAB7:    if (t1 != 0)
        goto LAB2;

LAB4:
LAB3:    xsi_set_current_line(24, ng0);
    t2 = (t0 + 1832U);
    t4 = *((char **)t2);
    t2 = (t0 + 5938);
    t1 = 1;
    if (6U == 6U)
        goto LAB14;

LAB15:    t1 = 0;

LAB16:    if (t1 != 0)
        goto LAB11;

LAB13:    xsi_set_current_line(27, ng0);
    t2 = (t0 + 3720);
    t4 = (t2 + 56U);
    t5 = *((char **)t4);
    t8 = (t5 + 56U);
    t11 = *((char **)t8);
    *((unsigned char *)t11) = (unsigned char)2;
    xsi_driver_first_trans_fast_port(t2);

LAB12:    t2 = (t0 + 3560);
    *((int *)t2) = 1;

LAB1:    return;
LAB2:    xsi_set_current_line(20, ng0);
    t4 = (t0 + 1192U);
    t8 = *((char **)t4);
    t9 = *((unsigned char *)t8);
    t10 = (t9 == (unsigned char)3);
    if (t10 != 0)
        goto LAB8;

LAB10:
LAB9:    goto LAB3;

LAB5:    t4 = (t0 + 1032U);
    t5 = *((char **)t4);
    t6 = *((unsigned char *)t5);
    t7 = (t6 == (unsigned char)3);
    t1 = t7;
    goto LAB7;

LAB8:    xsi_set_current_line(21, ng0);
    t4 = (t0 + 1352U);
    t11 = *((char **)t4);
    t4 = (t0 + 3656);
    t12 = (t4 + 56U);
    t13 = *((char **)t12);
    t14 = (t13 + 56U);
    t15 = *((char **)t14);
    memcpy(t15, t11, 6U);
    xsi_driver_first_trans_fast(t4);
    goto LAB9;

LAB11:    xsi_set_current_line(25, ng0);
    t12 = (t0 + 3720);
    t13 = (t12 + 56U);
    t14 = *((char **)t13);
    t15 = (t14 + 56U);
    t17 = *((char **)t15);
    *((unsigned char *)t17) = (unsigned char)3;
    xsi_driver_first_trans_fast_port(t12);
    goto LAB12;

LAB14:    t16 = 0;

LAB17:    if (t16 < 6U)
        goto LAB18;
    else
        goto LAB16;

LAB18:    t8 = (t4 + t16);
    t11 = (t2 + t16);
    if (*((unsigned char *)t8) != *((unsigned char *)t11))
        goto LAB15;

LAB19:    t16 = (t16 + 1);
    goto LAB17;

}

static void work_a_2023191012_3212880686_p_1(char *t0)
{
    char *t1;
    char *t2;
    char *t3;
    char *t4;
    char *t5;
    char *t6;
    char *t7;

LAB0:    xsi_set_current_line(31, ng0);

LAB3:    t1 = (t0 + 1832U);
    t2 = *((char **)t1);
    t1 = (t0 + 3784);
    t3 = (t1 + 56U);
    t4 = *((char **)t3);
    t5 = (t4 + 56U);
    t6 = *((char **)t5);
    memcpy(t6, t2, 6U);
    xsi_driver_first_trans_fast_port(t1);

LAB2:    t7 = (t0 + 3576);
    *((int *)t7) = 1;

LAB1:    return;
LAB4:    goto LAB2;

}


extern void work_a_2023191012_3212880686_init()
{
	static char *pe[] = {(void *)work_a_2023191012_3212880686_p_0,(void *)work_a_2023191012_3212880686_p_1};
	xsi_register_didat("work_a_2023191012_3212880686", "isim/TB_CPU2_isim_beh.exe.sim/work/a_2023191012_3212880686.didat");
	xsi_register_executes(pe);
}
