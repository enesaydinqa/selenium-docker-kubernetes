package com;

import com.base.BaseTest;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;

import java.io.IOException;

@Execution(ExecutionMode.CONCURRENT)
@Tag("SampleTest")
public class SahibindenDemo extends BaseTest
{
    @Test
    public void test() throws InterruptedException, IOException
    {
        Thread.sleep(1000);
        driver.get("https://www.sahibinden.com/");
        Thread.sleep(10000);

        takeSnapShot(driver, String.format("images/%s.png", Thread.currentThread().hashCode()));
    }

    @Test
    void test2() throws InterruptedException, IOException
    {
        Thread.sleep(1000);
        driver.get("https://www.sahibinden.com/");
        Thread.sleep(10000);

        takeSnapShot(driver, String.format("images/%s.png", Thread.currentThread().hashCode()));
    }

    @Test
    void test3() throws InterruptedException, IOException
    {
        Thread.sleep(1000);
        driver.get("https://www.sahibinden.com/");
        Thread.sleep(10000);

        takeSnapShot(driver, String.format("images/%s.png", Thread.currentThread().hashCode()));
    }

    @Test
    void test4() throws InterruptedException, IOException
    {
        Thread.sleep(1000);
        driver.get("https://www.sahibinden.com/");
        Thread.sleep(10000);

        takeSnapShot(driver, String.format("images/%s.png", Thread.currentThread().hashCode()));
    }

    @Test
    void test5() throws InterruptedException, IOException
    {
        Thread.sleep(1000);
        driver.get("https://www.sahibinden.com/");
        Thread.sleep(10000);

        takeSnapShot(driver, String.format("images/%s.png", Thread.currentThread().hashCode()));
    }

    @Test
    void test6() throws InterruptedException, IOException
    {
        Thread.sleep(1000);
        driver.get("https://www.sahibinden.com/");
        Thread.sleep(10000);

        takeSnapShot(driver, String.format("images/%s.png", Thread.currentThread().hashCode()));
    }
}
