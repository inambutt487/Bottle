package com.surendramaran.yolov8tflite

import org.tensorflow.lite.DataType

object Constants {
    const val MODEL_PATH = "best_float32.tflite"
    const val LABELS_PATH = "labels.txt"

    const val INPUT_MEAN = 0f
    const val INPUT_STANDARD_DEVIATION = 255f
    val INPUT_IMAGE_TYPE = DataType.FLOAT32
    val OUTPUT_IMAGE_TYPE = DataType.FLOAT32
    const val CONFIDENCE_THRESHOLD = 0.7F
    const val IOU_THRESHOLD = 0.5F
}
