from sklearn.utils import shuffle
import numpy as np
import os
import cv2
import queue


def read_image(path):
    image = cv2.imread(path)
    image = cv2.resize(image, (32, 32))
    image = cv2.cvtColor(image, cv2.COLOR_BGR2RGB)
    normalizer_image = image / 255.0 - 0.5
    return normalizer_image


def read_traffic_light(training=True):
    traffic_light_dir = "traffic_light_images/"
    if training:
        red = traffic_light_dir + "training/red/"
        yellow = traffic_light_dir + "training/yellow/"
        green = traffic_light_dir + "training/green/"


    images = queue.Queue()
    labels = queue.Queue()
    image_name = queue.Queue()

    for f in os.listdir(red):
        images.put(read_image(red + f))
        labels.put(0)
        image_name.put(f)


    for f in os.listdir(yellow):
        images.put(read_image(yellow + f))
        labels.put(1)
        image_name.put(f)

    for f in os.listdir(green):
        images.put(read_image(green + f))
        labels.put(2)
        image_name.put(f)

    print(image_name.queue)
if __name__ == '__main__':
    read_traffic_light(True)